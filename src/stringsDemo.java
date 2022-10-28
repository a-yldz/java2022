import java.sql.SQLOutput;

public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı: " + mesaj.length()); //length eleman sayısını verir.

        System.out.println("7. eleman: " + mesaj.charAt(6)); // charAt belirtilen indexteki karakteri verir.

        System.out.println(mesaj.concat(" Yaşasın!!")); // concat sonuna ekleme yapar.
        System.out.println(mesaj); // kaydedilmez yani eskisini basar.

        System.out.println(mesaj.startsWith("B")); // true or false döndüren metodlar. başlıyor mu? bitiyor mu? gibi düşünülebilir.
        System.out.println(mesaj.endsWith(".")); //

        char[] karakterler = new char [5];
        mesaj.getChars(0,5,karakterler,0); //0' dan 5'e kadar olan karakterleri çekmemize yarıyor. Nereye? karakterler char dizisine 0'dan başlayarak
        System.out.println(karakterler); // ekrana bastırıyoruz ne çektiysek

        System.out.println(mesaj.indexOf("av")); //index.of metodu stringin içindeki ilk yakaladığı stringin veya char'ın indexini veriyor.
        System.out.println(mesaj.lastIndexOf("a")); // last da sondan başlayarak karşısına ilk gelen stringin veya charın indexini veriyor.

        // -------REPLACE İŞLEMLERİ----
        System.out.println(mesaj.replace(' ','*')); // Önce eskisi sonra yenisini belirtiyoruz ve değiştirmiş oluyoruz.
        // ya da yeni değişkene atayarak kullanabiliriz. Önceki kullanımda yeni değer kaydedilmez.
        String yeniMesaj = mesaj.replace(' ', '-'); //gibi
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); // alt string çıkarmak aslında. tek değer verilirse 'dan itibaren sona kadar
        System.out.println(mesaj.substring(2,7)); // iki değer verilirse bitişi de belli olur. 7ye kadar 7 dahil değil.

        //SPLIT fonksyonu belirtilen değere göre sınıflara böler mesela boşluğa göre böldürürsek kelimeleri vermiş olur bize
        String rakamlar= "12131415";
        for (String rakam : rakamlar.split("1")) { // Burada stringimizi 1e göre böldük ve sonuçta: 2-3-4-5 i elde ettik.
            System.out.println(rakam);
        }
        for (String kelime:mesaj.split(" ")) { // Burada boşluğa göre ayırarak bütün kelimeleri yazdırmış olduk.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // Lowercase bütün harfleri küçültür.
        System.out.println(mesaj.toUpperCase()); // UpperCase bütün harfleri büyütür.

        System.out.println(mesaj.trim()); // varsa gereksiz boşlukları siler. Yani başta çok fazla boşluk varsa bunu düzenler.

    }
}
