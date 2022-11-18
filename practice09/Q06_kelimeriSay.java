package practiceAdvanced.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q06_kelimeriSay {
    /*

 Bir String içerisindeki kelimelerin kaç kez tekrar ettiğini bulan bir method yazınız.

 input: "Ali okula geldi ve Ayse de okula geldi."
 output: Ali = 1, okula = 2, geldi = 2, ve = 1, Ayse= 1, de = 1

*/
    public static void main(String[] args) {
        String str="Ali,   okula   ...,,, geldi ve Ayse de okula geldi.";
        kelimelerisay(str);


    }public static void kelimelerisay(String str){
      String yeniString= str.replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim();
        System.out.println("str:"+yeniString);
      String[] arr=yeniString.split(" ");

      Map<String,Integer> kelimeTekrarlari=new HashMap<>();
        for (String w:arr) {
            if (!kelimeTekrarlari.containsKey(w)){kelimeTekrarlari.put(w,1);}else kelimeTekrarlari.put(w,kelimeTekrarlari.get(w));

        }
        System.out.println("KelimeTekrari: "+kelimeTekrarlari);
    }
}
