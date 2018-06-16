public class matrix {
    public static void main (String [] args) {
        double [][] elemente = new double[8][8];
        elemente[0][0] = 0;
        elemente[0][1] = 1;
        elemente[0][2] = 1;
        elemente[0][3] = 0;
        elemente[0][4] = 2;
        elemente[0][5] = 2;
        elemente[0][6] = 2;
        elemente[0][7] = 0;
        elemente[1][0] = 3;
        elemente[1][1] = 0;
        elemente[1][2] = 1;
        elemente[1][3] = 2;
        elemente[1][4] = 2;
        elemente[1][5] = 3;
        elemente[1][6] = 3;
        elemente[1][7] = 0;
        elemente[2][0] = 3;
        elemente[2][1] = 0;
        elemente[2][2] = 0;
        elemente[2][3] = 1;
        elemente[2][4] = 3;
        elemente[2][5] = 0;
        elemente[2][6] = 2;
        elemente[2][7] = 1
        ;


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == j) {
                    elemente[i][j] = 0;
                }
            }
        }
    }
}
