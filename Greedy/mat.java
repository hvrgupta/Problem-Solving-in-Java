public class mat {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 3, 4, 5 } };
        int n = 2;
        int m = 3;
        for (int i = 0; i < mat.length; i++) {
            int row_max = Integer.MIN_VALUE;
            int j = 0;
            int idx = 0;
            while (j < m) {
                if (row_max < mat[i][j]) {
                    row_max = mat[i][j];
                    idx = j;
                    // System.out.println(mat[i][j]);
                }
                j++;
            }
            int col_min = Integer.MAX_VALUE;
            for (int k = 0; k < n; k++) {
                if (col_min > mat[k][idx]) {
                    col_min = mat[k][idx];
                }
            }
            if (col_min == row_max) {
                System.out.println(row_max);
            }
        }
    }
}
