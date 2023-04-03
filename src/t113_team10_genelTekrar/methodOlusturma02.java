package t113_team10_genelTekrar;

import java.util.Scanner;

public class methodOlusturma02 {
    // kullanicidan iki sayi alip,
    // toplamlarini yazdiran bir method olusturun
    public static void main(String[] args) {
        sayiToplami();

    }

    public static void sayiToplami() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("sayilar toplami : "+ (sayi1+sayi2));
    }


}
