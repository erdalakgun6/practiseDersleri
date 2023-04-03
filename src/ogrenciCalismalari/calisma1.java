package ogrenciCalismalari;

import java.util.Scanner;

public class calisma1 {
    public static void main(String[] args) {
        /*Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek
        istedigini alin ve girilen harfin karsiligini yazdirin.
        I : International S : Software T : Testing Q : Qualifications B: Board
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Öğrenmek istediğiniz ISTQB harflerinden birini giriniz..: ");
        char krk = scan.next().charAt(0);
        krk=Character.toUpperCase(krk);
        switch (krk){
            case 'I':
                System.out.println("International");
                break;
            case  'S':
                System.out.println("Software");
                break;
            case  'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("Yalnış bir harf girdiniz....");
        }


    }
}
