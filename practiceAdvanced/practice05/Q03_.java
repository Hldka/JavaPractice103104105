package practiceAdvanced.practice05;

public class Q03_ {//Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan
    // bir method oluşturunuz.(Method overloading kullanınız)
    public static void main(String[] args) {
        Hacim hacim=new Hacim();
      int küp=hacim.hacimHesapla(3);
      int karePrizma=hacim.hacimHesapla(3,6);
      int dikdörtgenPrizma=hacim.hacimHesapla(3,6,9);
        System.out.println("Küp: "+küp);
        System.out.println("KarePrizma: "+karePrizma);
        System.out.println("DikdörtgenPrizma: "+dikdörtgenPrizma);

    }



}
