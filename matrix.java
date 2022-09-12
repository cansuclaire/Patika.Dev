import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // B harfi yazdırma

        int s1 ,s2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Harfin Boyunu Giriniz : ");
        s1 = input.nextInt();
        System.out.println("Harfin Enini Giriniz : ");
        s2 = input.nextInt();

        String[][] list = new String[s1][s2-1];



        // B yazan bölüm
        for(int i = 0; i< list.length ; i++){
            for (int j = 0 ; j< list[0].length ; j++){
                if (i == 0 || j == 0 || i == list.length-1 || (i == list.length/2-1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" . ");
                }

            }
            System.out.println(" * ");
        }

        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\n");


        // A yazan bölüm
        for(int i = 0; i< list.length ; i++){
            for (int j = 0 ; j< list[0].length ; j++){
                if (i == 0 || j == 0 || (i == list.length/2-1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" . ");
                }

            }
            System.out.println(" * ");
        }



    }
}
