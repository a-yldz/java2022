public class miniDemoAsal {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if (number == 2) isPrime=true;

        if (isPrime) System.out.println("Sayı asaldır.");
        else System.out.println("Sayı asal değildir.");
    }
}
