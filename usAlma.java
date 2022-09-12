import java.util.Scanner;
/**
 * usAlma
 */
public class usAlma {

    public static void main(String[] args) {
        /*
                int n,k;
                Scanner input = new Scanner(System.in);
                System.out.print("üssü alınacak sayıyı girin:");
                n = input.nextInt();
                System.out.print("üs olacak sayıyı girin:");
                k = input.nextInt();
                int nUssuK;
                // n üssü k  demek örneğin 2 üssü 3 gibi. 3 tane 2 yi çarp demek. Yani k tane n' i çarpmam lazım.
                // 3^4 = 3*3*3*3
        */
                int n,k;
                int total =1;
                Scanner input = new Scanner(System.in);
                System.out.print("Üssü alınacak sayı:");
                n = input.nextInt();
                System.out.println("Üs olacak sayı:");
                k = input.nextInt();
        
                for(int i =1;i<=k;i++){
        
                    total*=n;
        
                }
        
                System.out.println(n+ " üssü "+ k +" = "+total);
            }
        }
