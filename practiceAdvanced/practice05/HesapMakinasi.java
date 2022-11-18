package practiceAdvanced.practice05;

public class HesapMakinasi {
    public void toplama(int...a){
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }
        System.out.println("Toplam= "+toplam);

    }public void cikarma(int a,int b){
        System.out.println("Fark= "+(a-b));
    }public void carpma(int...a){
        int cont=1;
        for (int w:a){
            cont=w*cont;
        }
        System.out.println("Carpim = "+cont);
    }public void bolme(double a, double b){
        double byk=Math.min(a,b);
        double kck=Math.max(a,b);
        if (byk==0){
            System.out.println("Bölen sifir olamaz");
        }else
        System.out.println("Bölüm="+kck/byk);
    }
}
