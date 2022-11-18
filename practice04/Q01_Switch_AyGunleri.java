package practiceAdvanced.practice04;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {
     /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

*/
     public static void main(String[] args) {

         Scanner scan =new Scanner(System.in);
         System.out.println("Istedginiz yil ismini giriniz");
         int yil=scan.nextInt();
         System.out.println("Istediginiz ayi giriniz");
         int ay= scan.nextInt();
         int gün;
         switch (ay){
             case 1: case 3:
                       case 5: case 7:
                           case 8: case 10:
             case 12:
             gün=31;
             System.out.println(" girdiginiz ayin gün sayisi : "+ gün);
             break;
             case 2:
                 if (((yil%4==0&& yil%100!=0)|| yil%400==0)){
                     gün=29;
                     System.out.println("Girdiginiz ayin gün sayisi: "+gün);
                 }else {gün=28;
                     System.out.println("Girdiginiz ayin gün sayisi: "+gün);}break;
             default:
                 System.out.println("gecerli bir ay numarasi giriniz");
              }




     }
}
