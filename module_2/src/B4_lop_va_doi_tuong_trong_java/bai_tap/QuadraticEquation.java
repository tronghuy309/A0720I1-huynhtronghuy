package B4_lop_va_doi_tuong_trong_java.bai_tap;
import java.util.Scanner;
public class QuadraticEquation {
    double a, b, c ;
    public QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return this.a; }
    public double getB() { return this.b; }
    public double getC() { return this.c; }

    public double getDiscriminant() {
        double delta;
        return delta = this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1() {
        double root_1;
        return root_1 = (-this.b + Math.pow(getDiscriminant(),0.5))/(2*this.a);
    }

    public double getRoot2() {
        double root_2;
        return root_2 = (-this.b - Math.pow(getDiscriminant(),0.5))/(2*this.a);
    }





    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a , b, c);
        if ( quadraticEquation.getDiscriminant() > 0) {
            System.out.println(" the equation have two roots: "+ quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
        else if ( quadraticEquation.getDiscriminant() == 0) {
            System.out.println(" the equation have one root: "+ quadraticEquation.getRoot1() );
        } else {
            System.out.println(" the equation have no real root ");
        }



    }
}
