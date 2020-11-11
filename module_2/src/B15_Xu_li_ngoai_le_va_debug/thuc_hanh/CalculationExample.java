package B15_Xu_li_ngoai_le_va_debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hãy Nhập x: ");
        int x = scanner.nextInt();

        System.out.println(" Hãy Nhập y: ");
        int y = scanner.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }

    private void calculate( int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x*y;
            int d = x/y;

            System.out.println(" Tổng của x + y = " + a);
            System.out.println(" Hiệu của x - y = " + b);
            System.out.println(" Tích của x*y = " + c);
            System.out.println(" Thương của x/y = " + d);
        } catch (Exception e){
            System.err.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
