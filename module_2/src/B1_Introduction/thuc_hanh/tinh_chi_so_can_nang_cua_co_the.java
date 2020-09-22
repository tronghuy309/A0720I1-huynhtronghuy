package B1_Introduction.thuc_hanh;

import java.util.Scanner;

public class tinh_chi_so_can_nang_cua_co_the {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        double weight,height,bmi;


        System.out.println(" Enter Weight : ");
        weight = scanner.nextDouble();

        System.out.println(" Enter Height: ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2) ;
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if ( bmi < 18.5 ) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if ( bmi < 25 ) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if ( bmi < 30 ) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }


    }
}
