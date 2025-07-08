package practice.src.DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter the number of edges");
        int m = sc.nextInt();

        // Initialize graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x); // If the graph is undirected
        }

        System.out.println("Enter the source node");
        int s = sc.nextInt();
        System.out.println("Enter the target node");
        int t = sc.nextInt();

        boolean[] visited = new boolean[n];
        dfs(s,graph,visited);
        try {
            System.out.println("Depth First Search Result: " + visited[t]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No Path");
         }
        sc.close();
    }

    private static void dfs(int u,List<List<Integer>> graph, boolean[] visited) {
        visited[u] = true;
        for(int v : graph.get(u)) {
            if(!visited[v]) {
                dfs(v,graph,visited);
            }
        }
    }
}
