package week02;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
    /*
    1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
     *****       KAYIT BAŞARILI      *****
    Adınız: Tarık
    Soyadınız: Yiğit
    Yaşınız:42
    Mail Adresiniz:tarik@yigit.com
    Şifreniz: A2e365
    şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
     */
        Scanner scan = new Scanner(System.in);

       System.out.println("Lutfen adinizi Giriniz : ");
       String name = scan.nextLine();
       System.out.println("Lutfen Soyadinizi Giriniz : ");
       String surname = scan.nextLine();
       System.out.println("Lutfen Yasinizi Giriniz : ");
       int yas = scan.nextInt();
       System.out.println("Lutfen Eposta Adresini Giriniz : ");
       String mail = scan.next();
       System.out.println("Lutfen Bir Sifre Belirleyiniz");
       String pass = scan.next();
       System.out.println("*****       KAYIT BASARILI      *****");
       System.out.println("Adiniz : " + name);
       System.out.println("Soyadiniz : " + surname.toUpperCase());
       System.out.println("yasiniz : "+yas);
       System.out.println("E-Posta Adresiniz : "+mail);
       System.out.println("Sifre : "+ pass);
       System.out.println("================== SORU BİTTİ ======================");
       System.out.println("Kullanici : "+name.charAt(0)+". "+surname.toUpperCase()+", "+yas);
        /*
        Yukarıda aldiginiz bilgileri
        Kullanici : E.Akgun, 39
        Seklinde Yazdirin

         */
        int a=100, h=120;
        System.out.println(" Ucgenin Alanı : "+(a*h/2));

        /*

         */

        System.out.println("Lutfen iki sayi giriniz : ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("1. sayi olarak : "+sayi1+"girdiniz"+
                        "\n 2. Sayi olarak : "+sayi2+"girdiniz.");
        System.out.println("------  Hokus Pokus -----");
        sayi1 = sayi1+sayi2;
        sayi2 =sayi1-sayi2; // sayi2 sayi1'in ilk girilen degerini aldı.
        sayi1 =sayi1-sayi2;
        System.out.println("Sayi-1 :"+sayi1+"\nSayi-2 : "+sayi2);




    }
}
