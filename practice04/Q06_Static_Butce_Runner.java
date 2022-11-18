package practiceAdvanced.practice04;

public class Q06_Static_Butce_Runner {
    //Basit bir ev bütcesi kodu yaziniz
    public static void main(String[] args) {
        Bütce baba=new Bütce();
        System.out.println("Maas öncesi Bütce"+Bütce.butce);
        baba.maasal(5000);
        System.out.println("Maas sonrasi bütce"+Bütce.butce);
        System.out.println(baba.harclik);
        baba.harclikAl(500);
        System.out.println("Harclik sonrasi bütce"+Bütce.butce);
        System.out.println(baba.harclik);
        baba.harclikHarca(266);
        baba.butcedenHarca(1000);
        baba.butcedenHarca(5000);


        System.out.println("Bütce: "+Bütce.butce);
        System.out.println("baba Harclik: "+baba.harclik);
        System.out.println("Baba harclik: "+baba.harclik);

        Bütce anne=new Bütce();
        anne.maasal(2000);
        anne.maasal(3000);

        anne.harclikAl(2000);
        anne.harclikAl(300);
Bütce kiz=new Bütce();
kiz.harclikAl(500);
kiz.harclikHarca(400);

        System.out.println("Bütce:  "+Bütce.butce);
        System.out.println("anne harclik:  "+anne.harclik);


    }
}
