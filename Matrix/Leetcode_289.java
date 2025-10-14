class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        int[] dirs = {-1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                // Count live neighbors (based on old state)
                for (int dx : dirs) {
                    for (int dy : dirs) {
                        if (dx == 0 && dy == 0) continue;
                        int x = i + dx, y = j + dy;
                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            if (board[x][y] == 1 || board[x][y] == 2) {
                                liveNeighbors++;
                            }
                        }
                    }
                }

                // Rule 1 & 3: Live cell dies
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = 2; // 1 → 0
                }

                // Rule 4: Dead cell becomes live
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 3; // 0 → 1
                }
            }
        }

        // Final pass: reduce to new state
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) board[i][j] = 0; // died
                else if (board[i][j] == 3) board[i][j] = 1; // revived
            }
        }
    }
}
