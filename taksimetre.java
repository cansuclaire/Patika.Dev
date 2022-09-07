import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double perKM=2.20,distance,totalPrice,startPrice=10;

        Scanner input = new Scanner(System.in);

        System.out.print("KM Cinsinden Gidilecek Mesafeyi Giriniz : ");
        distance = input.nextDouble();
        totalPrice = (perKM*distance);
        totalPrice += totalPrice+startPrice;
        totalPrice = (totalPrice<20) ? 20 : totalPrice;
        System.out.println("Toplam Tutar : " + totalPrice + " TL");

    }
}
