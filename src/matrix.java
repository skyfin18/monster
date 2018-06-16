public class matrix {
    public static void main (String [] args) {
        double [][] elemente = new double[8][8];
        elemente[0][0] = 0.5;
        elemente[0][1] = 0.5;
        elemente[0][2] = 2;
        elemente[0][3] = 2;
        elemente[0][4] = 1;
        elemente[0][5] = 1;
        elemente[0][6] = 1;
        elemente[0][7] = 1;
        elemente[1][0] = 1;
        elemente[1][1] = 0.5;
        elemente[1][2] = 0.5;
        elemente[1][3] = 2;
        elemente[1][4] = 2;
        elemente[1][5] = 1;
        elemente[1][6] = 1;
        elemente[1][7] = 1;
        elemente[2][0] = 1;
        elemente[2][1] = 1;
        elemente[2][2] = 0.5;
        elemente[2][3] = 0.5;
        elemente[2][4] = 2;
        elemente[2][5] = 2;
        elemente[2][6] = 1;
        elemente[2][7] = 1;
        elemente[3][0] = 1;
        elemente[3][1] = 1;
        elemente[3][2] = 1;
        elemente[3][3] = 0.5;
        elemente[3][4] = 0.5;
        elemente[3][5] = 2;
        elemente[3][6] = 2;
        elemente[3][7] = 1;
        elemente[4][0] = 1;
        elemente[4][1] = 1;
        elemente[4][2] = 1;
        elemente[4][3] = 1;
        elemente[4][4] = 0.5;
        elemente[4][5] = 0.5;
        elemente[4][6] = 2;
        elemente[4][7] = 2;
        elemente[5][0] = 2;
        elemente[5][1] = 1;
        elemente[5][2] = 1;
        elemente[5][3] = 1;
        elemente[5][4] = 1;
        elemente[5][5] = 0.5;
        elemente[5][6] = 0.5;
        elemente[5][7] = 2;
        elemente[6][0] = 2;
        elemente[6][1] = 2;
        elemente[6][2] = 1;
        elemente[6][3] = 1;
        elemente[6][4] = 1;
        elemente[6][5] = 1;
        elemente[6][6] = 0.5;
        elemente[6][7] = 0.5;
        elemente[7][0] = 0.5;
        elemente[7][1] = 2;
        elemente[7][2] = 2;
        elemente[7][3] = 1;
        elemente[7][4] = 1;
        elemente[7][5] = 1;
        elemente[7][6] = 1;
        elemente[7][7] = 0.5;


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(elemente[i][j]);
            }
            System.out.println("\n");
        }
    }
}
