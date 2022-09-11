import java.util.Scanner;

/**
 * sayiBulma
 */
public class sayiBulma {

    public static void main(String[] args) {
        int girilenSayi = 0, adet = 0, toplam = 0;
            double ortalama;
            Scanner sc = new Scanner(System.in);
           
            System.out.print("Lütfen Bir Sayı Giriniz : ");
            girilenSayi = sc.nextInt();

            for(int i = 0; i <= girilenSayi; i++){
                if(i%3==0 && i%4==0){
                    toplam += i;
                    adet++;
                }
            }
           //adet sayısı 0 dahil saydığı için 1 eksiğini alarak ortalama hesaplıyoruz.
            ortalama = toplam/(adet-1); 
            System.out.print("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması  :"+ortalama);
            sc.close();//veri girişini kapatıyoruz
   }
}
