package practiceAdvanced.practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {
    /*

 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yüksekligi giriniz...");
        double a=scan.nextInt();
        double toplamyol=0;
        double vurmasaysi=0;
        double i=a;
        do {vurmasaysi++;
            toplamyol+=a;
            a=a*0.75;
            toplamyol+=a;


        }while (a>1);
        System.out.println("Toplam yol"+toplamyol);
        System.out.println("Vurma sayisi"+vurmasaysi);
        NumberFormat numberformat=new DecimalFormat(".#");
        System.out.println();


    }
}
