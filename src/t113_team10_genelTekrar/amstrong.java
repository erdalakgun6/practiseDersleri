package t113_team10_genelTekrar;

import java.util.Scanner;

public class amstrong {

    public static void main(String[] args) {
        /*
        Armstrong Sayı Nedir ?
    N haneli bir sayının basamaklarının n'inci üstlerinin toplamı, sayının kendisine eşitse,
    böyle sayılara Armstrong sayı denir.

  Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
   Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

  1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için
   armstrong sayı olmaz.

   1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

   54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi=scan.nextInt();

        int girilenSayi=sayi;
        int toplam=0;
        int basamakSayisi=String.valueOf(sayi).length();
        int kalan=0;

        while (girilenSayi>0){
            kalan=girilenSayi%10;
            toplam+=Math.pow(kalan,basamakSayisi);
            girilenSayi/=10;



        }
        System.out.println(toplam==sayi
                ? "Armstrong sayidir"
                : "Armstrong sayi degildir");

    }

}
