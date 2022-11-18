package practiceAdvanced.practice10;

public class Q05_VarArgs_ilkHaricTopla {

     /*
Parametrelerinin ilki hariç  karakter sayılarını toplayan ve bu toplamı birinci parametrenin karakter sayısıyla çarpan bir kod yazınız.
(indeks ve if statement kullanmayınız)
   */
     public static void main(String[] args) {
         mymethod("Ali","Veli","Sally","Holly");
     }public static void mymethod(String a,String...b){
         int toplm=0;
        for (String w:b
             ) {toplm=toplm+w.length();

        }int sonuc=toplm*a.length();
        System.out.println("sonuc="+sonuc);
    }
}
