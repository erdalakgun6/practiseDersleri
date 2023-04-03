package week08;

import java.util.Arrays;

public class P02_Arrays {
    // verilen bir arraydeki pozitif tamsayilari toplayip sonucu bize donduren bir method yazdirin.

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 6};
        toplamArr(arr);
    }

    public static int toplamArr(int[] arr) {
        int toplamArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplamArr += arr[i];
            }

        }
        return toplamArr;
    }


}

