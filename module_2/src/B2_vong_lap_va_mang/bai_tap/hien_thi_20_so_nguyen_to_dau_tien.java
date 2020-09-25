package B2_vong_lap_va_mang.bai_tap;
import java.util.Scanner;
public class hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[]args) {
        int num;
        int count = 0;
        int i;
        int j;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number whose primes are smaller: ");
        num = scanner.nextInt();
        for ( i =2; i <= Math.pow(2,45);i++) {
            j =2;
            boolean check = true;
            while ( j <= Math.sqrt( i)) {
                if ( i % j ==0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                if ( i > num ) {
                    break;
                }
                System.out.print( i + " " );

            }
        }
    }
}
