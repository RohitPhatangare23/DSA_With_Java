package sp.company;

import java.util.Arrays;

public class _2_two_dimensional_array {
    public static void main(String[] args) {


//        Declaration :

        int[][] a;  //prefere
        int[][] b;
        int c[][];
        int[] d[];

        int[][] x, z; //x,z both are 2-d;
        //int[] x[],z[]; //x,z both are 2-d;
        int[] q[], w;   // i is 2-d but j 1-d;
        //int[][] x,z[]; //x=2-d and z=3-d;
        //int[][] x,[]z; //x=3-d and z=2-d;   variable is pehale he dimension provide karte ho that's why it's  sho compile time error.

//        Creation :

        int[][] low;
        low = new int[2][3];


//        Initialization :

        low[0][0] = 10;
        low[0][1] = 56;
        low[0][2] = 34;
        low[1][0] = 13;
        low[1][1] = 60;
        low[1][2] = 17;

        //in single  line best way to write
        int[][] best = {{10, 20, 30}, {40, 50, 60}};


//        JAGGED ARRAY :

        int[][] jag = new int[2][];
        jag[0] = new int[4];
        jag[1] = new int[3];

        jag[0][0] = 55;
        jag[0][1] = 35;
        jag[0][2] = 65;
        jag[0][3] = 15;

        jag[1][0] = 78;
        jag[1][1] = 48;
        jag[1][2] = 28;


        //in single  line best way to write
        int[][] best_jag = {{10, 20, 30, 40}, {40, 50, 60}};


//        Retrive :

        int[][] re = {{10, 20, 30, 40}, {50, 60}, {70, 80, 90}};

        System.out.println(re);
        System.out.println(re[0]);
        System.out.println(re[0][0]);
        System.out.println(re.length);
        System.out.println(re[0].length);
        //System.out.println(re[0][0].length);  //int cannot be dereferenced

        //Jagged array:
        System.out.println(jag);
        System.out.println(jag[0]);  //if value not assign show = null
        System.out.println(jag[0][0]);  //reuntimeexception
        System.out.println(re.length);
        System.out.println(re[0].length);


        /*

        for (int[] ints : re) {
            for (int y = 0; y < ints.length; y++)
                System.out.print(ints[y] + " ");

        }

        System.out.println();

         */

        for (int i = 0; i < re.length; i++) {
            for (int j = 0; j < re[i].length; j++) {
                System.out.print(re[i][j] + " ");
            }
            System.out.println();
        }
    }
}
