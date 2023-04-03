package t113_team10_genelTekrar;

import java.util.Scanner;

public class methodOlusturma03 {
    // verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method ousturun
    public static void main(String[] args) {
       int toplam = faktoriyelSonuc(8);
        System.out.println(toplam);
    }

    public static int faktoriyelSonuc(int sayi) {

        int faktoriyel = 1;
        for (int i = sayi; i >=1; i--) {

            faktoriyel*=i;

        }
        return faktoriyel;
    }


}
