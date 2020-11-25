package Exeption.ServiceExeption;

public class ServiceValidate {
    private static String regex = "";

    //ValiDate Villa ID
    public static boolean checkIDVilla(String str) {
        regex = "^SVVL-[\\d]{4}$";
        return str.matches(regex);
    }

    //ValiDate House ID
    public static boolean checkIDHouse(String str) {
        regex = "^HOVL-[\\d]{4}$";
        return str.matches(regex);
    }

    //ValiDate Room ID
    public static boolean checkIDRoom(String str) {
        regex = "^ROVL-[\\d]{4}$";
        return str.matches(regex);
    }

    //ValiDate Name of Service ( UPPERCASE THE FIRST CHARACTER )
    public static boolean checkNameOfService(String str) {
        regex = "^[A-Z][a-z]{0,}([\\\\s][A-Z][a-z]{0,})*$";
        return str.matches(regex);
    }

    //Check max of People ( 0 < people < 20 )
    public static boolean checkMaxOfPeople(int people) {
        int countPeople;
        try {
            countPeople = people;
            return countPeople > 0 && countPeople < 20;
        } catch (Exception e) {
            return false;
        }
    }

    //Area Used + Pool Area
    public static boolean checkPoolArea(String str) {
        regex = "^[0-9].[0-9]{1,}$";
        return str.matches(regex);
    }

    //Date of Birth
    public static boolean checkDob(String str) {
        regex = "\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{2}|\\d{4})\\b";
        return str.matches(regex);
    }

    //Check Convenient
    public static boolean checkConvenient(String str){
        regex = "(massage)|(karaoke)|(food)|(drink)|(car)";
        return str.matches(regex);
    }
}
