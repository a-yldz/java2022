public class loops {
    public static void main(String[] args) {
        int i;
        boolean c=false;
        c=!c;
        System.out.println(c);

        for (i=0; i<10 ; i+=2){
            System.out.println(i);
        }
        i=0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("while bitti.");

        int j=1;
        do {
            System.out.println(j); // sisteme log atmak mesela ama işlemi gerçekleştirmemek. (örnek kullanım.)
            j+=2;
        } while (j<10);
    }
}
