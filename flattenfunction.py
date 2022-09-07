def flatten(x):
    
    for i in x:
        if isinstance(i,list): # determine if its type is list or not. It is working until it is not list.
            flatten(i)
        else:
            empty_list.append(i)
    
    

x= [[1,'a',['cat'],2],[[[3]],'dog'],4,5] #given list
empty_list = [] 
flatten(x)
print(empty_list)



    




  
