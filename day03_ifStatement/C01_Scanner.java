package day03_ifStatement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
/*  Problem Tanımı
       Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
       hesaplayan kodu yazınız.
       Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
       Buna göre 2 işçi aynı işi kaç günde yapar?
       Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplam kaç işçi çalışacak? 2
       İşin bitme süresi 5 gündür.

        */
        System.out.println("IS bitirme sürenizi yaziniz...");
        double bitirmeSüresi=scan.nextDouble();
        System.out.println("kac Isci calismasi gerekiyor...");
        double isciSayisi=scan.nextDouble();
        double birlikteBitirmeSüresi= bitirmeSüresi/isciSayisi;
        System.out.println("islem yeni alinacak isci sayisi ile bititir= "+birlikteBitirmeSüresi+" günde");









    }
}
