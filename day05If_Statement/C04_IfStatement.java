package day05If_Statement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz" + "\n kadin icin K \n Erkek icin E harfi giriniz...");
        char cins = scan.next().toUpperCase().charAt(0);
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        if (cins == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen dogru yas giriniz");
            } else if (yas >= 60) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olamazsiniz " + (60 - yas) + " yil daha calismalisin");
            }
        } else if (cins == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen dogru yas giriniz");
            } else if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olamazsiniz " + (65 - yas) + "yil daha calismalisin");
            } } else
                System.out.println("lütfen gecerli bir harf giriniz");




    }}
