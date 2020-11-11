package B15_Xu_li_ngoai_le_va_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println(" Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        int[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();

        try {
            System.out.println("Giá trị của phần tử có chỉ số  "+ x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(" Chỉ số vượt quá giới hạn của mảng ");
        }
    }
}
