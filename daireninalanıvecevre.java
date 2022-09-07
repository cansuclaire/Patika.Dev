import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplayanProgram {

    public static void main(String[] args) {

        double r,alan,cevre;

        Scanner input=new Scanner(System.in);

        System.out.print("Yar� �ap� giriniz: ");
        r= input.nextInt();

        cevre= Math.PI*r*2;
        alan=Math.PI*r*r;

        System.out.println("Dairenin �evrei: "+cevre);
        System.out.println("Dairenin Alan�: "+alan);


    }
}
