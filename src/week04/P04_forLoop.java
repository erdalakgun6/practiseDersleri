package week04;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("150den Kucuk pozitif bir tam sayi giriniz : ");
        int girilenSayi = scan.nextInt();
        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%3==0&&i%5==0){
                System.out.print(" WISE-QUARTER ");
            }else if (i%5==0){
                System.out.print(" QUARTER ");
            } else if (i%3==0) {
                System.out.print(" WISE ");
            }else {
                System.out.print(i+" ");
            }
        }
    }

}
