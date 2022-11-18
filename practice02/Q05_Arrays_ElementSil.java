package practiceAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    public static void main(String[] args) {
        /*
     Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */
        Scanner input=new Scanner(System.in);
        System.out.println("array limitini giriniz");
        int limit=input.nextInt();
        int [] arr=new int[limit];
        for (int i=0;i<limit;i++){
            System.out.println("Giriniz : Indeks"+i);
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Silmek istedigini indeksi giriniz..");
        int removeIndex=input.nextInt();
        int idx=0;
        int[]brr=new int[limit-1];
        for (int i=0;i<limit;i++){if (removeIndex==arr[i]){continue;}else brr[idx]=arr[i];idx++;}
        System.out.println(Arrays.toString(brr));//2.yol
        List<Integer>numberlist=new ArrayList<>();
        for (int w:arr) {numberlist.add(w);

        }
        System.out.println(numberlist);
        System.out.println("Silmak istediginiz elementin indeksini giriniz");
        int silinecekIdx=input.nextInt();
        numberlist.remove(silinecekIdx);
        System.out.println(numberlist);
    }
}
