package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _5_BFS {
    private LinkedList<Integer> adjacency[];

    public _5_BFS(int v) {
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
        _5_BFS g = new _5_BFS(V);
        System.out.print("enter edges");
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s, d);
        }
        System.out.println("Enter Sourse of BFS Traversal");
        int sourse=sc.nextInt();
        g.bfs(sourse);

    }

    private void bfs(int sourse) {
        boolean visited_nodes[] = new boolean[adjacency.length];
        int parent_nodes[] = new int[adjacency.length];
        Queue<Integer> q = new LinkedList();
        q.add(sourse);
        visited_nodes[sourse] = true;
        parent_nodes[sourse] = -1;
        while (!q.isEmpty()) {
            int p = q.poll();
            System.out.print(p);
            for (int i : adjacency[p]) {
                if (visited_nodes[i] != true) {
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_nodes[i] = p;
                }
            }

        }
    }
}
