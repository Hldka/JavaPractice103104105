package practiceAdvanced.practice07;

import java.util.Random;

public class Q05Exception_Throw {
    public static void main(String[] args) {
        rastgeleSayi();

    }public static void rastgeleSayi(){
        Random random=new Random();
        while (true){
        int a=random.nextInt(11);
        int b=random.nextInt(11);
        try {
            if (a+b<12){throw new Exception();
            }else {


            System.out.println(a + "--" + b);
            System.out.println(a + b);}
            break;
        }catch (Exception e){
            System.out.println(a+"--"+b+"="+(a+b));
            System.out.println("Toplam 12'den kücük olamaz");
        }}

    }
}
