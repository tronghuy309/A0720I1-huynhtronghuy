package B3_Mang_va_phuong_thuc_trong_java.bai_tap;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class dem_so_lan_xuat_hien_trong_chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        String syb;
        int count = 0;

        System.out.println(" Enter the String: ");
        str = scanner.nextLine();
        char[] ch = str.toCharArray();
        for( int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        System.out.println(" Enter the symbol: ");
        syb = scanner.nextLine();



        for (int j = 0; j < ch.length ; j++) {
            String temp = Character.toString(ch[j]);
            if( temp.equals(syb) ) {
                count++;
            }
        }
        System.out.println(count);

    }
}
