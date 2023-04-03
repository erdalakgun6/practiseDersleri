package week04;

import java.util.ArrayList;
import java.util.Random;

public class sıralamaCekilisi {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("cahit");
        isimler.add("gaye");
        isimler.add("berker");
        isimler.add("erdal a");
        isimler.add("melike");
        isimler.add("nurefşan");

        Random random = new Random();
        ArrayList<String> rastgeleIsimler = new ArrayList<>();
        while (!isimler.isEmpty()) {
            int index = random.nextInt(isimler.size());
            String isim = isimler.remove(index);
            rastgeleIsimler.add((rastgeleIsimler.size() + 1) + ". " + isim);
        }

        System.out.println("İsimlerin rastgele sıralanmış hali:");
        for (String isim : rastgeleIsimler) {
            System.out.println(isim);
        }
    }
}
