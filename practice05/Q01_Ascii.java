package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {//Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch1=scan.next().charAt(0);
        System.out.println("Lütfen ikinci karakter giriniz");
        char ch2=scan.next().charAt(0);
       int ilk =Math.min(ch1,ch2);
       int ikinci=Math.max(ch1,ch2);

        for (int i=ilk+1;i<ikinci;i++){
            System.out.print((char)i+" ");
        }
    }
}
