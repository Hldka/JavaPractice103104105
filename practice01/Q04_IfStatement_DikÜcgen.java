package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikÜcgen {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("ücgenin ilk kenarini giriniz ");
        int a=scan.nextInt();
        System.out.println("ücgenin ikinci kenarini giriniz ");
        int b=scan.nextInt();
        System.out.println("ücgenin ücünc+ kenarini giriniz ");
        int c=scan.nextInt();
        if (a*a+b*b==c*c||b*b+c*c==b*b||c*c+b*b==a*a){
            System.out.println("dik ücgen");
        } else if (a*a+b*b!=c*c||b*b+c*c!=b*b||c*c+b*b!=a*a) {
            System.out.println("dik ücgen degil");

        }else System.out.println("lütfen gecerli bir deger giriniz ");


    }
}
