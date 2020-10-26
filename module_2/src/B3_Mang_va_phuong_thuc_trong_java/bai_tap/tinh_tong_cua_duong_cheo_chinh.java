package B3_Mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class tinh_tong_cua_duong_cheo_chinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int sum = 0;

        do {
            System.out.println(" Enter the element number of the square edge:  ");
            size = scanner.nextInt();
            if( size <=0 || size >20) {
                System.out.println(" Size should not exceed 20 and >=0 ");
            }
        } while ( size<= 0 || size >20);

        int[][] matrix = new int[size][size];

        for( int i=0; i< matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j ++) {
                System.out.println("Enter the value of matrix in index : " + "[" + i + "]" + "[" + j + "]" + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }


        System.out.println(" The matrix is :");

        for( int k = 0; k<matrix.length; k++) {
            for( int l = 0; l < matrix[k].length; l++) {
                System.out.print(matrix[k][l]+ "        ");
            }
            System.out.println();
        }


        for( int m = 0;  m <(size); m++) {
            sum += matrix[m][m];
            }
        System.out.println(" The sum of the main diagonal: " + sum);
        }
    }

