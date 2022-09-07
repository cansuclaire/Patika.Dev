import java.util.Scanner;
/**
 * ucakBileti
 */
public class ucakBileti {
    public static void main(String[] args) {
        int km, sType, yType;
        double perKm = 0.10;
        double ttl, indTtl, sDis, yDis;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM olarak giriniz:");
        km = input.nextInt();
        if (km < 1) {
            System.out.print("Hatalı bir değer girdiniz!");
        } else {
            System.out.print("Yolcunun yaşını giriniz: ");
        }
        yType = input.nextInt();
        if (yType > 0){
            if (yType <= 1){
                System.out.print("Hatalı bir değer girdiniz!");
            }
            else if (yType >= 1 && yType <= 12) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            sType = input.nextInt();
            switch (sType) {
                case 1:
                    ttl = km*perKm;
                    yDis = ttl*0.50;
                    indTtl = ttl - yDis;
                    sDis = indTtl;
                    System.out.print("Toplam Tutar:" + indTtl);
                    break;
                case 2:
                    ttl = km*perKm;
                    yDis = ttl*0.50;
                    indTtl = ttl - yDis;
                    sDis = indTtl * 0.20;
                    indTtl = (indTtl - sDis)*2;
                    System.out.print("Toplam Tutar:" + indTtl);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else if (yType >= 13 && yType <= 24) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            sType = input.nextInt();
            switch (sType) {
                case 1:
                    ttl = km*perKm;
                    yDis = ttl*0.10;
                    indTtl = ttl - yDis;
                    System.out.print("Toplam Tutar:" + indTtl);
                    break;
                case 2:
                    ttl = km*perKm;
                    yDis = ttl*0.10;
                    indTtl = ttl - yDis;
                    sDis = indTtl * 0.20;
                    indTtl = (indTtl - sDis)*2;
                    System.out.print("Toplam Tutar:" + indTtl);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else if (yType >= 25 && yType <= 65) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            sType = input.nextInt();
            switch (sType) {
                case 1:
                    ttl = km*perKm;
                    System.out.print("Toplam Tutar:" + ttl);
                    break;
                case 2:
                    ttl = km*perKm;
                    sDis = ttl * 0.20;
                    indTtl = (ttl - sDis)*2;
                    System.out.print("Toplam Tutar:" + sDis);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else if (yType > 65) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            sType = input.nextInt();
            switch (sType) {
                case 1:
                    ttl = km*perKm;
                    yDis = ttl*0.30;
                    indTtl = ttl - yDis;
                    System.out.print("Toplam Tutar:" + indTtl);
                    break;
                case 2:
                    ttl = km*perKm;
                    yDis = ttl*0.30;
                    indTtl = ttl - yDis;
                    sDis = indTtl * 0.20;
                    indTtl = (indTtl - sDis)*2;
                    System.out.print("Toplam Tutar:" + indTtl);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else {
            System.out.print("Hatalı bir değer girdiniz!");
        }


    }

    }

}
