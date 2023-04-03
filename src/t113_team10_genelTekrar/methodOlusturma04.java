package t113_team10_genelTekrar;

import java.util.Scanner;

public class methodOlusturma04 {
    // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
    // faktoryel degerlerini toplayin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 10 dan kücük 2 rakam giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        int degerToplam = methodOlusturma03.faktoriyelSonuc(sayi1) +
                methodOlusturma03.faktoriyelSonuc(sayi2);

        System.out.println(degerToplam);


    }


}
