package week01;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz : ");
        String name = scan.next();
        System.out.println("Lutfen soyadinizi giriniz : ");
        String surname = scan.next();
        System.out.println("Lutfen yasinizi giriniz : ");
        int age = scan.nextInt();
        System.out.println("E-posta adresinizi giriniz : ");
        String mail = scan.next();
        System.out.println("Lutfen Sifrenizi giriniz : ");
        String pass = scan.next();

        System.out.println("**********     KAYIT BASARILI     ******\n" +"\n"+ "\tAdiniz : " + name + "\n\tSoyadiniz : " + surname+
                "\n\tYasiniz : " + age + "\n\tMail Adresiniz : " + mail + "\n\tSifreniz : " + pass);


    }
}
