package day04_IfStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */
/*
        Scanner scan= new Scanner(System.in);
        System.out.println(" Lütfen Y veya N secin");
        char karakter =scan.next().charAt(0);

        if (karakter=='Y'|| karakter=='Y'){
            System.out.println("Yes");
        }else if (karakter=='N'|| karakter=='n'){
            System.out.println("No");
        }else {
            System.out.println("Lütfen Y veya N secin");
        }
*/
    /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */
        int not=-1;

        if (not>89) System.out.println("A Cok IYI");
        else if (not>79) {
            System.out.println("B IYI");

        } else if (not>69) {
            System.out.println("C Orta");

        } else if (not>59) {
            System.out.println("D Gecer");

        } else if (not<59 && not>=0) {
            System.out.println("F Zayif");

        }else {
            System.out.println("Gecerli bir not yaziniz");
        }


    }
}
