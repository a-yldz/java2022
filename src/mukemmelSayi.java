public class mukemmelSayi {
    /*
    Mukemmel sayı kendinden başka pozitif tam bölenlerinin toplamının yine kendisine eşit olan sayıya denir.
     */
    public static void main(String[] args) {
        // örnek mükemmel sayılar 6 ve 28
        // 6 --> 3+2+1 ====== 28 --> 14+7+4+2+1
        int number = 9;
        int total = 0;

        for (int i=1; i<number; i++) {
            if(number % i == 0) total+=i;
        }
        if (total == number) System.out.println("Sayı mükemmel sayıdır.");
        else System.out.println("Sayı mükemmel sayı değildir.");
    }
}
