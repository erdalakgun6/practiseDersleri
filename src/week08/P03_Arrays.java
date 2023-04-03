package week08;

public class P03_Arrays {
    // verilen bir arraydeki tum elementleri bir saga kaydirip, sondaki elementi de
    // basa tasiyacak bir method olusturun, arrayi yeni hali kaydedin.

    public static void main(String[] args) {
        int[] arr= {3,5,3,8,6};
        sagaKaydirma(arr);
    }

    public static int[] sagaKaydirma(int[] arr) {
        int[] yeniArr= new int[arr.length];
        yeniArr[0]= arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i+1]=arr[i];

        }arr=yeniArr;
        return arr;

    }


}
