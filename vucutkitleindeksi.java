import java.util.Scanner;
public class vucutKitleIndex {
    public static void main(String[] args) {

        int kg;
        double boy, index;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz:");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz:");
        kg = input.nextInt();

        index = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz:" + index);


    }
}
