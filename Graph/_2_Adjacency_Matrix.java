package Graph;

import java.util.Scanner;

public class _2_Adjacency_Matrix {
    public static void main(String[] args) {
        /*
        1. A finite set of vertices also called as nodes.
        2. A finite set of ordered pair of the form (u, v) called as edge.

        Adjacency Matrix:
        Adjacency Matrix is a 2D array of size V x V where V is the number of vertices in a graph.
        Adjacency matrix for undirected graph is always symmetric. Adjacency Matrix is also used to represent weighted graphs
        PROS= Representation is easier to implement and follow
        Cons: Consumes more space O(V^2). Even if the graph is sparse(contains less number of edges), it consumes the same space

         */

        Scanner sc = new Scanner(System.in);

        // n is the number of vertices
        // m is the number of edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMat = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMat[u][v] = 1;
            adjMat[v][u] = 1;

        }
        //o(n2)
    }
}
