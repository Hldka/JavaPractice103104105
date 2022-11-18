package day06_nestedifswitch;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

   /*
* Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
* ornek
*  Kullanici  : A , B , C harflerinden birini secsin
 A'yi secmis ise, ==> Java kolay
 B'yi secmis ise, ==> Java eglenceli
 C'yi secmis ise, ==> Calismaliyim :)
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen harflerden birini giriniz:\nA\tB\tC");
        char harf=scan.next().toUpperCase().charAt(0);
        switch (harf){
            case 'A':
                System.out.println("Java kolay");
                break;
            case 'B':
                System.out.println("Java eglenceli");
                break;
            case  'C':
                System.out.println("Calismaliyim :)");
                break;
            default:
                System.out.println("Lütfen gecerli bir harf giriniz...");
        }

//Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
//Ex : 568
//Besyuzaltmissekiz
        System.out.println("Lütfen pozitif 3 basamakli bir sayi giriniz...");
        int sayi=scan.nextInt();
        int birbas=sayi%10;
        int onbas=(sayi/10)%10;
        int yüzbas=(sayi/100)%10;
        if (sayi>99&&sayi<1000) {
            switch (yüzbas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("yüz");
                    break;
                case 2:
                    System.out.print("ikiyüz");
                    break;
                case 3:
                    System.out.print("ücYüz");
                    break;
                case 4:
                    System.out.print("dörtYüz");
                    break;
                case 5:
                    System.out.print("besYüz");
                    break;
                case 6:
                    System.out.print("altiyüz");
                    break;
                case 7:
                    System.out.print("yediyüz");
                    break;
                case 8:
                    System.out.print("sekizyüz");
                    break;
                case 9:
                    System.out.print("dokuzyüz");
                    break;

            }
            switch (onbas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }switch (birbas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üc");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        }else System.out.println("Lütfen uc basamakli bir sayi giriniz ");



    }
}
