package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q02_NestedFor_ucgen { /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("satir sayisi");
        int satir=scan.nextInt();

        for (int i=0;i<satir;i++){


            for (int bosluk=satir-i;bosluk>1;bosluk--){
                System.out.print(" ");
            }for (int yildiz=0;yildiz<=i ;yildiz++){
                System.out.print("* ");
            }System.out.println();
        }



    }
}
