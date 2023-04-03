package week02;

import java.util.Scanner;

public class P03_IfStatements {
    public static void main(String[] args) {

        /*
            1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
            Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
            *** String icin equals method'unu kullanin
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun : ");
        String gun = scan.next().toLowerCase();
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bugun Haftasonu - Iyi Tatiller");
        }
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println("Bugun Haftaici - Kolay Gelsin");
        }
        if (!(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") ||
                gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar"))) {
            System.out.println("Yanlis Giris Yaptınız! ");
        }
        /*
            2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
            Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
            Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu
            50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
            Ad:
            Soyad:
            1.Vize:
            2. Vize:
            Final :
            Yıl Sonu Notu:
            Ders Durumu :
         */
        System.out.print("Lutfen Adinizi Giriniz: ");
        String name = scan.nextLine();
        System.out.print("Lutfen Soyadinizi Giriniz: ");
        String surname = scan.nextLine();
        System.out.println("Lutfen Vize ve Final Notlarinizi Giriniz : ");
        System.out.print("Birinci Vize Notu : ");
        int vize1 = scan.nextInt();
        System.out.print("Ikinci Vize Notunuzu : ");
        int vize2 = scan.nextInt();
        System.out.print("Final Notu : ");
        int finalNotu = scan.nextInt();
        int yilSonuNotu = (((vize1 + vize2) / 2) * 40 / 100) + (finalNotu * 60 / 100);
        System.out.println("Adiniz : " + name);
        System.out.println("Soyadiniz : " + surname);
        System.out.println("1. Vize : " + vize1);
        System.out.println("2. Vize : " + vize2);
        System.out.println("Final : " + finalNotu);
        System.out.println("YSN : " + yilSonuNotu);
        if (yilSonuNotu >= 50) {
            System.out.println("Ders Durumu : Geçtiniz Tebrikler ");
        }
        if (yilSonuNotu <= 49) {
            System.out.println("Ders Durumu : Kaldınız");
        }


    }
}
