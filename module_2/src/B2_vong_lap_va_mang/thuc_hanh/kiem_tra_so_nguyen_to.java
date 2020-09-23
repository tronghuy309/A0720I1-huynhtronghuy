package B2_vong_lap_va_mang.thuc_hanh;
import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        int num;
        Scanner enternum = new Scanner(System.in);
        System.out.println(" Enter check number");
        num = enternum.nextInt();

        if ( num < 2 ) {
            System.out.println( num+" is not a Prime number");
        } else {
            int i = 2;
            boolean check = true ;
            while ( i <= Math.sqrt(num)) {
                if ( num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

            if (check) {
                System.out.println(num + " is a Prime number");
            } else {
                System.out.println(num + " is a NOT Prime number");
            }
        }
    }
}
