import java.util.Scanner;
/**
 * SicaklikDurumu
 */
public class SicaklikDurumu {
    public static void main(String[] args) {
            


int heat;
Scanner input =new Scanner(System.in);
System.out.println( " Sicaklik Derecesi Giriniz");
heat=input.nextInt();

if (heat <= 5) { System.out.println( "Kayak yababilirsin"); }
else if ( heat>5 && heat<=15) {System.out.println(" Sinamaya gidebilirsin"); }
else if ( heat>=15 && heat<=25) { System.out.println( " Piknik gide bilirsin");}
else if ( heat>=25) { System.out.println( " Yuzmeye gide bilirsin");}



    }

    
}
