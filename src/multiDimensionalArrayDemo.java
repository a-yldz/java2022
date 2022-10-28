public class multiDimensionalArrayDemo {
    public static void main(String[] args) {
        String [][] sehirler = new String[3][3];

        sehirler [0][0] = "sehir0";
        sehirler [0][1] = "sehir1";
        sehirler [0][2] = "sehir2";
        sehirler [1][0] = "sehir3";
        sehirler [1][1] = "sehir4";
        sehirler [1][2] = "sehir5";
        sehirler [2][0] = "sehir6";
        sehirler [2][1] = "sehir7";
        sehirler [2][2] = "sehir8";

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++){
                System.out.println(sehirler[i][j]);
            }
            System.out.println("**********************"); //matrislerini ayırdık yani bölgelere şehir ayırmak mesela.
        }
    }
}
