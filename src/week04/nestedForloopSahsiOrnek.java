package week04;

public class nestedForloopSahsiOrnek {
    /*

     * * * * * * * * * *
     * * * *     * * * *
     * * *         * * *
     * *             * *
     *                 *

     */

    public static void main(String[] args) {
        int satir =5;

        for (int i = satir; i >=1  ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }



            for (int m = 2*(satir-i); m >=1 ; m--) {

                System.out.print("  ");

            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
