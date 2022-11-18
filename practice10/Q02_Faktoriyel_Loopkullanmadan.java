package practiceAdvanced.practice10;

import java.util.HashMap;
import java.util.Map;

public class Q02_Faktoriyel_Loopkullanmadan {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)


    public static void main(String[] args) {

        System.out.println(fak(5));

    }public static int fak(int say){

        if (say==1){
            return 1;
        }else {
            return  say*(fak(say-1));
        }
    }

}
