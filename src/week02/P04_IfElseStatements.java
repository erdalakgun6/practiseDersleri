package week02;

import java.util.Scanner;

public class P04_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
            1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
                85-100 -----> AA
                80-85 ------> BA
                75-80 ------> BB
                65-75 ------> CB
                50-65 ------> CC
                50 Altı ise  ------> FF
         */
        System.out.println("Lutfen Notunuzu Giriniz : ");
        int not = scan.nextInt();
        if (not>85 && not<=100){
            System.out.println(" Sinav Notunuz : "+not+" Harf Notunuz : AA ");
        }else if (not>=80 && not<85){
            System.out.println(" Sinav Notunuz : "+not+" Harf Notunuz : BA ");
        }else if (not>=75 && not<80) {
            System.out.println(" Sinav Notunuz : " + not + " Harf Notunuz : BB ");
        }else if (not>=65 && not<75) {
            System.out.println(" Sinav Notunuz : " + not + " Harf Notunuz : CB ");
        }else if (not>=50 && not<65) {
            System.out.println(" Sinav Notunuz : "+not+" Harf Notunuz : CC ");
        }else {
            System.out.println("Sinav Notunuz : "+not+" Harf Notunuz FF");
        }
        /*
            Not: Birden fazla if, else if, else durumlarinda en son adima bakilir
            else ile bitiyorsa tüm ihtimaller kapsanir.
            else if ile bitiyorsa kapsanmayan ihtimaller vardir.
        */
        /*
             2- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
                sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
                "istediginiz birim sisteme kayitli degil" yazdirin.
        */
        System.out.println("Lutfen mesafeyi kilometre olarak giriniz : ");
        double km = scan.nextDouble();
        System.out.println("Lutfen Donusturmek istediginiz birimi giriniz orn. mt : ");
        char birim = scan.next().charAt(0);
        if (birim == 'm' || birim == 'M') {
            System.out.println("Girdiginiz mesafenin metre degeri : " + km * 1000 + " 'dir.");
        } else if (birim == 's' || birim == 'S') {
            System.out.println("Giridiginiz mesafenin santimetre degeri : " + km * 1000 * 100 + " 'dir.");
        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
        /*
            Soru ) Interview Question
            Kullanicidan artik yil olup olmadigini kontrol
            etmek icin yil girmesini isteyin.
            Kural 1: 4 ile bolunemeyen yillar artik yil  egildir
            Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
            Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
        */
        System.out.println("Lutfen KOntrol Etmek istediginiz yılı giriniz : ");
        int yil = scan.nextInt();
        if (yil % 100 == 0 && yil % 400 == 0 || yil % 100 != 0 && yil % 4 == 0) {
            System.out.println("Girdiginiz yıl artık yil'dir");
        } else {
            System.out.println("girdiginiz yil artik yil degildir.");
        }
        /*
            3-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
            yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
            olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
         */
        System.out.println("Lutfen Yasinizi giriniz : ");
        int yas= scan.nextInt();
        System.out.println("Lutfen Cinsiyetinizi giriniz : ");
        char cinsiyet = scan.next().charAt(0);
        if ( (cinsiyet=='k'|| cinsiyet=='K')&& yas>=60 ){
            System.out.println("emekli olabilirsin");
        }
        if ((cinsiyet=='k'|| cinsiyet=='K')&& yas<60){
            System.out.println("Emekli Olmak icin : " +(60-yas)+ " yıl daha calismalisiniz");
        }
        if ((cinsiyet=='e'|| cinsiyet=='E')&&yas>=65){
            System.out.println("emekli olabilirsin");
        }
        if ((cinsiyet=='e'|| cinsiyet=='E') && yas<65){
            System.out.println("emekli olmak icin : "+ (65-yas)+ " yıl daha calismalisiniz");
        }


    }
}
