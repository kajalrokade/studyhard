package com.kajal.code.DSA.leetcode;

public class RottenOrangesMinutes {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(new RottenOrangesMinutes().orangesRotting(grid));
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int minutes = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (grid[i][j] == 2 && grid[i][j + 1] == 1 && grid[i + 1][j] == 1) {
                    grid[i][j + 1] = 2;
                    grid[i + 1][j] = 2;
                    minutes++;
                } else if (grid[i][j] == 2 && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = 2;
                    minutes++;
                } else if (grid[i][j] == 2 && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = 2;
                    minutes++;
                }
                System.out.println(i + "," + j);
            }
        }
        return minutes;
    }
}
