package week08;

import java.util.Arrays;

public class P01_Arrays {
    // verilen bir int arrayin tüm elemanlarini 2 artirip bize donduren bir method
    // olusturun. eski arrayi yeni haliyle kaydedin

    public static void main(String[] args) {
        int [] arr = {4,3,7,5,8,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayeIkiEkle(arr)));

    }

    public static int[] arrayeIkiEkle(int[] arr) {

        int [] yeniArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i] + 2;

        }arr=yeniArr;
        return arr;
    }

}
