package FuramaResortDon.commons;

import FuramaResortDon.models.House;
import FuramaResortDon.models.Room;
import FuramaResortDon.models.Villa;

import java.util.Scanner;

public class InputData {
    static Scanner scanner = new Scanner(System.in);
    public static Villa villa(){
        Villa villa = new Villa();

        System.out.println("------------------");
        System.out.println("Input Villa Information");

        System.out.print("1. Enter the ID: ");
        villa.setId(scanner.nextLine());

        System.out.print("2. Enter the Service Name: ");
        villa.setServiceName(scanner.nextLine());

        System.out.print("3. Enter the Area: ");
        villa.setArea(scanner.nextDouble());

        System.out.print("4. Enter the Rate: ");
        villa.setRate(scanner.nextDouble());

        System.out.print("5. Enter the Max Capacity: ");
        villa.setMaxCapacity(scanner.nextInt());

        System.out.print("6. Enter the Room Type: ");
        villa.setRoomType(scanner.nextLine());

        System.out.print("7. Enter the Comp Service: ");
        villa.setCompService(scanner.nextLine());

        System.out.print("8. Enter the Pool Area: ");
        villa.setPoolArea(scanner.nextDouble());

        System.out.print("9. Enter the Floor: ");
        villa.setFloor(scanner.nextInt());

        return villa;
    }

    public static House house(){
        House house = new House();

        return house;
    }

    public static Room room(){
        Room room = new Room();

        return room;
    }
}
