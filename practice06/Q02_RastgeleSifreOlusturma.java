package practiceAdvanced.practice06;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma { //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre
    // üreten bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Karakter sayinizi giriniz");
        int karaktersayisi=scan.nextInt();
        String sifre="";
        int sayac=0;


        String karakterler="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndeks=karakterler.length();


        while (sayac < karaktersayisi){
             int rastgeleindeks=(int)(Math.random()*maxIndeks);
             sifre+=karakterler.charAt(rastgeleindeks);
             sayac++;

        }
        System.out.println("Sifre= "+sifre);
    }
}
