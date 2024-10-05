package org.example;

public class Solution {

    public boolean solution(int[][] tossConvenience, int[] entrancePoint) {
        boolean result = false;
        int x = entrancePoint[0];
        int y = entrancePoint[1];

        if (x > tossConvenience.length - 1 || y > tossConvenience[0].length - 1) {
            return false;
        }

        // 현재 포지션
        int current = tossConvenience[x][y];

        while(current != 7) {
            current = movingRL(tossConvenience, x, y);
            if (current == 7) {
                return true;
            }

            current = movingUpDown(tossConvenience, x, y);
            if (current == 7) {
                return true;
            }

            return false;
        }

        return result;
    }

    private int movingUpDown(int[][] tossConvenience, int x, int y) {
        int distance = tossConvenience[x][y];

        if (tossConvenience.length < tossConvenience[x + distance][0]) {
            return tossConvenience[x - distance][0];
        } else {
            return tossConvenience[x + distance][0];
        }
    }

    public int movingRL(int[][] tossConvenience, int x, int y) {
        int distance = tossConvenience[x][y];

        if (tossConvenience[0].length < tossConvenience[x][y + distance]) {
            return tossConvenience[x][y - distance];
        } else {
            return tossConvenience[x][y + distance];
        }
    }

    public boolean isSafe(int currentPoint) {
        return currentPoint == 7;
    }

    public static void main(String[] args) {
        int startX = 0;
        int startY = 0;

        int[] entrancePoint = {startX, startY};

        int[][] tossConvenience = {
                {1, 2, 3, 2, 1},
                {4, 2, 0, 7, 2},
                {1, 3, 3, 8, 1},
                {2, 0, 1, 1, 1},
                {8, 2, 8, 1, 1},
        };

        Solution solution = new Solution();
        System.out.println(solution.solution(tossConvenience, entrancePoint));
    }
}
