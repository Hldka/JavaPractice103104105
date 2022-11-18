package practiceAdvanced.practice07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_UzunKelime {/*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle yaziniz");
        String cümle=scan.nextLine();



        System.out.println(enUzunKelime(cümle));


    }public static List<String> enUzunKelime(String cümle){
        String[] arr=cümle.split(" ");
        int max = 0;

        for (String w : arr) {
            if (w.length() > max) {
                max = w.length();
            }
        }

        List<String> enUzunKelimeler = new ArrayList<>();
        for (String w:arr){
            if(w.length()==max){
                enUzunKelimeler.add(w);
            }
        }


        return enUzunKelimeler;
        }


    }

