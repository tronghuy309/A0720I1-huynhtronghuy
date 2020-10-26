package B3_Mang_va_phuong_thuc_trong_java.bai_tap;
import  java.util.Scanner;
public class dem_so_luong_sinh_vien_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        int count = 0;

        do {
            System.out.println(" Enter a number of student: ");
            size = scanner.nextInt();
            if( size <=0 || size >30) {
                System.out.println(" Size should not exceed 30 and >=0 ");
            }
        } while ( size<= 0 || size >30);

        arr = new int[size];
        System.out.println(" Enter the score of students: ");
        for ( int i =0; i < arr.length ; i++) {
            System.out.println(" Enter the score of student :" + ( i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println(" The table of score Student are:");
        for ( int j =0; j < arr.length ; j++) {
            System.out.println(arr[j] + " ");
        }

        System.out.println(" The number of student pass the exam: ");
        for ( int k =0; k < arr.length ; k++) {
            if( arr[k] >= 5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
