package practiceAdvanced.practice01;

public class Q03_RgexQuantifiers {
    public static void main(String[] args) {
        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
        String str = "!s";
        System.out.println(str.matches(".s"));//true ==> herhangi bir karakter ile başlayıp 's' harfi ile bitiyor.
//matches() methodu regex ile çalışıp String değerin regex ile karşılaştırmasını yapar.
        System.out.println(str.matches("..s"));//false ==> 3 karakterli olamadığı için

//Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
        System.out.println("&shgfh".matches(".s.*"));//true ==> ilk karakter herhangi biri, ikinci karakter 's'
//  .* ==> esnek sayıda karalter(0 yada daha fazla)
        System.out.println("&shgfh".matches(".r.*"));//false ==> ikinci karakter uyuşmuyor.
//Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        String tr="abc";
        System.out.println(tr.matches("[a-zA-Z]*"));//true
        System.out.println(tr.matches("\\S*"));//true
        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("abcdh".matches("[a-zA-Z]{5}"));//true==>5 karakterli ve hepsi harf
        System.out.println("acvdhs".matches("[a-zA-Z]{5}"));//false==>5 den fazla karakter iceriyor.
        System.out.println(" 1dfgh".matches("[a-zA-Z]{5}"));//false==>harf disinda karakter iceriyor
        //

//Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
String tz=" yasama";
        System.out.println(tz.matches("[a-zA-Z]{6,}"));//true==>en az 6 harf icerir
        System.out.println("1245675".matches("[0-9]{6,}"));//true==>en az 6 Rakam icerir
        System.out.println("12456#75".matches("[0-9]{6,}"));//false==>en az 6 Rakam disi karakter icerir
        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123xAc".matches("\\w{7,10}"));//w=[a-zA-Z0-9] en az 7 en faza 10 karakter icerir
        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));
    }
}
