import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      // Değişkenler
      int mat, fizik, turkce, kimya, tarih, muzik;
      
      // Scanner sınıf tanımlama
      Scanner inp = new Scanner(System.in);
      
      // Kullanıcıdan değer alma
      System.out.print("Matematik Notunuz: ");
      mat = inp.nextInt();
      
      System.out.print("Fizik Notunuz: ");
      fizik = inp.nextInt();
      
      System.out.print("Türkçe Notunuz: ");
      turkce = inp.nextInt();
      
      System.out.print("Kimya Notunuz: ");
      kimya = inp.nextInt();
      
      System.out.print("Tarih Notunuz: ");
      tarih = inp.nextInt();
      
      System.out.print("Müzik Notunuz: ");
      muzik = inp.nextInt();

      // İşlem
    int toplam = (mat + fizik + turkce + kimya + tarih + muzik);
    double sonuc = toplam / 6.0;
    
    System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
  }
}
