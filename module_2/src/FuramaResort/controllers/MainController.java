package FuramaResort.controllers;

import B17_IO_TextFile.thuc_hanh.FileUtil;
import FuramaResort.Commons.FileUtils;
import FuramaResort.Commons.StringUtils;
import FuramaResort.Commons.Validators;
import FuramaResort.models.*;

import java.util.*;

public class MainController {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit;
    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static String CUSTOMER = "customer";
    private static boolean isBackToMenu;

    public static void main(String[] args) {
        MainController.displayMainMenu();
    }


    public static void displayMainMenu() {
        int choose = 0;
        do {    // tao hien thi menu het. roi bat nhap so chooose. sau do neu nhap dung theo so thi ta cho vao vong lap vo han tiep
        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        // mở dấu ngoặc kép và cóp vào thôi


        System.out.println("Please choose (1-6): ");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer(CUSTOMER);
                break;
            case 4:
                showInformationOfCustomer(CUSTOMER);
                break;
            case 5:
                addNewBooking();
                break;
            case 6:
                showInformationOfEmployee();
                break;
            case 7:
                isExit = true;
                break; // break nay chi thoat ra khoi vong lap switch
        }
        if(isExit) {
            break;  // break nay dung de thoat ra khoi vong do while. tuc la thoat khoi chuong trinh.
        }
    } while (choose >= 1 && choose <=7);  // while nay kiem soat viec nhap dung hay ko thoi.
    }


    private static void addNewServices() {

        int choose = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");

            System.out.println("Please choose service to add:");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    addNewService(VILLA);
                    isBackToMenu = false;
                    break;
                case 2:
                    addNewService(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    addNewService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    isBackToMenu = true;
                    break;
                case 5:
                    isExit = true;
                    break;
            }

            if(isBackToMenu || isExit ){
                return;
            }
        } while (choose>=1 && choose<=5);
    }

    private static void addNewService(String fileName) {

        scanner.nextLine();

        String id = null;
        do {
            System.out.println("Please input service id: ");
             id = scanner.nextLine();
        }while (!Validators.isValidService(id, Validators.SERVICE_CODE_REGEX));


        String serviceName = null;
        do {
            System.out.println("Please input service name: ");
            serviceName = scanner.nextLine();
        } while (!Validators.isValidService(serviceName,Validators.SERVICE_NAME_REGEX));

        Double areaUse = 0.0;
        do{
            System.out.println("Please input area use: ");
            areaUse = scanner.nextDouble();
        } while (!Validators.isMoreThan(areaUse,30));


        double rentCost = 0.0;
        do {
            System.out.println("Please input rent cost: ");
            rentCost = scanner.nextDouble();
        } while (!Validators.isMoreThan(rentCost,0));

        Integer numberOfPeople = 0;
        do {
            System.out.println("Please input number of people: ");
            numberOfPeople = scanner.nextInt();
        } while (!Validators.isMoreThan(numberOfPeople,0, 20));

        scanner.nextLine();

        String typeRent=null;
        do {
            System.out.println("Please input type rent :  ");
            typeRent = scanner.nextLine();
        } while (!Validators.isValidService(typeRent,Validators.SERVICE_NAME_REGEX));

        FileUtils.setFullPathFile(fileName);
        if (fileName.equals(VILLA)){

            String standardRoom = null;
            do {
                System.out.println("Please input standard Room :  ");
                standardRoom = scanner.nextLine();
            } while (!Validators.isValidService(standardRoom,Validators.SERVICE_NAME_REGEX));


            System.out.println("Please input other description :  ");
            String otherDescription = scanner.nextLine();


            Double areaPool=0.0;
            do{
                System.out.println("Please input area pool :  ");
                areaPool = scanner.nextDouble();
            }while (!Validators.isMoreThan(areaPool,30));

            Integer numberOfFloors = 0;
            do{
                System.out.println("Please input number of floors :  ");
                numberOfFloors = scanner.nextInt();
            } while (!Validators.isMoreThan(numberOfFloors,0));
            FileUtils.writeFile(new String[] {id,serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople),typeRent,
                    standardRoom,otherDescription, String.valueOf(areaPool), String.valueOf(numberOfFloors)});
        } else if (fileName.equals(HOUSE)) {
            System.out.println("Please input standard Room :  ");
            String standardRoom = scanner.nextLine();

            System.out.println("Please input other description :  ");
            String otherDescription = scanner.nextLine();


            Integer numberOfFloors = 0;
            do{
            System.out.println("Please input number of floors :  ");
            numberOfFloors = scanner.nextInt();
            } while (!Validators.isMoreThan(numberOfFloors,0));

            FileUtils.writeFile(new String[] {id,serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople),typeRent,
                    standardRoom,otherDescription, String.valueOf(numberOfFloors)});

        } else if ((fileName.equals(ROOM))){

            String extraServiceName=null;
            do {
                System.out.println(" Please input extra service name: ");
                extraServiceName = scanner.nextLine();
            } while (!Validators.isValidExtraServiceName(extraServiceName));

            System.out.println("Please input unit: ");
            String unit = scanner.nextLine();

            System.out.println("Please input money: ");
            double money = scanner.nextDouble();

            FileUtils.writeFile(new String[] {id,serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople),typeRent,
                    extraServiceName,unit, String.valueOf(money)});
        }
    }




    private static void showServices() {
        int choose = 0;
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");

            System.out.println("Please choose service to add:");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    showAllService(VILLA);
                    isBackToMenu = false;
                    break;
                case 2:
                    showAllService(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    showAllService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    showAllServiceNotDup(VILLA);
                    isBackToMenu = true;

                    break;
                case 5:
                    showAllServiceNotDup(HOUSE);
                    isBackToMenu = true;
                    break;
                case 6:
                    showAllServiceNotDup(ROOM);
                    isBackToMenu = true;
                    break;
                case 7:
                    isBackToMenu = true;
                    break;
                case 8:
                    isExit = true;
                    break;
            }

            if(isBackToMenu || isExit ){
                return;
            }
        } while (choose>=1 && choose<=8);
    }

    public static List<Services> readAllServices(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesService = FileUtils.readFile();
        List<Services> listOfServices = new ArrayList<>();
        String[] propertiesElement = null;

        Services services = null;

        ExtraService extraService = null;
        for(String properties : propertiesService) {
            propertiesElement = properties.split((StringUtils.COMMA));
            if(fileName.equals(VILLA)) {
                services = new Villa();

                ((Villa) services).setStandardRoom(propertiesElement[6]);
                ((Villa) services).setOtherDescription(propertiesElement[7]);
                ((Villa) services).setAreaPool(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setNumberOfFloors(Integer.parseInt(propertiesElement[9]));
            } else if(fileName.equals(HOUSE)) {
                services = new House();

                ((House) services).setStandardRoom(propertiesElement[6]);
                ((House) services).setOtherDescription(propertiesElement[7]);
                ((House) services).setNumberOfFloors(Integer.parseInt(propertiesElement[8]));
            } else if(fileName.equals(ROOM)) {
                extraService = new ExtraService(propertiesElement[6],propertiesElement[7],Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room) services).setExtraService(extraService);
            }


            services.setId(propertiesElement[0]);
            services.setServiceName(propertiesElement[1]);
            services.setAreaUse(Double.parseDouble(propertiesElement[2]));
            services.setRentCost(Double.parseDouble(propertiesElement[3]));
            services.setNumberOfPeoples(Integer.parseInt(propertiesElement[4]));
            services.setTypeRent(propertiesElement[5]);

            listOfServices.add(services);
        }
        return listOfServices;
    }


    private static void showAllService(String fileName) {

        System.out.println("-----------------------");
        System.out.println("List services: ");
        for( Services services : readAllServices(fileName)) {
            services.showInfor();
        }
    }


    private static void showAllServiceNotDup(String fileName) {
        Set<String> setOfServices = new TreeSet<>();
        System.out.println("-----------------------");
        System.out.println("List services not duplicate name : ");
        for( Services services : readAllServices(fileName)) {
            setOfServices.add(services.getServiceName());
        }

        for(String name: setOfServices){
            System.out.println(name);
        }

    }


    private static void addNewCustomer(String fileName) {

        scanner.nextLine();

        System.out.println("Please input full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Please input day of birth: ");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Please input gender: ");
        String gender = scanner.nextLine();

        System.out.println("Please input ID card: ");
        String idCard = scanner.nextLine();

        System.out.println("Please input phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Please input email: ");
        String email = scanner.nextLine();

        System.out.println("Please input type of customer: ");
        String typeOfCustomer = scanner.nextLine();

        System.out.println("Please input address: ");
        String address = scanner.nextLine();

        FileUtils.setFullPathFile(fileName);  // set duong dan
        FileUtils.writeFile(new String[]{fullName,dayOfBirth,gender,idCard,phoneNumber,email,typeOfCustomer,address});


    }


    private static List<Customer> readAllCustomers (String fileName){
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesCustomer = FileUtils.readFile();
        List<Customer> listOfCustomers = new ArrayList<>();
        String[] arrPropertyCustomer = null;
        Customer customer = null;

        for( String properties : propertiesCustomer) {
            arrPropertyCustomer = properties.split((StringUtils.COMMA));
        }
        return listOfCustomers;
    }

    private static void showInformationOfCustomer(String fileName) {

    }




    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }








}
