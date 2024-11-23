import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int time = 0;
        int cnt = 0;

        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    cnt++;
                }
            }
        }

        if (cnt == 0)
            return time;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                for (int[] dir : dirs) {
                    int nr = dir[0] + curr[0];
                    int nc = dir[1] + curr[1];

                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        q.add(new int[] { nr, nc });
                        grid[nr][nc] = 2;
                        cnt--;
                        if (cnt == 0)
                            return time + 1;
                    }

                }
            }
            time++;
        }
        return -1;
    }
}