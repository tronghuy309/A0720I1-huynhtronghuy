package B1_Introduction.bai_tap;

import java.util.Scanner;
public class ung_dung_doc_so_thanh_chu {
    public static void main(String[]args) {
        String result = null;
        int num ;
        int surplus ;
        int dozens ;
        int hundreds ;


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        num = scanner.nextInt();


        if ( num <=10 ) {
            switch (num) {
                case 0 :
                    result =" zero ";
                    break;
                case 1 :
                    result = " one ";
                    break;
                case 2 :
                    result = " two ";
                    break;
                case 3 :
                    result = " three ";
                    break;
                case 4 :
                    result = " four ";
                    break;
                case 5 :
                    result = " five ";
                    break;
                case 6 :
                    result = " six ";
                    break;
                case 7 :
                    result = " seven ";
                    break;
                case 8 :
                    result = " eight ";
                    break;
                case 9 :
                    result = " nine ";
                    break;
                case 10 :
                    result = " ten ";
                    break;
                default:
                    result = " Please enter the number >=0 ";
            }
            System.out.println(" Result  : " + result);
        } else if ( num <= 20) {
            surplus = num % 10;
            switch (surplus) {
                case 0 :
                    result =" twenty ";
                    break;
                case 1 :
                    result = " eleven ";
                    break;
                case 2 :
                    result = " twelve ";
                    break;
                case 3 :
                    result = " thirteen ";
                    break;
                case 4 :
                    result = " fourteen ";
                    break;
                case 5 :
                    result = " fifteen ";
                    break;
                case 6 :
                    result = " sixteen ";
                    break;
                case 7 :
                    result = " seventeen ";
                    break;
                case 8 :
                    result = " eighteen ";
                    break;
                case 9 :
                    result = " nineteen ";
                    break;
        }
            System.out.println(" read the number : " + result);
    } else if ( num <=99) {
            dozens = ( num - num%10)/10 ;
            switch (dozens) {
                case 2:
                    result = " twenty ";
                    break;
                case 3:
                    result = " thirty ";
                    break;
                case 4:
                    result = " fourty ";
                    break;
                case 5:
                    result = " fifty ";
                    break;
                case 6:
                    result = " sixty ";
                    break;
                case 7:
                    result = " seventy ";
                    break;
                case 8:
                    result = " eighty ";
                    break;
                case 9:
                    result = " ninety ";
                    break;

            }

            surplus = num%10;
            switch (surplus) {
                case 0 :
                    result +="";
                    break;
                case 1 :
                    result += "one ";
                    break;
                case 2 :
                    result += "two ";
                    break;
                case 3 :
                    result += "three ";
                    break;
                case 4 :
                    result += "four ";
                    break;
                case 5 :
                    result += "five ";
                    break;
                case 6 :
                    result += "six ";
                    break;
                case 7 :
                    result += "seven ";
                    break;
                case 8 :
                    result += "eight ";
                    break;
                case 9 :
                    result += "nine ";
                    break;
            }

            System.out.println(" read the number : " + result);
        } else if( num <= 999 ) {
            hundreds = (num - num%100)/100;
            dozens = ( num%100 - num%10)/10 ;
            surplus = num%10;

            switch (hundreds) {
                case 1:
                    result = " one hundred and ";
                    break;
                case 2:
                    result = " two hundreds and ";
                    break;
                case 3:
                    result = " three hundreds and ";
                    break;
                case 4:
                    result = " four hundreds and ";
                    break;
                case 5:
                    result = " five hundreds and ";
                    break;
                case 6:
                    result = " six hundreds and ";
                    break;
                case 7:
                    result = " seven hundreds and ";
                    break;
                case 8:
                    result = " eight hundreds and ";
                    break;
                case 9:
                    result = " nine hundreds and ";
                    break;

            }
            switch (dozens) {
                case 2:
                    result += "twenty ";
                    break;
                case 3:
                    result += "thirty ";
                    break;
                case 4:
                    result += "fourty ";
                    break;
                case 5:
                    result += "fifty ";
                    break;
                case 6:
                    result += "sixty ";
                    break;
                case 7:
                    result += "seventy ";
                    break;
                case 8:
                    result += "eighty ";
                    break;
                case 9:
                    result += "ninety ";
                    break;

            }

            switch (surplus) {
                case 0 :
                    result +="";
                    break;
                case 1 :
                    result += "one ";
                    break;
                case 2 :
                    result += "two ";
                    break;
                case 3 :
                    result += "three ";
                    break;
                case 4 :
                    result += "four ";
                    break;
                case 5 :
                    result += "five ";
                    break;
                case 6 :
                    result += "six ";
                    break;
                case 7 :
                    result += "seven ";
                    break;
                case 8 :
                    result += "eight ";
                    break;
                case 9 :
                    result += "nine ";
                    break;
            }

            System.out.println(" read the number : " + result);
        } else {
            System.out.println(" only number <1000 and >=0. Please reenter the number.");
        }

        }
}
