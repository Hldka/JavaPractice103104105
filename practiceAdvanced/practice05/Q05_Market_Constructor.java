package practiceAdvanced.practice05;

public class Q05_Market_Constructor {
    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {
        Market ekmekobj=new Market("Ekmek",5,"12.11.2023");
        System.out.println("Ürünun adi: "+ekmekobj.urunAdi+"  Ürun Fiyati: "+ekmekobj.urunFiyati+" "+" Son Kullanma tarihi: "+ekmekobj.sonKullanmaTarihi);
        Market nutellaobjesi=new Market("Nutella",45,"!0.11.2024");
        System.out.println("Ürünun adi: "+nutellaobjesi.urunAdi+" Ürün Fiyati: "+nutellaobjesi.urunFiyati+" Son Kullanma Tarihi: "+ nutellaobjesi.sonKullanmaTarihi);

        Market bardakobjesi=new Market("Bardak",50);
        System.out.println("Ürünun adi: "+bardakobjesi.urunAdi+" Ürün Fiyati: "+bardakobjesi.urunFiyati+" Son Kullanma Tarihi: "+ bardakobjesi.sonKullanmaTarihi);



    }

}
