package B1_Introduction.thuc_hanh;

import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[]args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a euation as a x b = 0, please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        if ( a!=0) {
            double answer = (c -b)/a;
            System.out.println("Equation pass with x= " + answer);
        } else {
            if ( b==0) {
                System.out.println("The solution is all x!");
            } else  {
                System.out.println("No solution");
            }
        }

    }
}
