package t113_team10_genelTekrar;

import java.util.Scanner;

public class methodOlusturma06 {

    // Verilen bir String'in Palindrome olup olmadigini yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz : ");

        String metin = scan.nextLine();
        String tersMetin = methodOlusturma05.tersCevirme(metin);


    }




}
