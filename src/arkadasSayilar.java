public class arkadasSayilar {
    /*
    Arkadaş sayı demek : kendinden farklı pozitif tam bölenlerinin toplamının diğer verilen sayıya eşit olmasıdır.
    İkisinin de pozitif tam bölenlerinin toplamı karşılıklı olarak birbirlerine eşitse bu iki sayı arkadaştır.
     */
    public static void main(String[] args) {

        int number1=220;
        int number2=284;
        int total=0;

        for (int i=1; i<number1; i++){
            if (number1 % i == 0) total+=i;
        }
        if (total == number2) {
            total=0;
            for (int i=1; i<number2; i++) {
                if(number2 % i == 0) total+=i;
            }
            if (total == number1) System.out.println("Bu iki sayı arkadaştır.");
        }
        else System.out.println("Bu iki sayı arkadaş değildir.");

    }

}
