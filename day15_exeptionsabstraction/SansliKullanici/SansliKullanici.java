package day15_exeptionsabstraction.SansliKullanici;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici {
    /*

     Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
     1- Bir Kayit class'i oluşturun fields:  kullaniciDate (LocalDateTime cinsinden)
     2- Kayit isminde olusturdugunuz class'da kayitol() isminde bir method
     ekleyerek Kullanıcıdan kullanici ismini alarak ArrayList'e ekleyin
     3- SansliKullanici class'i olusturun.Bu class'ta kendine verilen
     ArrayListteki kullanicilardan her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran sansliKullanici() isminde bir metod  ekleyiniz.

     */

    public void sansliKullaniciYazdir(
            List<String> listKullaniciID, List<Integer> listKullaniciSaniye) {
        List<String> sansliKullaniciIndexes = new ArrayList<>();
        for (int i = 0; i < listKullaniciSaniye.size(); i++) {
            if (listKullaniciSaniye.get(i) < 10) {
                sansliKullaniciIndexes.add(listKullaniciID.get(i));
            }
        }
        System.out.println("Sansli Kullanicilar");
        System.out.println(sansliKullaniciIndexes);
    }

}
