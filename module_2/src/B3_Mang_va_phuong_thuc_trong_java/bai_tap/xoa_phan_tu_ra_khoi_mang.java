package B3_Mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class xoa_phan_tu_ra_khoi_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        int numX;
        int index_del;
        int numChange;
        int count = 0;

        do {
            System.out.println(" Enter the size of array ");
            size = scanner.nextInt();
            if (size >20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size >20);

        arr = new int[size];
        int i = 0 ;
        while ( i < arr.length ) {
            System.out.println("Enter element " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Property list : ");
        for ( int j = 0; j<arr.length ; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println("Enter the number check: ");
        numX = scanner.nextInt();

        for ( i = 0; i < arr.length; i++) {
            if ( arr[i]==(numX)) {
                index_del = i+1;
                System.out.println(numX + " appear in arr at index " + index_del);
                System.out.println("Enter the value want to change " + numX + " at index " + index_del);
                numChange = scanner.nextInt();
                arr[index_del-1] = numChange;
                System.out.println("Property list : ");
                for ( int k = 0; k<arr.length ; k++) {
                    System.out.print(arr[k] + " ");
                }
                count ++;
                break;
            }
        }
        if ( count == 0 ) {
            System.out.println( numX + " don't appear in arr ");
        }

    }
}
