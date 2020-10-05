package B3_Mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class chuyen_doi_nhiet_do {



    public  static double celciusToFahrenheit(double celsius) {
        double fahrenheit = (9*celsius/5) + 32;
        return fahrenheit;
    }

    public  static double fahrenheitToCelcius(double fahrenheit) {
        double celsius = (5*(fahrenheit - 32))/9;
        return celsius;
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in) ;
        double fahrenheit;
        double celsius;
        int choice;


        do {
            System.out.println(" MENU: ");
            System.out.println(" 1. Fahrenheit to Celsius ");
            System.out.println(" 2. Celsius to Fahrenheil ");
            System.out.println(" 0. Exit ");
            System.out.println(" Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Enter the Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(" Fahrenheit to Celsius: " + fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println(" Enter the Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println(" Celsius to Fahrenheit : " + celciusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice !=0);
    }
}
