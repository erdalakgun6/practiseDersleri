package week04;

import java.util.Scanner;

public class P08_forLoop {
    public static void main(String[] args) {
        // verilen bir pozitif tam sayinin
        // pozitif tam bolenlerini yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<=0){
            System.out.println("yanlis giris yapildi");
        }else {

        } for (int i = 1; i <sayi ; i++) {
            if (sayi %i ==0){
                System.out.print(i+" ");
            }
        }
    }

}
