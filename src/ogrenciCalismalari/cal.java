package ogrenciCalismalari;

public class cal {
    String isim ="john doe";
    int yas = 40;

    public cal(String isim, int yas){
        this.isim =isim;
        this.yas=30;

    }

    public static void main(String[] args) {
        cal obj=new cal("Fatih",35);
        System.out.println("isim : "+ obj.isim+
                "  yas : "+obj.yas);
    }

}
