package day03_ifStatement;

import java.util.Scanner;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {
  char harf='a';
  char harf2='A';


        System.out.println("harf>harf2==>"+(harf>harf2));// karsilastirma islemlerinin sonucunu true yada false döner(bbolean)
        // büyük harflerin ASCII degerleri kücük harflerin AScii degerlerinden kücüktür
// herhangi bir char variable'in AsCII degerlerini kod yazarak bulunuz.

//1.yol
char space=' ';
        System.out.println("Space 'in Ascii degeri "+(0+space));// herhangibir karaterin Ascii degerini bulmak icin sifiri ile toplariz
char unlem='?';
        System.out.println("? ASCII degeri= "+(0+unlem));

        char m= 'm';
        System.out.println("m harfinin ASCII degeri = "+(0+m));

        //2. yol
        // cahr'larda Java char karatere int' da atayabiliriz cünkü char'in bir resim karakteri birde sayisal ASCII
        // degeri vardir.bu nedenle ASCII degerlerini hesaplayabilirz.

        int harf3='m';
        System.out.println("m ASCII degeri = "+harf3);


byte b1=12;
byte b2=-125;
        System.out.println("b1>b2==>"+(b1>b2));

        float f1=2.45645f;
        float f2= 5.86786f;
        System.out.println("f1>f2===>"+(f1>f2));
        System.out.println("b1>f1==>"+(b1>f1));
long lng1= 5456456464L;
        System.out.println("b1>lng1==>"+(b1>lng1));
        char ch='h';
        System.out.println("b1>ch==>"+(b1>ch));
















    }
}
