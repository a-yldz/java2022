public class switchCase {
    public static void main(String[] args) {
        char grade = 'Z';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : geçtiniz. ");
                break;
            case 'B':

            case 'C' :
                System.out.println("Çok güzel : geçtiniz. ");
                break;
            case 'D' :
                System.out.println("Fena değil : geçtiniz. ");
                break;
            case 'F' :
                System.out.println("Maalesef kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }

    }
}
