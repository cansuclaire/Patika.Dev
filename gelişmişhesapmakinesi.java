import java.util.Scanner;

public class Main {

    static int sum() {
        int number, result = 0, i = 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Topla: ");
            number = scanner.nextInt();
            result += number;
            if (number == 0)
                break;
        }
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int minus() {

        System.out.print("Sayı: ");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int dec, i = 1;
        int temp = first;
        while (true) {
            System.out.print("Çıkart: ");
            dec = scan.nextInt();
            temp -= dec;
            if (dec == 0)
                break;
        }
        System.out.println("Sonuc: " + temp);
        return temp;
    }

    static void times() {
        Scanner scanner = new Scanner(System.in);
        int numb, result = 1;
        do {
            System.out.print("Sayı: ");
            numb = scanner.nextInt();
            result *= numb;

            if (result == 0) {
                System.out.println("Sonuç: 0");
                break;
            }
            System.out.println("Sonuç: " + result);
        } while (numb != 1);
    }

    static void div() {
        Scanner scanner = new Scanner(System.in);
        double numb, div, result = 0;
        while (true) {
            System.out.print("Sayı: ");
            numb = scanner.nextInt();
            System.out.print("Bölen: ");
            div = scanner.nextInt();
            result = numb / div;
            System.out.println("Sonuç: " + result);
        }
    }

    static void pow() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı: ");
            int numb = scanner.nextInt();
            System.out.print("Kuvveti: ");
            int power = scanner.nextInt();
            System.out.println("Sonuç: " + Math.pow(numb, power));
        }
    }

    static void mod() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı: ");
            int numb = scanner.nextInt();
            System.out.print("Mod: ");
            int mod = scanner.nextInt();
            System.out.println("Sonuç: " + numb % mod);
        }
    }

    static void fac() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int numb=scanner.nextInt();
        int result=1;
        for (int i = numb; i>0;i--){
            result*=i;
        }
        System.out.println("Sonuç: "+result);
    }

    static void rectangle(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("1. Kenar: ");
        int a=scanner.nextInt();
        System.out.print("2. Kenar: ");
        int b=scanner.nextInt();
        int sq=a*b;
        int f=2*a+2*b;
        System.out.println("Alan: "+sq);
        System.out.println("Çevre: "+f);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplma\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış";
        System.out.println(menu);

        System.out.print("Seçim: ");
        int select = scanner.nextInt();

        while (select != 0) {

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    fac();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
            }
        }
    }
}
