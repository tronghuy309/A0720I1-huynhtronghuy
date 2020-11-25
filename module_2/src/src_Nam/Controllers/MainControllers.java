package Controllers;

import Commons.FunFileCsv;
import Exeption.ServiceExeption.ServiceValidate;
import Exeption.UserExeption.CustomerValidate;
import Models.Customer.Customer;
import Models.Employee.Employee;
import Models.Services.House;
import Models.Services.Room;
import Models.Services.Services;
import Models.Services.Villa;
import java.util.*;

public class MainControllers {
    private static List<Services> villaList = new ArrayList<>();
    private static List<Services> houseList = new ArrayList<>();
    private static List<Services> roomList = new ArrayList<>();
    private static List<Customer> customerList = new ArrayList<>();

    static Map<String,Employee> employeeMap = new LinkedHashMap<>();

    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);

        int choose;
        System.out.println("========== MENU ==========");
        System.out.println("1. Add New Service");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customomer");
        System.out.println("4. Show Infomation of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Infomation of Employee");
        System.out.println("7. Exit");
        System.out.print("What number of menu do you want to choose?");
        choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                System.out.println("What service do you want to see ?");
                int serviceNum = sc.nextInt();
                switch (serviceNum) {
                    case 1:
                        displayService(villaList);
                        break;
                    case 2:
                        displayService(houseList);
                        break;
                    case 3:
                        displayService(roomList);
                        break;
                    case 4:
                        displayServiceNotDuplicate(villaList);
                        break;
                    case 5:
                        displayServiceNotDuplicate(houseList);
                        break;
                    case 6:
                        displayServiceNotDuplicate(roomList);
                        break;
                    case 7:
                        displayMainMenu();
                        break;
                    case 8:
                        exit();
                        break;
                    default:
                        System.out.println("!!! Input Wrong number ! Enter to try...");
                        sc.nextLine();
                        showService();
                }
            case 3:
                    addNewCustomer();
                    break;
            case 4:
                showCustomerInfo();
                break;
            case 5:
                addNewBooking();
                break;
            case 6:
                addEmployee();
                showAllEmployee();
                break;
            case 7:
                exit();
                break;
            default:
                System.out.println("!!! Input Wrong number ! Enter to try...");
                sc.nextLine();
                displayMainMenu();
        }
    }

    //Add New Service
    public static void addNewService() {
        Scanner sc = new Scanner(System.in);
        int choose;
        System.out.println("======ADD======");
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back To Menu");
        System.out.println("5. Exit !");
        System.out.println("What number of menu do you want to choose ?");
        choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("!!! Input Wrong number ! Enter to try...");
                sc.nextLine();
                displayMainMenu();
        }
    }

    // Child Menu of 2 ( Show Service );
    public static void showService() {
        System.out.println("======= SERVICE ========");
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show all name villa not duplicate");
        System.out.println("5.Show all name house not duplicate");
        System.out.println("6.Show all name name not duplicate");
        System.out.println("7.Back To Menu");
        System.out.println("8.Exit");
    }

    //SHOW Villa , House, Room
    //  1.2.3  Show Service
    public static void displayService(List<Services> servicesList) {
        Scanner sc = new Scanner(System.in);
        for (Services services : servicesList) {
            System.out.println("------------------");
            services.showInfo();
            System.out.println("------------------");
        }
        System.out.println("\nShow info complete ! Enter to continue...");
        sc.nextLine();
        displayMainMenu();
    }

    //4.5.6
    public static void displayServiceNotDuplicate(List<Services> servicesList){
        Scanner sc = new Scanner(System.in);
        Set<String> serviceName = new LinkedHashSet<>();
        for (Services services : servicesList){
            serviceName.add(services.getNameOfService());
        }
        System.out.println(serviceName);
        System.out.println("\nShow info complete ! Enter to continue...");
        sc.nextLine();
        displayMainMenu();
    }

    //Exit
    public static void exit() {
        System.exit(0);
    }

    //ADD NEW VILLA ENCAPSUALATION
    public static void addNewVilla() {
        Scanner sc = new Scanner(System.in);
        Villa villa = new Villa();
        String idVilla;
        String checkNameVilla;
        double checkAreaUsed;
        double checkPool;
        int checkPrice;
        int checkMaxOfPeople;

        do{
            System.out.println("Comfirm : SVXX-YYYY , YYYY [ 0 - 9 ]");
            System.out.print("ID: ");
            idVilla = sc.nextLine();
        } while (!ServiceValidate.checkIDVilla(idVilla));
        villa.setId(idVilla);

        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Name : ");
            checkNameVilla = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkNameVilla));

        villa.setNameOfService(checkNameVilla);

        do{
            System.out.println("Input area larger than 30m2 ");
            System.out.print("Area: ");
            checkAreaUsed = sc.nextDouble();
        } while (checkAreaUsed < 30);
        villa.setAreaUsed(checkAreaUsed);

        do{
            System.out.println("Input Price must be larger than 0");
            System.out.print("Price: ");
            checkPrice = sc.nextInt();
        } while (checkPrice < 0);
        villa.setPrice(checkPrice);

        do{
            System.out.println("Input > 0 and < 20 ");
            System.out.print("Max of People : ");
            checkMaxOfPeople = sc.nextInt();
        } while (!ServiceValidate.checkMaxOfPeople(checkMaxOfPeople));
        villa.setMaxOfPeople(checkMaxOfPeople);

        sc.skip("\n");

        String checkRentType;
        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Rent type : ");
            checkRentType = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkRentType));
        villa.setRentType(checkRentType);


        String checkTypeOfRoom;
        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Input typeOfRoom : ");
            checkTypeOfRoom = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkTypeOfRoom));
        villa.setTypeOfRoom(checkTypeOfRoom);

        String checkConvenient;
        do{
            System.out.println("Must be : massage, karaoke, food, drink, car");
            System.out.print("Input Convenient you want : ");
            checkConvenient = sc.nextLine();
        } while (!ServiceValidate.checkConvenient(checkConvenient));
        villa.setOtherConvenient(checkConvenient);

        do {
            System.out.println("Pool Area must me larger than 30m2 ");
            System.out.print("Input poolArea ( m2 ) : ");
            checkPool = sc.nextDouble();
        } while (checkPool < 30);
        villa.setPoolArea(checkPool);

        int checkFloor;
        do{
            System.out.println("Number of Floor larger than 0");
            System.out.print("Input the number of floor : ");
            checkFloor = sc.nextInt();
        } while (checkFloor < 0);
        villa.setFloor(checkFloor);

        System.out.println("\nAdd new villa complete ! Enter to continue...");
        sc.nextLine();
        sc.nextLine();
        villaList.add(villa);
        FunFileCsv.writeVillaToCSV(villaList, "Villa");

        displayMainMenu();
    }

    //Add New House
    public static void addNewHouse() {
        //String typeOfRoom, String otherConvenient, int floor
        House house = new House();
        Scanner sc = new Scanner(System.in);
        String name;
        String checkNameHouse;
        double checkAreaUsed;
        double checkPool;
        int checkMaxOfPeople;

        int checkPrice;
        do {
            System.out.println("Comfirm : HOVL-YYYY , YYYY [ 0 - 9 ]");
            System.out.print("ID : ");
            name = sc.nextLine();
        } while (!ServiceValidate.checkIDHouse(name));
        house.setId(name);

        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Name : ");
            checkNameHouse = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkNameHouse));
        house.setNameOfService(checkNameHouse);

        do{
            System.out.println("Input Area Used must be larger than 30m2");
            System.out.print("Area: ");
            checkAreaUsed = sc.nextDouble();
        } while (checkAreaUsed < 30);
        house.setAreaUsed(checkAreaUsed);

        do{
            System.out.println("Price must me larger than 0");
            System.out.print("Price: ");
            checkPrice = sc.nextInt();
        } while (checkPrice < 0);
        house.setPrice(checkPrice);

        do {
            System.out.println("Input > 0 and < 20 ");
            System.out.print("Max of People : ");
            checkMaxOfPeople = sc.nextInt();
        } while (checkMaxOfPeople < 0 && checkMaxOfPeople > 20);
        house.setMaxOfPeople(checkMaxOfPeople);

        sc.skip("\n");
        System.out.print("Rent type : ");
        house.setRentType(sc.nextLine());
        System.out.print("Input typeOfRoom : ");
        house.setTypeOfRoom(sc.nextLine());
        System.out.print("Input Convenient you want : ");
        house.setOtherConvenient(sc.nextLine());
        System.out.print("Input the number of floor : ");
        house.setFloor(sc.nextInt());
        System.out.println("\nAdd new house complete ! Enter to continue...");
        sc.nextLine();
        sc.nextLine();

        houseList.add(house);
        FunFileCsv.writeVillaToCSV(houseList, "House");

        displayMainMenu();
    }

    //Add New Room
    public static void addNewRoom() {
        Scanner sc = new Scanner(System.in);
        Room room = new Room();
        String idCheck;
        String checkNameRoom;
        double checkAreaUsed;
        int checkPrice;
        int checkMaxOfPeople;

        do{
            System.out.println("Comfirm : ROVL-YYYY , YYYY [ 0 - 9 ]");
            System.out.print("ID : ");
            idCheck = sc.nextLine();
        } while (!ServiceValidate.checkIDRoom(idCheck));
        room.setId(idCheck);

        do {
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Name : ");
            checkNameRoom = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkNameRoom));
        room.setNameOfService(checkNameRoom);

        do{
            System.out.println("Input Area Used must me larger than 30m2");
            System.out.print("Area: ");
            checkAreaUsed = sc.nextDouble();
        } while (checkAreaUsed < 30);
        room.setAreaUsed(checkAreaUsed);

        do{
            System.out.print("Price: ");
            checkPrice = sc.nextInt();
        } while (checkPrice < 0);
        room.setPrice(checkPrice);

        System.out.print("Max of People : ");
        room.setMaxOfPeople(sc.nextInt());
        sc.skip("\n");
        System.out.print("Rent type : ");
        room.setRentType(sc.nextLine());
        System.out.print("Input the free Service : ");
        room.setFreeService(sc.nextLine());
        System.out.println("\nAdd new house complete ! Enter to continue...");
        sc.nextLine();
        roomList.add(room);
        FunFileCsv.writeVillaToCSV(roomList, "Room");

        displayMainMenu();
    }

    /* CUSTOMER ---------- CUSTOMER ------------ CUSTOMER */
    //String nameOfCustomer, String dateOfBirth, String gender, String idCard, String phoneNumber,
    // String typeOfCustomer, String address, Service useService
    public static void addNewCustomer(){
        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Name of customer: ");
        customer.setNameOfCustomer(sc.nextLine());

        String checkMail;
        do {
            System.out.println("Comfirm : xxx@gmail.com");
            System.out.print("Mail : ");
            checkMail = sc.nextLine();
        } while (!CustomerValidate.regexMail(checkMail));
        customer.setEmail(checkMail);

        String checkDobCustomer;
        do{
            System.out.println("Comfirm : xx/yy/zzzz");
            System.out.print("Date of birth : ");
            checkDobCustomer = sc.nextLine();
        } while (!CustomerValidate.checkDobCustomer(checkDobCustomer));
        customer.setDateOfBirth(checkDobCustomer);

        String checkGender;
        do{
            System.out.println("Male / Female / Unknow");
            System.out.print("Gender : ");
            checkGender = sc.nextLine();

        } while (!CustomerValidate.genderCheck(checkGender));
        customer.setGender(checkGender);

        System.out.print("Phone number : ");
        customer.setPhoneNumber(sc.nextLine());

        String checkIDCard;
        do{
            System.out.println("Input 9 number !");
            System.out.print("ID CARD : ");
            checkIDCard = sc.nextLine();
        } while (!CustomerValidate.idCardCheck(checkIDCard));
        customer.setIdCard(checkIDCard);


        System.out.print("Type of customer : ");
        customer.setTypeOfCustomer(sc.nextLine());

        System.out.print("Address : ");
        customer.setAddress(sc.nextLine());

        System.out.print("Use Service : ");


        System.out.println("\nAdd new customer complete ! Enter to continue...");
        sc.nextLine();

        customerList.add(customer);
        FunFileCsv.writeCustomerToCSV(customerList);

        displayMainMenu();
    }

    // Show CUSTOMER INFO
    public static void showCustomerInfo(){
        Scanner sc = new Scanner(System.in);
        Collections.sort(customerList);
        for(Customer customer:customerList){
            System.out.println(Customer.dem);
            System.out.println(customer.showInfo());
        }
        System.out.println("\nShow Customer infomation complete! Enter to continue...");
        sc.nextLine();

        displayMainMenu();
    }

    /* CUSTOMER ---------- CUSTOMER ------------ CUSTOMER */

    //--------------------------------------------------------------

    // TASK 7 ADD NEW BOOKING
    public static void addNewBooking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Booking Villa" +
                            "\n2. Booking House" +
                            "\n3. Booking Room");
        System.out.println("What service do you want to choose ?");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                displayService(villaList);
                break;
            case 2:
                displayService(houseList);
                break;
            case 3:
                displayService(roomList);
                break;
        }
    }
    //TASK 7

    //Task 9 - EMPLOYEE
    public static void addEmployee() {
        Scanner sc = new Scanner(System.in);
        Employee myEmployee = new Employee();
        for (int i = 1; i <= 10; i++) {
            System.out.print("Name : ");
            myEmployee.setName(sc.nextLine());
            System.out.print("Age : ");
            myEmployee.setAge(sc.nextLine());
            System.out.print("Address : ");
            myEmployee.setAddress(sc.nextLine());
            employeeList.add(myEmployee);
        }
    }

    public static void showAllEmployee(){
            for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            displayMainMenu();
    }


    //Clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        villaList = FunFileCsv.readFileCSV("Villa");
        houseList = FunFileCsv.readFileCSV("House");
        roomList = FunFileCsv.readFileCSV("Room");
        customerList = FunFileCsv.readCustomerToCSV();

        displayMainMenu();

    }
}
