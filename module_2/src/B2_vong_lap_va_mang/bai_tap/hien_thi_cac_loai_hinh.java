package B2_vong_lap_va_mang.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[]args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while (choice != 0 ) {
            System.out.println("Menu");
            System.out.println("1.Print the retangle ");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            int len;
            int wid;
            int edge;
            int choiceEdge;
            int hypo;

            switch (choice) {
                case 1:

                    System.out.println(" Enter the length of retangle: ");
                    len = scanner.nextInt();
                    System.out.println(" Enter the width of retangle: ");
                    wid = scanner.nextInt();

                    for ( int i = 1 ; i <= wid ; i ++) {
                        for ( int j =1 ; j <= len ;  j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }

                    break;
                case 2:

                    System.out.println(" Enter the edge length of square triangle: ");
                    edge = scanner.nextInt();

                    System.out.println("1.Print the top-left square triangle ");
                    System.out.println("2.Print the top-right square triangle");
                    System.out.println("3.Print the botton-left square triangle");
                    System.out.println("4.Print the botton-right square triangle");
                    System.out.println("Enter your choice:");
                    choiceEdge = scanner.nextInt();

                    switch (choiceEdge) {
                        case 1:
                            for ( int i = edge ; i >= 1 ; i --) {
                                for ( int j =1 ; j <= i ;  j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for ( int i = 1 ; i <= edge ; i ++) {
                                for ( int j = 1 ; j <= i ;  j++) {
                                    System.out.print("   ");
                                }
                                for( int k = 1; k <= edge + 1-i; k++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for ( int i = 1 ; i <= edge ; i ++) {
                                for ( int j =1 ; j <= i ;  j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 4:
                            for ( int i = 1 ; i <= edge ; i ++) {
                                for ( int j = 1 ; j <= edge - i ;  j++) {
                                    System.out.print("   ");
                                }
                                for( int k = 1; k <=i; k++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        default:
                            System.out.println(" Please reenter the choice!!! ");
                    }
                    break;
                case 3:
                    System.out.println(" Enter the hypotenuse length of isosceles triangle ( please enter length >=3 and odd) : ");
                    hypo = scanner.nextInt();
                    if ( hypo % 2 ==0 || hypo < 3) {
                        System.out.println("  please enter length >=3 and odd  ");
                    } else {
                        for ( int i=1; i<= (hypo+1)/2; i++) {
                            for ( int j = (hypo+1)/2 -i; j >= 1; j--) {
                                System.out.print("   ");
                        }
                            for ( int k = 1; k <= 1+ (i-1)*2 ; k++) {
                                System.out.print(" * ");
                            }
                            System.out.println(" ");
                        }
                    }


                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" Please reenter the choice!!! ");
            }
        }


    }
}
