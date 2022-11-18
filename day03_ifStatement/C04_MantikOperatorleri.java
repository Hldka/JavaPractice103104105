package day03_ifStatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

//&& ile & arasindaki fark (boolen)&& daha hizli dönüt verir
        // && de boolean sonuc 3te bir tane false bulunca durur tüm satiri kontrol etmez
        // Ancak&tüm satiri kontrol eder ondan sonra durur
        // sonucta fark yok sadec bir ilk hatayi buldugunda durur digeri sonuna kadar gider && tekliye gor daha hizli calisir

        System.out.println(5+2==8);
        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8;


        System.out.println("Sonuc="+sonuc1);
boolean sonuc2= 5>4&& 7>9 && 6+3==9 && 5+2!=8;

        System.out.println("sonuc =" +sonuc2);

        boolean sonuc3= 5>4& 7>9 & 6+3==9 & 5+2!=8;

        System.out.println("sonuc =" +sonuc3);

// sayi1un 10 ile 20 araliginda oldugunu true diyerek döndürelim

        // java uclu karsilastirma yapmaz
        // iki karsilastirmalar yaparak mantiksal operatorlerle birlestirelim

        int sayi1=15;
        System.out.println(10<sayi1 && sayi1<20);

        int sayi2=5;
        // sayi2 nin 10 ile 20 arasinda olmadigini true ile döndür

        System.out.println(10>sayi2 && sayi2<20);


    }
}
