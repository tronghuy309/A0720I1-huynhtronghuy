package B1_Introduction.thuc_hanh;

import java.util.Scanner;
public class uoc_so_chung_2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" Enter number a: ");
        int a = sc.nextInt();
        System.out.println(" Enter number b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if ( a == 0 || b == 0) {
            System.out.println(" No greatest common factor ");
        }
        while ( a != b ) {
            if ( a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            System.out.println(" Greatest common factor " + a);
        }

    }
}
