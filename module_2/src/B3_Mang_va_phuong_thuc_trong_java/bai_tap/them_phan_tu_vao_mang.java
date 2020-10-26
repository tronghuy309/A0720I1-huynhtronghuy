package B3_Mang_va_phuong_thuc_trong_java.bai_tap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;

        System.out.println (" Enter the size of Array ");
        int size = scanner.nextInt();

        arr = new int[size];

        for ( int i =0; i< arr.length; i++) {
            System.out.println(" Enter the value of element: " + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }

        System.out.print(" The array is: ");
        for ( int j =0; j< arr.length; j++) {
            System.out.print( arr[j] + " ");
        }

        System.out.println (" Enter number X: ");
        int numX = scanner.nextInt();

        System.out.println (" Enter index of number X: ");
        int indexX = scanner.nextInt();

        if ( indexX <= 1 || indexX >(arr.length -1)) {
            System.out.println(" Cant import the numX to " + indexX);
        } else {
            arr[indexX] = numX;
            System.out.print(" The array is: ");
            for ( int k =0; k< arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }


    }
}

