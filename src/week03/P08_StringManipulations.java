package week03;

import java.util.Scanner;

public class
P08_StringManipulations {
    public static void main(String[] args) {
        //String manipulation
        // System.out.print("lütfen Kullanıcı adınızı giriniz");
        String str1="Emre Can";
        String str2="Emre Can";
        String str3=new String("Emre Can");

        //str1=str1.toLowerCase(); //emre can
        //System.out.println(str1);
        //str1=str1.toUpperCase();//EMRE CAN
        //equals methodu
        // System.out.println(str1.equals(str2)); // referansına bakar
        // System.out.println(str1==str2);
        // System.out.println(str1.equalsIgnoreCase(str2));
        // System.out.println(str1.equals(str3));
        // System.out.println(str1==str3);
        //System.out.println(str1.charAt(0));

        String str11="Ali";
        String str12="ali";
        //System.out.println(str11.equals(str12));
        //System.out.println(str11.equalsIgnoreCase(str12));
        // System.out.println(str1.length()); //length 1'den başlar boşluk dahil sayar
        //System.out.println(str1.length()-1);

        // System.out.println(str2.substring(1,6));
        // System.out.println(str2.substring(4));

        //int sayi=01;

        //System.out.println(str2.concat("_wise"));//Emre Can_wise

        // System.out.println(str2.substring(9));
        //   String name3="ÇekoslavakyalılaştıramadıklarımızdanMısınız";
        //   System.out.println(name3.length());
        //   System.out.println(name3.substring(44));

        //System.out.println(name3.substring(45));

        // String login="Üye Girişi";
        // System.out.println(login.contains("Üye")); //true
//
        // System.out.println(login.startsWith("Ü")); //true
        // System.out.println(login.endsWith("i")); //true
        // System.out.println(login.indexOf("ş"));
        // System.out.println(login.lastIndexOf('i'));
        // System.out.println(str1.isEmpty());

        /*
        \\s : space
        \\S :space olmayan her şey
        \\s+ :yanyana olan birden fazla space
        \\d : digit
        \\D : digit olmayan her şey
        \\w :harf veya rakam
        \\W : harf veya rakam olmayan herşey
         */
        //  String marka="Wise3@*9 Quarter";
        //  marka=marka.replaceAll("\\d","");
        //  System.out.println(marka);
        //  marka=marka.replaceAll("\\W"," ");
        //  System.out.println(marka);




    }
}
