package utils;

public class Matrix {

    public static void printMatrix(boolean[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            if(row == 0){
                System.out.printf("%4d", 0);
                for(int i = 0; i < matrix.length; i++){
                    System.out.printf("%4d", i);
                }
                System.out.printf("\n");
            }

            for (int col = 0; col < matrix[row].length; col++) {
                if(col == 0) System.out.printf("%4d", row);
                System.out.printf("%4d", matrix[row][col] ? 1 : 0);
            }
            System.out.println();
        }
    }

}
