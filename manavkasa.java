import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.0;

        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        Scanner input=new Scanner(System.in);
        System.out.println("Manav Kasa Programı");
        System.out.println("-------------------");

        System.out.print("Armut kaç kilo ? : ");
        armutKg=input.nextInt();

        System.out.print("Elma kaç kilo ? : ");
        elmaKg=input.nextInt();

        System.out.print("Domates kaç kilo ? : ");
        domatesKg=input.nextInt();

        System.out.print("Muz kaç kilo ? : ");
        muzKg=input.nextInt();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlicanKg=input.nextInt();

        double tutar=armut*armutKg+elma*elmaKg+domates*domatesKg+muz*muzKg+patlican*patlicanKg;
        System.out.println("Toplam Tutar : "+tutar);

    }
}
