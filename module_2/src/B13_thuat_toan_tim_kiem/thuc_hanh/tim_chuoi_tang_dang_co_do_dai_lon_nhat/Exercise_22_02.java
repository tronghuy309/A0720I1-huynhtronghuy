package B13_thuat_toan_tim_kiem.thuc_hanh.tim_chuoi_tang_dang_co_do_dai_lon_nhat;
import java.util.*;
public class Exercise_22_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for ( int i=0; i<string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for( int j= i+1; j<string.length();j++){
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if( list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for ( Character ch : max) {
            System.out.print(ch);
        }
    }
}


