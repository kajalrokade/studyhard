package src.DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * what is cycle in the graph : So if the node encountered more than once in the same path is called cycle .
 */
public class DetectCycle {
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
        }

        System.out.println("Enter the source node");
        int s = sc.nextInt();

        boolean[] visited = new boolean[n];
        List<Integer> path = new ArrayList<>();

        if (cycle(s, graph, visited, path))
            System.out.println("Cycle Present in Graph");
        else
            System.out.println("Cycle in not Present in Graph");

        sc.close();
    }

    private static boolean cycle(int s, List<List<Integer>> graph, boolean[] visited, List<Integer> path) {
        visited[s] = true;
        path.add(s);
        for (int v : graph.get(s)) {
            if (path.contains(v)) {
                return true;
            } else if ((!visited[v]) && cycle(v, graph, visited, path))
                return true;
        }
        path.removeLast();
        return false;
    }
}
