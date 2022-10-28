public class reCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2,9.2,3.4,5.7};
        double total=0;
        double max = myList[0];

        for (double listeElemani:myList){
            if (max < listeElemani) {
                max = listeElemani;
            }
            total+=listeElemani;
            System.out.println(listeElemani);
            System.out.println("sonuç: " + total);
            System.out.println("============================");
        }
        System.out.println("En büyük eleman : " + max);
    }
}
