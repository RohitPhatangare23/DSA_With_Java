package sp.company;

public class _3_three_dimensional_array {
    public static void main(String[] args) {


//        Declare :

        int[][][] a; // prefered
        int[][] b[];
        int[][] c[];
        int[] d[][];

//        Creation :

        a = new int[2][][];

        a[0] = new int[2][];
        a[0][0] = new int[3];
        a[0][1] = new int[2];

        a[1] = new int[2][];
        a[1][0] = new int[2];
        a[1][1] = new int[3];

//         Declaration and Creation :

        int[][][] best = new int[2][3][2];
        best[0][0][0] = 10;
        best[0][1][0] = 20;

        int[][][] best_way = {{{10, 20}, {30, 40, 50}, {60, 70}}};
        System.out.println(best_way);
        System.out.println(best_way[0]);
        System.out.println(best_way[0][0]);
        System.out.println(best_way[0][0][0]);

        System.out.println(best_way.length); //1
        System.out.println(best_way[0].length); //3
        System.out.println(best_way[0][0].length); //2
        System.out.println(best_way[0][1].length);  //3

        System.out.println("--------- retrive array---------");

        for (int i = 0; i < best_way.length; i++) {
            for (int j = 0; j < best_way[i].length; j++) {
                for (int k = 0; k < best_way[i][j].length; k++) {
                    System.out.print(best_way[i][j][k] + " ");
                }
                System.out.println("  ");
            }
        }

        for (int[][] ints : best_way) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
                System.out.println("  ");
            }
        }

    }
}
