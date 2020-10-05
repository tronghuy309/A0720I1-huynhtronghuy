package B3_Mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a nam's student: ");
        String input_name = scanner.nextLine();

        boolean isExit = false;
        for ( int i = 0; i < students.length ; i++) {
            if (students[i].equals(input_name)) {
                System.out.println(" Position of the students in the list " + input_name + " is " + (i +1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println(" Not found "+ input_name+ " in the list ");
        }
    }
}
