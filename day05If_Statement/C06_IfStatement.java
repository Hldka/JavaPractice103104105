package day05If_Statement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen 4 basamakli bir sayi giriniz");
        double sayi=scan.nextDouble();
        if(sayi<1000|| sayi>9999){
            System.out.println("Lütfen 4 basamakli bir sayi giriniz");// istenmeyen durum incelendi


        } else if (sayi%5==0) {if (sayi%10==0){
            System.out.println(" 5'e bölünebilen cift sayi ");
        }else {
            System.out.println("5'e bölünebilen tek sayi");
        }



        }else {// 4 basamakli ama 5 e bölünemiyor
            System.out.println("Tekrar deneyin");
        }


    }
}
