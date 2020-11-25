package FuramaResort.Commons;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    public static final String SERVICE_CODE_REGEX ="SV(VL|HO|RO)-[\\d]{4}";
    public static final String SERVICE_NAME_REGEX = "[A-Z][a-z]*";
    public static Pattern pattern;
    public static Matcher matcher;

    public static boolean isValidService(String str,String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);

        boolean flag = matcher.matches();
        if( !flag) {
            System.out.println("Input not matching " + regex);
        }

        return flag;
    }

    public static boolean isMoreThan(double number, double destNumber, double endNUmber) {
        boolean flag = number > destNumber &&  number< endNUmber;
        if(!flag) {
            System.out.println(" Input is not in( " + destNumber + "," + endNUmber + ")");
        }
        return  flag;
    }

    public static boolean isMoreThan(double number, double destNumber) {
        boolean flag = number > destNumber;
        if(!flag) {
            System.out.println(" Input is not more than( " + destNumber + ")");
        }
        return  flag;
    }

    public static boolean isValidExtraServiceName( String extraServiceName) {
        String[] list = {"massage", "karaoke", "food", "drink", "car"};
        boolean flag = Arrays.asList(list).contains(extraServiceName);

        if(!flag) {
            System.out.println("Extra service name is not in list service : massage\", \"karaoke\", \"food\", \"drink\", \"car");
        }

        return flag;
    }
}
