package practiceAdvanced.practice07;

public class Q01_ArrayToStringNegative {
    /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String str="";
        for (String w:arr   ) {
            str=str+w;



        }
        System.out.println(str);
       String str1= str.substring(0,6)+"not"+str.substring(6);
        System.out.println(str1);

    }
}
