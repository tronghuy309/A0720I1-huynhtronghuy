package B3_Mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class tim_phan_tu_lon_nhat_trong_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        int max;

        System.out.println(" Enter the row of Array: ");
        row = scanner.nextInt();


        System.out.println(" Enter the collum of Array: ");
        col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        for( int i=0; i< matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j ++) {
                System.out.println("Enter the value of matrix in index : " + "[" + i + "]" + "[" + j + "]" + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }


        System.out.println(" The matrix is :");

        for( int k = 0; k<matrix.length; k++) {
            for( int l = 0; l < matrix[k].length; l++) {
                System.out.print(matrix[k][l]+ " ");
            }
            System.out.println();
        }

        max = matrix[0][0];
        for( int m = 0; m < matrix.length; m++) {
            for( int n = 0; n < matrix[m].length; n++) {
                if ( matrix[m][n] >= max ) {
                    max = matrix[m][n];
                }
            }
        }
        System.out.println(" The maximum of matrix is "+ max );

    }
}
