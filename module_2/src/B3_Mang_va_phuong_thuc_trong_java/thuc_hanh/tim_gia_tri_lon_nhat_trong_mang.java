package B3_Mang_va_phuong_thuc_trong_java.thuc_hanh;
import  java.util.Scanner;

public class tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println(" Enter a size");
            size = scanner.nextInt();
            if( size >20) {
                System.out.println(" Size should not exceed 20");
            }
        } while ( size >20);

        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.println("Enter element " + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println(" Property list :");
        for ( int j = 0 ; j < array.length ; j++) {
            System.out.println(array[j] + " ");
        }

        // duyet cac phan tu de tim gia tri lon nhat

        int max =array[0];
        int index = 1;
        for ( int j = 0 ; j < array.length ; j++) {
            if ( array[j] > max ) {
                max = array[j] ;
                index = j + 1;
            }
        }
        System.out.println(" The largest property value in the list is:" + max + " at the positon " + index );
    }
}
