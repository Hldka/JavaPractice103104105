package day05If_Statement;

import java.util.Scanner;

public class C07_ifStatement {
    public static void main(String[] args) {
//Kullanicidan dikdortgenin kenar uzunluklarini isteyin
//ve dikdortgenin kare olup  olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci kenar uzunlugunu giriniz ");
        int kenar1= scan.nextInt();

        System.out.println("Lütfen ikinci kenar uzunlugunu giriniz ");
        int kenar2= scan.nextInt();

        System.out.println("Lütfen ücüncü kenar uzunlugunu giriniz ");
        int kenar3= scan.nextInt();
        System.out.println("Lütfen dördüncü kenar uzunlugunu giriniz ");
        int kenar4= scan.nextInt();
        if(kenar1==kenar2&&kenar2==kenar3&&kenar3==kenar4){
            System.out.println("Bu Cisim bir karedir");
        }else System.out.println("Kare degldir");
    }
}
