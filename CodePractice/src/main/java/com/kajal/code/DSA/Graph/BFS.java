package com.kajal.code.DSA.Graph;

import java.util.*;

public class BFS {
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
            graph.get(y).add(x);
        }

        System.out.println("Enter the source node");
        int s = sc.nextInt();
        System.out.println("Enter the target node");
        int t = sc.nextInt();

        System.out.println("Breadth First Search Result: " + bfs(graph, s, t));

        sc.close();
    }

    public static boolean bfs(List<List<Integer>> graph, int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];

        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty()) {

            int u = queue.poll();
            for (int v : graph.get(u)) {
                if (!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }
        return visited[e];
    }
}
