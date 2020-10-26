package B3_Mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;
public class tinh_tong_cac_so_o_mot_cot_xac_dinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        int sum = 0;
        int colsum;

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


        System.out.println("Enter the index of collum want to sum: ");
        colsum = scanner.nextInt();

        if ( colsum > matrix[0].length-1) {
            System.out.println(" Can't sum this collum");
        } else {
            for( int m = 0; m <matrix.length; m++) {
                sum += matrix[m][colsum];
            }
            System.out.println("Sum the collum is: " + sum);
        }
    }
}
