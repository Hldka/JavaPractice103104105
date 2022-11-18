package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {

     /*
         Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
      */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz...");
        String adSoyad=scan.nextLine();
        int ind=adSoyad.indexOf(" ");

        String erste= adSoyad.substring(0,ind);
        String zweite=adSoyad.substring(ind);
        System.out.println(erste);
        System.out.println(zweite.trim());




    }
}
