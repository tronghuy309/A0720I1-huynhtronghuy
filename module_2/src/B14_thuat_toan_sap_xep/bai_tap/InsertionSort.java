package B14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int valueToInsert;
        int holePositon;
        for (int i = 1; i < arr.length ; i++) {
            valueToInsert = arr[i];
            holePositon = i;
            while ( holePositon >0 && arr[holePositon -1]>valueToInsert) {
                arr[holePositon] = arr[holePositon-1];
                holePositon--;
                System.out.println(" Di chuyen phan tu: " + arr[holePositon]);
            }

            if(holePositon != i) {
                System.out.println(" Chen phan tu: " + valueToInsert + " , tai vi tri: " + holePositon);
                arr[holePositon] = valueToInsert;
            }
            System.out.println(" Vong lap thu " + i);
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println(" Enter " + arr.length + " values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Your input list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("\n Begin sort prcessing.....");
        insertionSort(arr) ;
    }

    public void insertionSort1(int[] list) {
    }
}
