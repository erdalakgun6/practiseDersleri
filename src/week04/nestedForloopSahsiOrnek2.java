package week04;

public class nestedForloopSahsiOrnek2 {
    /*
     Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

     */

    public static void main(String[] args) {

        int satir =5;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=satir-i ; j++) {

                System.out.print(" ");

            }
            for (int m = 1; m <=2*i-1 ; m++) {
                System.out.print("*");


            }

            System.out.println("");

        }

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(" ");

            }
            for (int j = 1; j <=2*satir-2*i-1 ; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }


    }
}
