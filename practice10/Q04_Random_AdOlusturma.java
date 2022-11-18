package practiceAdvanced.practice10;

public class Q04_Random_AdOlusturma {////Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve
    // bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
    public static void main(String[] args) {
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxInx=alfabe.length();
        String isim="sezai";
        String yeniIsim="";
        int sayac=0;
        for (int i=0;i<isim.length();i++){
            while (true){
                char c=alfabe.charAt((int)(Math.random()*maxInx));
                sayac++;
                if (isim.charAt(i)==c){
                    yeniIsim=yeniIsim+c;
                    System.out.println("Yeni isim= "+yeniIsim);
                    break;
                }
            }
        }
        System.out.println("Yeni Isim= "+yeniIsim);
        System.out.println("sayac= "+sayac);
    }
}
