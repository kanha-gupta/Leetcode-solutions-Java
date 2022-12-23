public class No289_GameOfLife {
    public static void main(String[] args) {
        int[][] arr=ne int[10][20];
        arr[0][0]=0;
        arr[0][1]=1;
        arr[0][2]=0;
        arr[1][0]=0;
        arr[1][1]=0;
        arr[1][2]=1;
        arr[2][0]=1;
        arr[2][1]=1;
        arr[2][2]=1;
        arr[3][0]=0;
        arr[3][1]=0;
        arr[3][2]=0;
        gameOfLife(arr);

    }
    static void gameOfLife(int[][] board) {
        int n = board.length;
        if (n == 0) {
            return;
        }
        int m = board[0].length;

        int[] drow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dcol = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int cnt = 0;
                for (int k = 0; k < 8; k++) {
                    int row = i + drow[k];
                    int col = j + dcol[k];
                    if (row >= 0 && row < n && col >= 0 && col < m
                            && (board[row][col] == 1 || board[row][col] == 2)) {
                        cnt++;
                    }
                }

                if (board[i][j] == 0 && cnt == 3) {
                    board[i][j] = 3;
                } else  if (board[i][j] == 1 && (cnt < 2 || cnt > 3)) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                board[i][j] %= 2;
            }
        }
    }
}
