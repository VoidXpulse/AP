public class pascalTriangle {
    public static void main(String[] args) {
        int n = 2;
        int[] triangle = pascalCalc(n);

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle[i]);
        }

    }
    public static int[] pascalCalc(int n) {
        int[][] pascal = new int[n][n];

        pascal[0][0] = 1;

        if(n > 1) {
            pascal[0][1] = 0;
            for (int i = 1; i < n; i++) {

                for (int j = 1; j < n; j++) {
                    pascal[i][j] = pascal[i- 1][j - 1] + pascal[i - 1][j];
                }
                pascal[i][0] = 1;
                pascal[i][i] = 1;
            }
        }

        return pascal[n - 1];
    }
}
