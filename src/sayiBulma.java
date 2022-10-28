public class sayiBulma {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int wanted = 9;

        for (int sayi : numbers){
            if(sayi == wanted) {
                System.out.println("Aradığınız sayı bulunmuştur.");
                return;
            }
        }
        System.out.println("Aradığınız sayı bulunamadı.");
    }
}
