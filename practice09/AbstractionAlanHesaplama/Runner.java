package practiceAdvanced.practice09.AbstractionAlanHesaplama;

public class Runner {//Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {
        Ucgen ucgen=new Ucgen();

        System.out.println( ucgen.alanHesapla(4,2));
        Dikdörtgen dikdörtgen=new Dikdörtgen();
        System.out.println(dikdörtgen.alanHesapla(5,4));

    }
}
