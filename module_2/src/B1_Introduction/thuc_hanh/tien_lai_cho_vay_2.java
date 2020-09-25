package B1_Introduction.thuc_hanh;
import java.util.Scanner;

public class tien_lai_cho_vay_2 {
    public static void main(String[]args) {
        double loanPer;
        int month;
        double money;
        double profit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the money:  ");
        money = scanner.nextDouble();

        System.out.println("Enter months:  ");
        month = scanner.nextInt();

        System.out.println("Enter loan percentage/year:  ");
        loanPer = scanner.nextDouble();

        profit = money*(loanPer/100)*month/12 ;
        System.out.println(" The profit is: " + profit + ". With "+ month + " month " + "and " + loanPer + " Loan percentage");
    }
}
