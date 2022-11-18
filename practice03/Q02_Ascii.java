package practiceAdvanced.practice03;

import java.util.Scanner;

public class Q02_Ascii {
    public static void main(String[] args) {
        //Adınızın içerdiği harfleri kullanmadan adınızı yazdıran bir kod yazınız.

        String ad="Ali";
        int a=ad.charAt(0);
        int b=ad.charAt(1);
        int c=ad.charAt(2);
        System.out.println(ad);
        System.out.println(a+""+b+""+c+"");
        char ch1='B'-1;
        char ch2='m'-1;
        char ch3='h'+1;
        System.out.println(""+ch1+ch2+ch3);

    }
}
