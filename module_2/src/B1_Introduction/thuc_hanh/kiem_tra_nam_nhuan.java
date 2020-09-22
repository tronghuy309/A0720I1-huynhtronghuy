package B1_Introduction.thuc_hanh;
import java.util.Scanner;
public class kiem_tra_nam_nhuan {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in) ;
        int year;

        System.out.println("Enter Check Year: ");
        year = scanner.nextInt();

        if ( year % 4 == 0) {
            if ( year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }

        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
