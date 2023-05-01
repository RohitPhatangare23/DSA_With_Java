package Graph;

import java.util.LinkedList;
import java.util.Scanner;

public class _4_AL_Implement {
    private LinkedList<Integer> adjacency[];

    public _4_AL_Implement(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    public void insertedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);
        //System.out.println(adjacency[d]);
        //System.out.println(adjacency[s]);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF VERTICES AND EDGE");
        int V = sc.nextInt();
        int e = sc.nextInt();
        _4_AL_Implement g = new _4_AL_Implement(V);
        System.out.print("enter edges");
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s, d);
        }

    }
}


