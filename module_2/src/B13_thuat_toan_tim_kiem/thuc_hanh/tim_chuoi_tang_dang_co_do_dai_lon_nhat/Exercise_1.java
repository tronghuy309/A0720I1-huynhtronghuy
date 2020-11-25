package B13_thuat_toan_tim_kiem.thuc_hanh.tim_chuoi_tang_dang_co_do_dai_lon_nhat;

import java.util.*;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the string : ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for ( int i = 0; i < string.length(); i++ ){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
                if(string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }

        }
        for (Character  ah: max) {
            System.out.print(ah);
        }
    }
}
