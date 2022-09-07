import java.util.Scanner;

public class Main {
    
    static int metot() {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = input.nextInt();
        int resulti = 1;
        int resultj = 1;

        for (int i = n; i > -n - i; i -= 5) {

            resulti = i;
            System.out.println(resulti);
            if (i <= 0) {
                for (int j = i; j <= n; j += 5) {
                    resultj = j;
                    System.out.println(resultj);
                }

            }
            if (resultj == n) {
                break;
            }

        }
        System.out.println("==================");


        return 1;
    }

    public static void main(String[] args) {

        System.out.println(metot());

    }
}
