package B15_Xu_li_ngoai_le_va_debug.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver: ");
        System.out.println("Given a euation as 'a * + b = 0', please enter constants: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println(" a: ");
        double a = scanner.nextDouble();

        System.out.println(" b: ");
        double b = scanner.nextDouble();

        if( a !=0) {
            double solution = -b/a;
            System.out.println("The solution is: %f! "+ solution);
        } else {
            if( b == 0) {
                System.out.println(" The spolution is add x! ");
            } else {
                System.out.println("No solution! ");
            }
        }

    }
}
