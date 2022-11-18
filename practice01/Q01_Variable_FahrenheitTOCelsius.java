package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitTOCelsius {
    public static void main(String[] args) {
        /*
        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
// formül: c = (f-32)*5/9
         */

        Scanner scan =new Scanner(System.in);
        System.out.println(" Fahrenheit giriniz ");
        double fahr=scan.nextDouble();
        double celsius=(fahr-32)*5/9;
        System.out.println("Celsius : "+ celsius);
        NumberFormat numberFormat=new DecimalFormat(".##");
String formattedC = numberFormat.format(celsius);
        System.out.println("Celsius  :"+ formattedC);
        double doublec=Double.valueOf(formattedC+1);// concatination
        System.out.println("doublrC = "+ (doublec+1));// maths resultat. addieren







    }
}
