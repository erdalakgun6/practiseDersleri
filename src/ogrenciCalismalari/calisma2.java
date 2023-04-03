package ogrenciCalismalari;

public class calisma2 {
    public static void main(String[] args) {
        String kelime = " ";
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.toLowerCase());
        System.out.println(kelime.substring(0,1).toLowerCase()+kelime.substring(1).toUpperCase());
        System.out.println(kelime.indexOf("r"));//varsa index döner yoksa -1
        System.out.println(kelime.indexOf("r", 5));// "r" index no girersek ,5 5.index dahil sağda başka bakar
        //System.out.println(kelime.substring(-1,0));// begin index 0 dan küçük olmaz..
        System.out.println(kelime.length());
        System.out.println(kelime.length() - 1);
        System.out.println(kelime.contains("çal"));//true
        System.out.println(kelime.contains("Ream"));//false
        System.out.println(kelime.contains("113"));
        System.out.println(kelime.startsWith("Team"));//true
        System.out.println(kelime.startsWith("Team", 9));//false
        System.out.println(kelime.endsWith("yor"));//false
        System.out.println(kelime.contains("çal"));//true
        System.out.println(kelime.indexOf("çal",15));
        System.out.println(kelime.isEmpty());
        System.out.println(kelime.isBlank());
    }

}

