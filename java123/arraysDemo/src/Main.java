public class Main {
    public static void main(String[] args) {


        String ogrenci1 = "Engin";
        String ogrenci2 = "Necmeddin";
        String ogrenci3 = "Sıdıka";
        String ogrenci4 = "Aden";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Necmeddin";
        ogrenciler[2] = "Sidika";
        ogrenciler[3] = "Aden";

        for(int i=0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}