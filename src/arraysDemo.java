public class arraysDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";

        System.out.println(ogrenci1);

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin0";
        ogrenciler[1] = "Engin1";
        ogrenciler[2] = "Engin2";
        ogrenciler[3] = "Engin3";

        for (int i=0; i<ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);

        }

        for (String a:ogrenciler){ // a diye belirtilen yere istediğimiz ismi verebiliriz. ikinci verdiğimiz değer ise tanımladığımız Stringimiz.
            System.out.println(a);
        }

    }
}
