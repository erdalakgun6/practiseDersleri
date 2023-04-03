package t113_team10_genelTekrar;

public class methodOlusturma05 {
    // verilen bir stringi tersine cevirip
    // bize donduren bir method olusturun

    public static void main(String[] args) {


        System.out.println(tersCevirme("Team10 Başaracaktır."));
        System.out.println(tersCevirme("hava"));
    }

    public static String tersCevirme(String metin) {
        String tersMetin ="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin +=metin.charAt(i);

        }
        return tersMetin;
    }


}
