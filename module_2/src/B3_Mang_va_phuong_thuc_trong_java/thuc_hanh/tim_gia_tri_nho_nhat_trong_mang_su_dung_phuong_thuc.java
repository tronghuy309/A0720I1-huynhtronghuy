package B3_Mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;



public class tim_gia_tri_nho_nhat_trong_mang_su_dung_phuong_thuc {
    public static int minValue(int[] array){
        int min = array[0];
        for ( int i = 1; i < array.length ; i++){
            if ( array[i] < min ) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for ( int j = 0; j < array.length ;  j ++) {
            System.out.printf(" array[%d] = ", j);
            array[j] = scanner.nextInt() ;
        }

        int min = minValue(array) ;
        int index = minValue(array);
        System.out.println(" Min of the array is: " + min );

    }
}

