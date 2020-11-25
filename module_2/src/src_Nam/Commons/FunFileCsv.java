package Commons;

import Models.Customer.Customer;
import Models.Employee.Employee;
import Models.Services.House;
import Models.Services.Room;
import Models.Services.Services;
import Models.Services.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunFileCsv {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILENAMEVILLA = "src/Data/Villa.csv";
    private static final String FILENAMEROOM = "src/Data/Room.csv";
    private static final String FILENAMEHOUSE = "src/Data/House.csv";
    private static final String FILENAMECUSTOMER = "src/Data/Customer.csv";
    private static final String FILENAMEEMPLOYEE = "src/Data/Employee.csv";
    //header file CSV Student; q
    private static final String FORM_HORIZONTALLY = "-------------------\n";
    //String id, String nameOfService, double areaUsed, int price, int maxOfPeople, String rentType
    private static final String FILE_HEADER_VILLA = "ID,NameOfService,AreaUsed,Price,MaxOfPeople,RentType,TypeOfRoom,OtherConvenient,PoolArea,floor";
    //String typeOfRoom, String otherConvenient, int floor
    private static final String FILE_HEADER_HOUSE = "ID,NameOfService,AreaUsed,Price,MaxOfPeople,RentType,TypeOfRoom,OtherConvenient,Floor";
    //freeService
    private static final String FILE_HEADER_ROOM = "ID,NameOfService,AreaUsed,Price,MaxOfPeople,RentType,FreeService";
    //String nameOfCustomer, String dateOfBirth, String gender, String idCard,
    // String phoneNumber, String email, String typeOfCustomer, String address, Service useService
    private static final String FILE_HEADER_CUSTOMER = "NameOfCustomer,DateOfBirth,Gender,IdCard,PhoneNumber,Email,TypeOfCustomer,Address,UserService";
    private static final String FILE_HEADER_EMPLOYEE = "ID,Name,Age,Address";

    public static void writeEmployeeToCsv(List<Employee> employeeList){
        File file = new File(FILENAMEEMPLOYEE);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(FILE_HEADER_EMPLOYEE);
            bufferedWriter.append(NEW_LINE_SEPARATOR);

            for (Employee temp : employeeList){
                bufferedWriter.append(temp.toString());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String,Employee> readEmployee(){
        Map<String,Employee> employeeMap = new LinkedHashMap<>();
        File file = new File(FILENAMEEMPLOYEE);

        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] splitData = line.split(",");
                if(splitData[0].equals("Name")){
                    continue;
                }
                Employee employee = new Employee();
                employee.setName(splitData[0]);
                employee.setAddress(splitData[1]);
                employee.setAge(splitData[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error when find File CSV!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Error when read file CSV!");
        }
        return employeeList;
    }

//    public static void readEmployeeToCSV()

    public static void writeCustomerToCSV(List<Customer> customerList) {
        File file = new File(FILENAMECUSTOMER);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(FILE_HEADER_CUSTOMER);
            bufferedWriter.append(NEW_LINE_SEPARATOR);

//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(FILE_HEADER_CUSTOMER);
//            stringBuilder.append(customer.getNameOfCustomer()).append(COMMA_DELIMITER).append(customer.getDateOfBirth()).append(COMMA_DELIMITER)
//                    .append(customer.getGender()).append(COMMA_DELIMITER).append(customer.getIdCard()).append(COMMA_DELIMITER).append(customer.getPhoneNumber())
//                    .append(COMMA_DELIMITER).append(customer.getEmail()).append(COMMA_DELIMITER).append(customer.getTypeOfCustomer()).append(COMMA_DELIMITER)
//                    .append(customer.getAddress()).append(COMMA_DELIMITER).append(customer.getUseService());
            for (Customer temp : customerList) {
                bufferedWriter.write(temp.toString());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            System.out.println("Can't find customer File to read!");
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static List<Customer> readCustomerToCSV(){
        List<Customer> customerList = new ArrayList<>();
        File file = new File(FILENAMECUSTOMER);

        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] splitData = line.split(",");
                if(splitData[0].equals("NameOfCustomer")){
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameOfCustomer(splitData[0]);
                customer.setDateOfBirth(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setTypeOfCustomer(splitData[6]);
                customer.setTypeOfCustomer(splitData[7]);
                customer.setAddress(splitData[8]);
                customerList.add(customer);
                // Bi thieu so 9
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro when find File CSV!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Erro when read file CSV!");
        }
        return customerList;
    }

    public static <T> void writeVillaToCSV(List<T> list, String value) {
        FileWriter fileWriter = null;
        //String typeOfRoom, String otherConvenient, double poolArea, int floor)

        try {
            if (value.equals("Villa")) {
                fileWriter = new FileWriter(FILENAMEVILLA);
                fileWriter.append(FILE_HEADER_VILLA);
//                fileWriter.append(NEW_LINE_SEPARATOR);

            } else if (value.equals("Room")) {
                fileWriter = new FileWriter(FILENAMEROOM);
                fileWriter.append(FILE_HEADER_ROOM);
//                fileWriter.append(NEW_LINE_SEPARATOR);

            } else {
                fileWriter = new FileWriter(FILENAMEHOUSE);
                fileWriter.append(FILE_HEADER_HOUSE);
//                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (T temp : list) {
                fileWriter.append(temp.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CSV file Writer !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }


    public static List<Services> readFileCSV(String value) {
        BufferedReader brReader = null;
        List<Services> list = new ArrayList<>();
        String filePath = null; // Duong dan - ban dau k co gi het

        switch (value) {
            case "Villa":
                filePath = FILENAMEVILLA;
                break;
            case "House":
                filePath = FILENAMEHOUSE;
                break;
            case "Room":
                filePath = FILE_HEADER_ROOM;
                break;
        }

        try {
            brReader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = brReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("ID")) {
                    continue;
                }
                switch (value) {
                    case "Villa": {
                        Villa villa = new Villa();
                        villa.setId(splitData[0]);
                        villa.setNameOfService(splitData[1]);
                        villa.setAreaUsed(Double.parseDouble(splitData[2]));
                        villa.setPrice(Integer.parseInt(splitData[3]));
                        villa.setMaxOfPeople(Integer.parseInt(splitData[4]));
                        villa.setRentType(splitData[5]);
                        villa.setTypeOfRoom(splitData[6]);
                        villa.setOtherConvenient(splitData[7]);
                        villa.setPoolArea(Double.parseDouble(splitData[8]));
                        System.out.println(splitData[9]);
                        villa.setFloor(Integer.parseInt(splitData[9]));
                        list.add(villa);
                        break;
                    }

                    case "House":
                        House house = new House();
                        house.setId(splitData[0]);
                        house.setNameOfService(splitData[1]);
                        house.setAreaUsed(Double.parseDouble(splitData[2]));
                        house.setPrice(Integer.parseInt(splitData[3]));
                        house.setMaxOfPeople(Integer.parseInt(splitData[4]));
                        house.setRentType(splitData[5]);
                        house.setTypeOfRoom(splitData[6]);
                        house.setOtherConvenient(splitData[7]);
                        System.out.println(splitData[8]);
                        house.setFloor(Integer.parseInt(splitData[8]));
                        list.add(house);
                        break;
                    case "Room":
                        Room room = new Room();
                        room.setId(splitData[0]);
                        room.setNameOfService(splitData[1]);
                        room.setAreaUsed(Double.parseDouble(splitData[2]));
                        room.setPrice(Integer.parseInt(splitData[3]));
                        room.setMaxOfPeople(Integer.parseInt(splitData[4]));
                        room.setRentType(splitData[5]);
                        room.setFreeService(splitData[6]);
                        list.add(room);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error When Read File CSV");
        } finally {
            try {
                brReader.close();
            } catch (Exception e) {
                System.out.println("Error In Close BufferedReader");
            }
        }
        return list;
    }
}
