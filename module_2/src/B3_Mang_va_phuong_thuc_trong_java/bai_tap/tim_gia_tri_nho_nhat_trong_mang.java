package B3_Mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class tim_gia_tri_nho_nhat_trong_mang {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size;
        int[] arr;
        int min;
        int temp;

        do {
            System.out.println("Enter the size of the Array ");
            size = scanner.nextInt();
            if( size<=0 || size>=20) {
                System.out.println(" Size should not exceed 20 and < 0");
            }
        } while (size>20 || size <=0);

        arr = new int[size];
        for ( int i = 0; i<arr.length; i++) {
            System.out.println(" Enter the value of element " + ( i +1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(" ");

        System.out.println(" The value of Array is: ");
        for ( int j= 0; j<arr.length; j++) {
            System.out.print(arr[j]+ " ");
        }

        min = arr[0];

        for ( int k = 0; k<arr.length; k++) {
            if ( arr[k] <= min) {
                min = arr[k];
            }
        }
        System.out.println(" The minimum of array is :"+ min);
    }
}
