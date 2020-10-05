package B3_Mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class dao_nguoc_cac_phan_tu_trong_mang {
    public  static void  main(String[]args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // khai bao so luong cua mang
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size >20) ;


        // nhap gia tri cac phan tu cho mang
        array = new int[size];
        int  i = 0;
        while (i <array.length) {
            System.out.print("Enter element " + (i+1)+ " :");
            array[i] = scanner.nextInt();
            i++;
        }


        // in ra mang da nhap
        System.out.println("Element in array: ");
        for ( int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }


        // dao nguoc thu tu cac phan tu trong mang
        for ( int j = 0 ; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size-j-1] ;
            array[size-1-j] = temp ;
        }
        System.out.println(" ");

        // in ra mang sau khi da dao nguoc vi tri
        System.out.println("Reverse array: " );
        for ( int j = 0 ; j < array.length ; j++) {
            System.out.print(array[j] + " ") ;
        }
    }
}
