package FuramaResortDon.Controllers;

import FuramaResortDon.commons.FileCsv;
import FuramaResortDon.commons.InputData;
import FuramaResortDon.models.House;
import FuramaResortDon.models.Room;
import FuramaResortDon.models.Services;
import FuramaResortDon.models.Villa;

import java.util.*;


public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    public static final  String VILLA_FILE_PATH = "src/FuramaResort/data/Villa.csv";
    public static final  String HOUSE_FILE_PATH = "src/FuramaResort/data/House.csv";
    public static final  String ROOM_FILE_PATH = "src/FuramaResort/data/Room.csv";
    public static List<Services> villaList = new ArrayList<>();
    public static List<Services> houseList = new ArrayList<>();
    public static List<Services> roomList = new ArrayList<>();



    public static void displayMainMenu() {
        System.out.println("----------Main Menu----------\n" +
                "1.Add New Service\n" +
                "2.Show Service\n" +
                "3.Add new customer\n" +
                "4.Show information of customer\n" +
                "5.Add new booking\n" +
                "6.Cinema ticket\n" +
                "7.Show information of Employee\n" +
                "8.Search employee profile\n" +
                "9.Exit\n" +
                "Please choose the function: ");

        String mainMenuIndex = scanner.nextLine();

        switch (mainMenuIndex) {
            case "1":
                addNewServies();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomers();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                cinameTicket();
                break;
            case "7":
                showInformationOfEmployee();
                break;
            case "8":
                searchEmployeeProfile();
                break;

            case "9":
                System.exit(0);
            default:
                System.out.println(" The index input is wrong. Please Enter to continue ");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    public static void addNewServies() {

        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack To The Menu\n" +
                "5.\tExit\n" +
                "Please choose the function: ");

        String newServicesIndex = scanner.nextLine();

        switch (newServicesIndex) {
            case "1":
                Villa villa = InputData.villa();
                villaList.add(villa);
                FileCsv.writeServicesToCSV(villaList,VILLA_FILE_PATH);
                System.out.println("Add villa successfully ");
                System.out.println("Press Enter to continue");
                scanner.nextLine();
                addNewServies();
                break;
            case "2":
                House house = new House();
                houseList.add(house);
                FileCsv.writeServicesToCSV(houseList,HOUSE_FILE_PATH);
                System.out.println("Add house successfully ");
                System.out.println("Press Enter to continue");
                scanner.nextLine();
                addNewServies();
                break;
            case "3":
                Room room = new Room();
                roomList.add(room);
                FileCsv.writeServicesToCSV(roomList,ROOM_FILE_PATH);
                System.out.println("Add room successfully ");
                System.out.println("Press Enter to continue");
                scanner.nextLine();
                addNewServies();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println(" The index is wrong. Please Enter to continue ");
                scanner.nextLine();
                addNewServies();
        }
    }


    private static void showServices() {

    }

    private static void addNewCustomer() {

    }

    private static void showInformationOfEmployee() {

    }

    private static void addNewBooking() {

    }

    private static void cinameTicket() {

    }

    private static void showInformationCustomers() {

    }

    private static void searchEmployeeProfile() {

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
