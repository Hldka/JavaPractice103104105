package day04_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gün ismi yaziniz");
        String gun=scan.nextLine();
         if(gun.equalsIgnoreCase("Cuma")){
             System.out.println("Müslümanlar icin kutsal gün");
         } else if (gun.equalsIgnoreCase("Cumartesi")) {
             System.out.println("Yahudiler icin kutsal gün");
         } else if (gun.equalsIgnoreCase("Pazar")) {
             System.out.println("Hiristiyanlar icin kutsal gün");
         }
         else if (gun.equalsIgnoreCase("Pazartesi")
                 ||gun.equalsIgnoreCase("Sali")
                 || gun.equalsIgnoreCase("Carsamba")
                 ||gun.equalsIgnoreCase("persembe"))
         {
            System.out.println("Gün");
        }else {
             System.out.println("Lütfen gecerli bir gün ismi giriniz");
         }

// stringlerde neden == kullanilmaz onun yerine equals kullaniriz.
        // cünkü javada 2 tane memory var .tack ve heap.
        // String'de refrans degerinede bakildigi icin == yerine equals kullanilir.
        //1.Yol
        String gün=scan.nextLine();




         }


    }

