package practiceAdvanced.practice04;

public class Bütce {
    public static int butce;
    public int harclik;
 public void harclikAl(int alinanHarclik){
     harclik+=alinanHarclik;
 butce-=alinanHarclik;
 }public void butcedenHarca(int harcanacakpara){
     butce-=harcanacakpara;
    }public void harclikHarca(int harclikHarcamasi){
     harclik-=harclikHarcamasi;
    }public void maasal(int alinanMaas){

     butce+=alinanMaas;
    }
}
