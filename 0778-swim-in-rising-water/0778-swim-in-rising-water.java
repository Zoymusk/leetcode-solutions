class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        // min-heap ordered by elevation: {elevation, row, col}
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[n][n];

        heap.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int maxSoFar = 0;

        while (!heap.isEmpty()) {
            int[] cur = heap.poll();
            int elevation = cur[0], r = cur[1], c = cur[2];
            maxSoFar = Math.max(maxSoFar, elevation); // water needed at least this much to get here

            if (r == n - 1 && c == n - 1) return maxSoFar; // reached the target

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    heap.offer(new int[]{grid[nr][nc], nr, nc});
                }
            }
        }
        return -1; 
    }
}