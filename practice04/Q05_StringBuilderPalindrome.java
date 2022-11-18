package practiceAdvanced.practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_StringBuilderPalindrome {
    //Bir String degerin Palindrome olup olmadigini kontrol eden bir kod yaziniz
    public static void main(String[] args) {
        String sa="Ey edip adanada pide ye";
      StringBuilder stb=new StringBuilder(sa);
      String stbReverse=stb.reverse().toString();
      stb.reverse();
        System.out.println(stb);
        if (sa.equalsIgnoreCase(stbReverse)){
            System.out.println("palindrom");
        }else System.out.println("Palindrom degil");

    }}
