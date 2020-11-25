package Exeption.UserExeption;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidate {
    private static String regex ="";

    //regex Mail
    public static boolean regexMail(String str){
        regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return str.matches(regex);
    }

    public static boolean genderCheck(String str){
        regex = "(male)|(female)|(unknow)|(Male)|(Female)|(Unknow)";
        return str.matches(regex);
    }

    public static boolean idCardCheck(String str){
        regex = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$";
        return str.matches(regex);
    }

    //Date of Birth
    public static boolean checkDobCustomer(String str) {
        boolean check;
        LocalDate birthday;
        regex = "\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{2}|\\d{4})\\b";
        check = str.matches(regex);
        if (check){
            String [] dateString = str.split("/");
            int date =Integer.parseInt(dateString[0]);
            int month =Integer.parseInt(dateString[1]);
            int year =Integer.parseInt(dateString[2]);
            try{
                birthday = LocalDate.of(year,month,date);
            } catch (Exception e){
                return false;
            }

            LocalDate today = LocalDate.now();
            if(Period.between(birthday,today).getYears() < 18){
                return false;
            }
            if(year < 1900){
               return false;
            }
        }
        return check;
    }
}
