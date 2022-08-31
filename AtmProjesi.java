import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String username, password;
        int balance = 10000;
        int right = 3;
        int select;
        int price;
        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Kullanıcı Adınız : ");
            username = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();
            if (username.equals("patika") && password.equals("dev123")){
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz.");
               do {
                   System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                   System.out.println("1-Para Yatırma\n" +
                           "2-Para Çekme\n"+
                           "3-Bakiye Sorgula\n"+
                           "4-Çıkış Yap");
                   select = input.nextInt();
                   switch (select){
                       case 1:
                           System.out.print("Tutarı giriniz : ");
                           price = input.nextInt();
                           balance += price;
                           break;
                       case 2:
                           System.out.print("Tutarı giriniz : ");
                           price = input.nextInt();
                           if (price > balance){
                               System.out.print("Yetersiz bakiye!");
                           }else {
                               balance -= price;
                           }
                           break;
                       case 3:
                           System.out.print("Bakiyeniz : " + balance);

                   }
               } while (select != 4);
                System.out.print("Tekrar görüşmek üzere!");
               break;
            }else {
                right--;
                System.out.println("Bilgileriniz hatalıdır. Lütfen tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bizimle irtibata geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }

        }


    }
}
