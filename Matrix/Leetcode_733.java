import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color) return image;

        int m = image.length, n = image[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1];

            if (r < 0 || r >= m || c < 0 || c >= n) continue;
            if (image[r][c] != original) continue;

            image[r][c] = color;

            queue.add(new int[]{r + 1, c});
            queue.add(new int[]{r - 1, c});
            queue.add(new int[]{r, c + 1});
            queue.add(new int[]{r, c - 1});
        }

        return image;
    }
}
