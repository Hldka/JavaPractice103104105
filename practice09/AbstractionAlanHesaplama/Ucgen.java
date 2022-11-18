package practiceAdvanced.practice09.AbstractionAlanHesaplama;

public class Ucgen extends Alan{
    @Override
    double alanHesapla(double taban, double yukseklik) {
        return (taban*yukseklik)/2;
    }
}
