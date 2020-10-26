package B3_Mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA;
        int sizeB;
        int sizeC;
        int[] arrA;
        int[] arrB;
        int[] arrC;


        // tao ra dieu kien cua mang khong duoc lon hon 20 va nho hon ).
        // Neu ko thoa dieu kien thi se bat nhap lai lien tuc.

        //khai bao chuoi A:

        do {
            System.out.println(" Enter a size array A");
            sizeA = scanner.nextInt();
            if( sizeA <= 0 || sizeA >20) {
                System.out.println(" Size should not exceed 20 and < 0: ");
            }
        } while ( sizeA >20);

        arrA = new int[sizeA];
        for ( int i = 0 ; i<arrA.length; i++) {
            System.out.println("Enter the value of element: "+ (i+1) + " : ");
            arrA[i] = scanner.nextInt();
        }
        System.out.println(" The Array A is: ");
        for ( int j = 0; j<arrA.length; j++) {
            System.out.print(arrA[j] + " ");
        }

        // khai bao chuoi B:
        System.out.println(" ");
        do {
            System.out.println(" Enter a size array B");
            sizeB = scanner.nextInt();
            if( sizeB <= 0 || sizeB >20) {
                System.out.println(" Size should not exceed 20 and <0 :");
            }
        } while ( sizeB >20);

        arrB = new int[sizeB];
        for ( int k = 0 ; k<arrB.length; k++) {
            System.out.println("Enter the value of element: "+ (k+1) + " : ");
            arrB[k] = scanner.nextInt();
        }
        System.out.println(" The Array B is: ");
        for ( int l = 0; l<arrB.length; l++) {
            System.out.print(arrB[l]+ " ");
        }

        // tao chuoi C co size la size va gia tri la tong cua 2 chuoi A,B

        sizeC = sizeA + sizeB;
        arrC = new int[sizeC];
        for ( int m = 0; m < arrA.length; m++) {
            arrC[m]=arrA[m];
        }

        for ( int n= 0; n < arrB.length; n++) {
            arrC[sizeA+n]=arrB[n];
        }
        System.out.println(" ");
        System.out.println(" The Array C total Array A and Array B: ");
        for ( int p = 0; p < sizeC; p++) {
            System.out.print(arrC[p] + " ");
        }





    }
}
