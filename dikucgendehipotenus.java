import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenari Giriniz: ");
        a = input.nextInt();
        System.out.println("2. Kenari Giriniz: ");
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b)) ;
        double u=(a+b+c)*0.5;
        double cevre = 2*u;
        double alan= Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Hipotenus : " +c);
        System.out.println("Cevre : " +cevre);
        System.out.println("Alan : " +alan);

    }
}
