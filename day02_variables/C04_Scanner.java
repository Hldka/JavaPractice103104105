package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
/*
        System.out.println(" Lütfen 4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
        int ilkr= sayi%10;
        int son=sayi/1000;
        System.out.println("ILK rakamla son rakamin toplami "+(ilkr+son));

        //2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
Scanner scan1= new Scanner(System.in);
        System.out.println("Ücbasamakli bir sayi yaziniz");
        int sa=scan1.nextInt();
        int bir=sa%10;
        int on=sa/10%10;
        int yuz=sa/100;
        System.out.println("girdiginiz sayinin birler basamagi :"+bir);
        System.out.println("girdiginiz sayinin Onlar basamagi :"+on);
        System.out.println("girdiginiz sayinin Yüzler basamagi :"+yuz);

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        System.out.println("Lütfen 5 Basamakli bir sayi giriniz...");
        int num = scan.nextInt();
        int num1=num%10;
        int num2=num/10%10;
        int num3=num/1000%10;
        int num4=num/10000;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        int sam=num1+num2+num3+num4;
        System.out.println("Ilk iki sayi ile son iki sayinin toplami = "+sam);




*/










        System.out.println("Lütfen 5 basamakli bir sayi yaziniz...");
        int say=scan.nextInt();
        int ilk1=say%10;
        int ilk2=say/10%10;
        int son2=say/1000%10;
        int son1=say/10000;
        System.out.println(ilk1);
        System.out.println(ilk2);
        System.out.println(son2);
        System.out.println(son1);
        int toplam=ilk1+ilk2+son1+son2;

        System.out.println("Ilk 2 ve son iki rakamin toplami = "+ toplam);


/*
        System.out.println("5 basamakli bir sayi giriniz...");
        int zi=scan.nextInt();

        int z1=zi%10;
        int z2=zi/10%10;
        int z3=zi/1000%10;
        int z4=zi/10000;
        int saMM=z1+z2+z3+z4;
        System.out.println("Erste zwei ziffern und letzte zwei ziffern addiren ist = "+(saMM));

*/

// Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz

        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12



        Scanner input = new Scanner(System.in);

        System.out.println(" Lutfen 5 basamakli bir sayi giriniz ");

        int num=input.nextInt();
        int ilkIkirkm=num/1000;
        System.out.println("ilkIkirkm = " + ilkIkirkm);//12

        int ilkIkiTop=(ilkIkirkm%10)+(ilkIkirkm/10);//2+1
        System.out.println("ilkIkiTop = " + ilkIkiTop);//3

        int sonIkiRkm=num%100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);//45
        int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);//5+4
        System.out.println("sonIkiTop = " + sonIkiTop);


        int toplm=ilkIkiTop+sonIkiTop;
        System.out.println("toplam = " + toplm);




    }


}
