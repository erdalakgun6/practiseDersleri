package t113_team10_genelTekrar;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String sifre = "";
        int flag=0;
        int denemeSayisi=0;

        while (flag != 4){
            flag=0;
            System.out.println("Lutfen bir sifre giriniz");
            sifre=scan.nextLine();


            System.out.println( sifre.charAt(0)>='a'&&sifre.charAt(0)<='z'? flag++ :"ilk karakter kucuk harf olmali");
            System.out.println(sifre.charAt(sifre.length()-1)>='A'&& sifre.charAt(sifre.length()-1)<='Z'? flag++ : "son karakter buyuk olmali");
            System.out.println(sifre.contains(" ")?"sifre bosluk icermemeli": flag++ );
            System.out.println(sifre.length()>=8 ? flag++ : "uzunluk en az 8 karakter olmali");
            denemeSayisi++;
        }
        System.out.print("Tebrikler " +denemeSayisi+  " denemede sifreniz basariyla kaydedildi");


    }

}
