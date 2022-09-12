import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list={15,12,788,1,-1,-778,2,0};
        Scanner input=new Scanner(System.in);
        System.out.print("Girilen sayı: ");
        int number=input.nextInt();
        int[] minList=new int[list.length];
        int[] maxList=new int[list.length];
        int a=0;
        int b=0;
        int sayacMin=0,sayacMax=0;
        for(int i=0;i< list.length;i++){
            if(list[i]<number){
                minList[a]= list[i];
                a++;
                sayacMin++;
            }
            if(list[i]>number){
                maxList[b]=list[i];
                b++;
                sayacMax++;
            }
        }
        int[] copyOfRangeMinList=Arrays.copyOfRange(minList,0,sayacMin);
        int[] copyOfRangeMaxList=Arrays.copyOfRange(maxList,0,sayacMax);

        int minMax=copyOfRangeMinList[0];
        int maxMin=copyOfRangeMaxList[0];

        for(int i:copyOfRangeMinList){
            if(i>minMax){
                minMax=i;
            }
        }

        for(int i:copyOfRangeMaxList){
            if(i<maxMin){
                maxMin=i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+minMax);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+maxMin);






    }
}
