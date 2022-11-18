package practiceAdvanced.practice02;

import java.util.Arrays;

public class Q03_For_EuroDolarToplami {
    public static void main(String[] args) {
        /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */
        String euro="$1 $12 €34 €56 $45 €78";
       String[]arr= euro.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolar=0;
        int eu=0;
        for (String w:arr  ) {
            if (w.startsWith("$")) {dolar+=Integer.parseInt(w.replace("$",""));
            }else {eu+=Integer.parseInt(w.replace("€",""));}
            }
        System.out.println("Dolar toplami : "+dolar);
        System.out.println("Euro toplami  : "+ eu);

        }


    }

