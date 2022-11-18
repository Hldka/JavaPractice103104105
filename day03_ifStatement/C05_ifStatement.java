package day03_ifStatement;

import java.util.Scanner;

public class C05_ifStatement {
    public static void main(String[] args) {

      //yagmur yagarsa piknik iptal olacak
      /*


      Task kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
      dört islemden biri ile islme koyup sonucu yazdiriniz
       */

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lütfen\ntoplama islemi icin 1\ncikarma islemi icin 2\n bölme islemi icin 3\n carpma islmei icin 4\n giriniz ");

        int secim =scan.nextInt();
        System.out.println("lütfen iki tam sayi giriniz ");

        double nu1=scan.nextDouble();
        double nu2=scan.nextDouble();


if(secim==1){
    System.out.println("Toplama "+(nu1+nu2));
} else if (secim==2 ) {
    System.out.println("Cikarma= "+(nu1-nu2));

}else if (secim==3) {
    System.out.println("Bölme= "+(nu1/nu2));}
else if (secim==4 ) {
        System.out.println("Cikarma= "+(nu1*nu2));
}
else {
    System.out.println("gecerli bir secim ve gecerli bir rakam giriniz");
}
        int sayi=127;

        int son= ((sayi%10)<5)?(sayi-(sayi%10)):(10-(sayi%10))+sayi;

        System.out.println(son);


    }}
