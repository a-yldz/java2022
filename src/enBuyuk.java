public class enBuyuk {
    public static void main(String[] args) {
        int sayi1 = 222;
        int sayi2 = 295;
        int sayi3 = 222;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }


        System.out.println("En büyük sayı : " + enBuyuk);
    }
}
