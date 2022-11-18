package day15_exeptionsabstraction.SansliKullanici;

import static day15_exeptionsabstraction.SansliKullanici.Kayit.counter;

public class Runner {public static void main(String[] args) {
    Kayit obj=new Kayit();
    obj.kayit();
    System.out.println(counter+ "kez dogru kulanici girisi yapildi");
}
}
