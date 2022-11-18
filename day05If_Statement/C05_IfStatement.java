package day05If_Statement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.

        System.out.println("Lütfen  iki sayi girniz ");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>sayi2){
            System.out.println(sayi2);
        }else if (sayi2>sayi1){
            System.out.println(sayi1);
        }else System.out.println("Sayilar birbirne esit");

        System.out.println(sayi1==sayi2? "sayilar ":sayi1>sayi2?sayi2:sayi1);
    }
}
