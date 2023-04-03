package week02;

import java.util.Scanner;

public class P05_NestedIfElseStatements {
    public static void main(String[] args) {

         /*
              1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
                 Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
                 KURALLAR
                 : 1999 yili 9. ay öncesi ise baslamis olmak
                 : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
                 : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ise baslama Yilinizi ve ayinizi 1999,09 seklinde giriniz");
        double giris = scan.nextDouble();
        if (giris > 1999.09) {
            System.out.println("Siz EYT Kanun Düzenlemesine Tabi Degilsiniz!");
        } else {
            System.out.println("Lutfen Cinsiyetinizi E veya K olarak giriniz");
            char cinsiyet = scan.next().charAt(0);
            System.out.println("Lutfen prim gün sayisizi giriniz : ");
            int primGun = scan.nextInt();
            System.out.println("Lutfen hizmet sürenizi yıl olarak giriniz : ");
            int yil = scan.nextInt();

            if (cinsiyet == 'E' || cinsiyet == 'e') {
                if (primGun >= 5500 && yil >= 25) ;
                System.out.println("Tebrikler emekli olabilirsiniz");
            } else if (primGun < 5500 && yil >= 25) {
                System.out.println("Kanun Yürürlüge Girince " + (5500 - primGun) + " gün prim sartini tamamlamanız gerekmektedir.");
            } else if (primGun >= 5500 && yil < 25) {
                System.out.println("Kanun Yürürlüğe Girince " + (25 - yil) + " yıl daha calismaniz gerekmektedir.");

            } else if (cinsiyet == 'k' || cinsiyet == 'K') {
                if (primGun >= 5000 && yil >= 20) ;
                System.out.println("Tebrikler emekli olabilirsiniz");
            } else if (primGun < 5000 && yil >= 20) {
                System.out.println("Kanun Yürürlüge Girince " + (5000 - primGun) + " gün prim sartini tamamlamanız gerekmektedir.");
            } else if (primGun >= 5000 && yil < 20) {
                System.out.println("Kanun Yürürlüğe Girince " + (20 - yil) + " yıl daha calismaniz gerekmektedir.");
            } else {
                System.out.println("yanlis bir deger girdiniz ");
            }
        }



        /*
            2- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
            kullaniciya musteri karti olup olmadigini sorun.
            Musteri karti varsa, 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
            müsteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */

        System.out.println("Lutfen urun adedini ve liste fiyati giriniz");

        int adet = scan.nextInt();
        double listeFiyati= scan.nextDouble();
        System.out.println("T113 karti varmıdır? E/H : ");
        char kart= scan.next().charAt(0);
        if (kart=='e'||kart=='E'){
            if (adet>10){
                System.out.println("%20 indirimli olarak ödemeniz gereken tutar : "+ (listeFiyati*adet*0.8));
            }else {
                System.out.println("%15 indirimli olarak odemeniz gereken tutar : "+ (listeFiyati*adet*0.85));
            }
        } else if (kart=='H'|| kart=='h') {
            if (adet>10){
                System.out.println("%15 indirimli olarak ödemeniz gereken tutar : "+(listeFiyati*adet*0.85));
            }else{
                System.out.println("%10 indirimli olarak ödemeniz gereken tutar : "+(listeFiyati*adet*0.9));
            }

        }


    }

}
