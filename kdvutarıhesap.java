import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("KDV Hesaplama Programına Hoşgeldiniz");
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatı Giriniz");
        double fiyat = input.nextDouble();
        double KDV_fiyat= fiyat* 1.18;
        System.out.println("KDV'siz fiyat: "+ fiyat);
        System.out.println("KDV'li fiyat: "+ KDV_fiyat);

    }
}
