package day02_variables;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
/*
       String metin= "Küçük yaşta ailesini kaybeden Harry Potter, annesi (Lilly Potter) ve babasının (James potter) da mezun olduğu Hogwarts Cadılık ve Büyücülük Okulu müdürü Albus Dumbledore tarafından kapılarına bırakıldığı günden beri " +
               "teyzesi, eniştesi ve kuzeni Dudley ile birlikte büyünün gerçek olduğundan dahi habersiz bir şekilde " +
               "yaşamaktadır. Eniştesi, (Vernon Dursley) teyzesi (Petunia Dursley) ve kuzeni (Dudley Dursley) Harry’e çok kötü davranmaktadırlar ve Harry merdiven boşluğunun altındaki bir odada yaşatırlar. Çok mutsuz bir çocukluk geçiren Harry’nin 11. doğum günü yaklaşmaktadır.\n" +
               "Bir gün Harry’ye Hogwarts’dan bir kabul mektubu gelir fakat büyücüleri birer ucube ve utanç kaynağı olarak gören eniştesi ve teyzesi Harry’nin mektubu okumasına izin vermez. Fakat mektupların ardı arkası kesilmez hatta giderek artan sayıda mektuplar gelmeye başlar. Bir gün evin şöminesinden mektup yağmaya başlar. Eniştesi evdekileri de alarak evden ayrılırlar ve çok uzak bir yere giderler. Denizin ortasındaki bir kayalıkta, küçük bir kulübede yaşamaya başlarlar. Bir akşam kulübeye Hagrid adında bir yarı dev gelir. Hagrid, Hogwarts Cadılık ve Büyücülük Okulu’nun anahtar sorumlusu ve bekçisidir. Hagrid, Harry’nin mektupları okuyamadığını öğrenir ve Harry’e her şeyi anlatır. Anne ve babası trafik kazasında ölmemişlerdir. Onlar büyücüdürler ve karanlık büyücü Lord Voldemort tarafından öldürülmüşlerdir. Harry de bir büyücü adayıdır. Kendisi bilmese de daha 1 yaşındayken o güne kadarki en büyük kara büyücü Lord Voldemort’u yenmişti. Her ne kadar Voldemort ölümsüzlük konusunda herkesten daha fazla ilerlemiş olsa da. Harry, bugüne kadar tüm gerçekleri kendisinden saklayan teyzesi ve eniştesine çok kızar. Hogwarts Büyücülük Okuluna gitmeye karar verir. Okul öncesi alışverişi için Hagrid ile birlikte Çatlak Kazan adlı bir bardan Diagon Yolu’na giderler. Burada önce büyücü bankası Gringotts’a girerler. Annesi ve babası Harry’ye bir servet bırakmıştır. Ardından bir asa, (28 santim Defne Dikeni, Anka Kuşu Teleği) büyücülük kitapları, parşömen, mürekkep, okul cüppesi gibi okulda ihtiyacı olacak şeyleri alırlar. Hagrid Harry’ye doğum günü hediyesi olarak bir baykuş (karbeyazı rengindeki baykuşu Hedwig) alır.";

        String metin1 = metin.replaceAll(" ","\n");
        System.out.println(metin1);
 a)Kullanicidan ilk adimda "Parola" isteyiniz.
                Ikinci adimda ayni "Parola"yi tekrar girmesini isteyiniz. Eger Kullanici parolayi dogru teyit ettiyse;
        "Giris basarili...."
        yanlis teyit yapti ise
        "Lütfen parolayi dogru giriniz..."
        yazisi yazdiriniz.
        b)Ayni islemi kücük harf-büyük harf hassasiyeti olmadan yapiniz

*/

       //a
        Scanner scan = new Scanner(System.in);

/*
        System.out.println("Parola giriniz");
        String paswrd=scan.nextLine();
        System.out.println("Paraloyu tekrar griniz");
        String psswrd2=scan.nextLine();
        if(paswrd.equals(psswrd2)){
            System.out.println("Giris basarili");
        }else {
            System.out.println("Lütfen kücük büyük charaktere dikkat ederek, dogru parolayi gririniz...");

        }
        //b
        System.out.println("Paroluyu giriniz");
        String sifre=scan.nextLine();
        System.out.println("Parolayi tekrar giriniz");
        String sifre2=scan.nextLine();
        if(sifre2.equalsIgnoreCase(sifre)){
            System.out.println("Giris basarili");
        }else {
            System.out.println("Lütfen sifreyi dogru giriniz");
        }

//Ogrenciden sinavdan aldigi sonucu isteyiniz. Eger
//0-50 arasi ise "Basarisiz"
//50-70 arasi ise "C"
//70-85 arasi ise "B"
//80 ve ustu ise "A" seklinde sonuc yazdiriniz

        System.out.println("Sinav sonucunuzu giriniz");
        double s=scan.nextDouble();
        if (s<50){
            System.out.println("Basarisiz");
        } else if (s>=50) {
            System.out.println("\"C\" ");

        } else if (s>=70) {
            System.out.println("\"B\"");

        } else if (s>=84) {
            System.out.println("\"A\"");

        }
         else{
            System.out.println("Gecersiz not girdiniz");
        }*/


        System.out.println("Lutfen bir karakter giriniz...");
         char ch=scan.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


        System.out.println("\t"+ch+"\t\t\n\t"+ch+"\t"+ch+"\t\n"+ch+"\t"+ch+"\t"+ch+"\n");





    }



}
