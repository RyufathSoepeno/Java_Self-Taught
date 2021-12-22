import java.util.Arrays;

public class Java_Five_Multi_Dimensional_Arrays {
    public static void main(String[] args){
        int[][] num = new int [2] [2];
        // int[row] [column]
        num[0][0] = 1;
        num[1][1] = 1;
        System.out.println(Arrays.deepToString(num));

        // Rows are written in one line

        int[][][] hi = new int[2][3][5];
        hi [0][0][2] = 3;
        hi [0][1][1] = 6;
        hi [1][2][4] = 9;
        System.out.println(Arrays.deepToString(hi));

        int [] [] x = { {2, 3}, {4, 1}};
        System.out.println(x[0][1]);
        System.out.println(Arrays.deepToString(x));

        int [][] y = {{1, 2, 3, 4}, {2, 6, 8, 4}, {1, 1, 4, 3}};
        System.out.println(y[2][1]);
        System.out.println(Arrays.deepToString(y));

    }
}