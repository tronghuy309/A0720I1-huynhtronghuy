package B1_Introduction.thuc_hanh;

import java.util.Scanner;
public class su_dung_toan_tu {
    public static void main(String[]args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("Area is: " + area);


    }
}
