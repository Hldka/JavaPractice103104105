package practiceAdvanced.practice05;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunIsmi,double fiyati,String skt){
        urunAdi=urunIsmi;
        urunFiyati=fiyati;
        sonKullanmaTarihi=skt;

    }
    Market(String urunIsmi,double fiyati){
        urunAdi=urunIsmi;
        urunFiyati=fiyati;
        sonKullanmaTarihi="Bu ürünün son kullanma tarihi yoktur";

    }





}
