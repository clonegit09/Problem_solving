public class rotate {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = mat.length;
        
        for (int i=n-1;i>=0;i--) {
            for (int j=n-1;j>=0;j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
