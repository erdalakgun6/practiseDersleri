package t113_team10_genelTekrar;

public class methodOlusturma07 {
    // Bir string’te girilen karakterin kaç kere tekrar ettiğini bulan method

    public static void main(String[] args) {


        System.out.println(tekrarbul("hava güzel",'a'));


    }

    public static String tekrarbul(String strMetin, char krk) {
        String strsln ="";
        for (int i = 0; i <=strMetin.length()-1; i++) {
            if (strMetin.charAt(i)==krk){
                strsln=strMetin.replace(strMetin.charAt(i),' ');

            }

        }
        return strsln;

    }


}
