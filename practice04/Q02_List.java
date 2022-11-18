package practiceAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List { /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Eklemek mi istersiniz");
        List<Integer>list=new ArrayList<>();
     while (true){
         System.out.println("Ekleme yapmak icin 'add\n"+
                 "Güncelleme yapmak icin'Update\n"+
                 "Silmek icin 'delete\n"+
                 "Cikmak icin'Quit'komutunu giriniz");
         String option=scan.next();
         if (option.equalsIgnoreCase("add")){
             System.out.println("eklemek istediginiz sayiyi giriniz");
             int ekleneceksayi=scan.nextInt();
             list.add(ekleneceksayi);
         } else if (option.equalsIgnoreCase("update")) {
             System.out.println("Güncellemek istedginiz sayiyi giriniz");
             int güncelleneceksay=scan.nextInt();
             System.out.println("Girmek istediginiz sayiyi giriniz");
          int yenisay=scan.nextInt();
          list.set(list.indexOf(güncelleneceksay),yenisay);
         } else if (option.equalsIgnoreCase("delete")) {
             System.out.println("Silmek istediginiz sayiyi giriniz");
             int silineceksayi=scan.nextInt();
             list.remove((Integer) silineceksayi);

         } else if (option.equalsIgnoreCase("quit")) {break;

         }else System.out.println("gecerli bir komut giriniz");
     }

    }
}
