import pandas as pd
#from google.colab import files -> for colab environment
from sklearn.model_selection import train_test_split
from xgboost import XGBRegressor
from sklearn.model_selection import RandomizedSearchCV
import numpy as np
from sklearn.metrics import r2_score
from sklearn.metrics import mean_squared_error

x_train_path=list(files.upload().keys())[0] #for colab environment
# x_train_path= /data/ENB2012_data.csv
x_train_full=pd.read_csv(x_train_path)

x_train_full.columns=["Relative Compactness","Surface Area","Wall Area",
                      "Roof Area","Overall Height","Orientation","Glazing Area",
                      "Glazing Area Distribution","Heating Load","Cooling Load"]

y_heating=x_train_full["Heating Load"]
x_train_full.drop(columns=["Heating Load"],inplace=True)

y_cooling=x_train_full["Cooling Load"]
x_train_full.drop(columns=["Cooling Load"],inplace=True)



x_training_heating, x_valid_heating, y_training_heating, y_valid_heating = \
  train_test_split(x_train_full, y_heating, test_size=0.2)

x_training_cooling, x_valid_cooling, y_training_cooling, y_valid_cooling = \
  train_test_split(x_train_full, y_cooling, test_size=0.2)

model_xgb = XGBRegressor()

gbm_param_grid = {
    'xgb_model__learning_rate': np.arange(.01, 1, .01),
    'xgb_model__max_depth': np.arange(1,21, 1),
    'xgb_model__n_estimators': np.arange(50, 1000, 10),
    'xgb_model__subsample': np.arange(.05, 1, .05),
    'xgb_model__colsample_bytree': np.arange(.1,1.05,.05)
}

randomized_neg_mse = RandomizedSearchCV(estimator=model_xgb,
                                        param_distributions=gbm_param_grid,
                                        n_iter=10, scoring='neg_mean_squared_error', cv=5,
                                        n_jobs=-1,verbose=10)

randomized_neg_mse.fit(x_training_heating, y_training_heating)
randomized_neg_mse.fit(x_training_cooling, y_training_cooling)

predict_xgb_heating=randomized_neg_mse.predict(x_valid_heating)
predict_xgb_cooling=randomized_neg_mse.predict(x_valid_cooling)

print("Heating r^2 score: ",r2_score(y_valid_heating,predict_xgb_heating))
print("Cooling r^2 score: ",r2_score(y_valid_cooling,predict_xgb_cooling))
print("Heating mse score: ",mean_squared_error(y_valid_heating,predict_xgb_heating))
print("Cooling mse score: ",mean_squared_error(y_valid_cooling,predict_xgb_cooling))
print("Heating rmse score: ",mean_squared_error(y_valid_heating, predict_xgb_heating, squared=False))
print("Cooling rmse score: ",mean_squared_error(y_valid_cooling, predict_xgb_cooling, squared=False))
