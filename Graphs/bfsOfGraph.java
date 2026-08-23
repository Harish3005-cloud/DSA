package Graphs;
import java.util.*;

public class bfsOfGraph {
    public ArrayList<Integer> BFS(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);
            for (int neighbour : adj.get(node)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        for (int i = 0; i < E; i++) {
            System.out.println("Enter edge " + (i + 1) + " (u v):");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        bfsOfGraph obj = new bfsOfGraph();
        ArrayList<Integer> result = obj.BFS(V, adj);
        System.out.println("BFS traversal: " + result);
    }
}
