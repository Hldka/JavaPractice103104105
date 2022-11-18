package day05If_Statement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

     // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yasinizi pozitif sayi olarak giriniz");
        int yas=scan.nextInt();

        if(yas>=65){
            System.out.println("Emekli olabilirsiniz...");
        }else {
            System.out.println("Emekli olamzsini... ");
            System.out.println(65-yas+"  sene daha calismalisiniz...");
        }
        if (yas>=0){
if (yas>0){
    System.out.println("Emekli olabilirsin gözün aydin");
} else {
    System.out.println("Emekli olamzsin ..."+ (65-yas)+ "daha calismalisin " );
}} else{
            System.out.println("Lütfen sifirdan büyük bir sayi giriniz...");
        }


    }
}
