package practiceAdvanced.practice03;

import java.util.Arrays;

public class Q03_Arrays_ikincima {
/*
   Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.

   input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
   output: min:-90, max:10001, secMax: 8787

  */

    public static void main(String[] args) {
int [] arr={100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int mina= arr[0];
        int max=arr[arr.length-1];
        System.out.println(max);
        int second=arr [arr.length-2];
        System.out.println("min: "+mina+" max: "+max+" maxsecond :"+second);
        //2.Yol :
        int min=arr[0];
        int secmax=arr[0];
        int maxi=arr[0];
        for (int w:arr
             ) {if (w<min){
                 min=w;
        } else if (w>maxi) {secmax=maxi;
                 maxi=w;
             } else if (w>secmax) {secmax=w;

        }

        }
        System.out.println("min: "+min+"SecMax"+secmax+" max:"+maxi);
    }
}
