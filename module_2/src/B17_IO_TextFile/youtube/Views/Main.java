package B17_IO_TextFile.youtube.Views;

import B17_IO_TextFile.youtube.Commons.FuncFileCSV;
import B17_IO_TextFile.youtube.models.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Student> listStudent = new ArrayList<Student>();
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu(){
        System.out.println("Plesase choose you want: \n" +
                "1.Add New Student. \n" +
                "2.Show information Student. \n" +
                "3.Delete information Student\n" +
                "4.Edit information Student\n" +
                "5.Exit." );
        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                addNewStudent();
                break;
            case "2":
                showInformationStudent();
                break;
            case "3":
                  deleteStudent();
                  break;
            case "4":
                 editStudent();
                 break;
            case "5":
                System.exit(0);// khi ket thuc chuong trinh thi se co 1 file sinh ra
                break;
            default:
                System.out.println(" Failt! Please choose again! Enter to continue!!!");
                sc.nextLine(); // đón phím enter
                displayMainMenu(); // hiện lại menu để chọn lại menu kia.
        }

    }

    private static void addNewStudent() {
        listStudent = FuncFileCSV.getFileCSVToListStudent();// ghi de quan trong. lay het du lieu tu filce csv bo vao liststuden arrraylist sao do them vao. chu neu chi co ham write ko thi no se ghi de len du lieu cu

        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter Id student");
        student.setId(sc.nextLine());
        System.out.println("Enter name student");
        student.setName(sc.nextLine());
        System.out.println("Enter the grade");
        student.setGrade(sc.nextLine());
        System.out.println("Enter the adress ");
        student.setAddress(sc.nextLine());
        listStudent.add(student); // nhap du lieu vao list

        FuncFileCSV.writeStudentToFileCSV(listStudent); // ghi du lieu tu student vao file csv
        System.out.println(" Add new student complete! Enter to continue...");
        sc.nextLine();
        displayMainMenu();

    }

    private static void showInformationStudent() {
        getAllInformationStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter to continue.");
        sc.nextLine();
        displayMainMenu();
    }

    private static void getAllInformationStudent() {
        listStudent = FuncFileCSV.getFileCSVToListStudent();
        for(Student student: listStudent) {
            System.out.println("------------------------------");
            System.out.println("Id " + student.getId());
            System.out.println("Name " + student.getName());
            System.out.println("Grade " + student.getGrade());
            System.out.println("Address " + student.getAddress());
            System.out.println("------------------------------");
        }
    }

    private static void deleteStudent(){
        getAllInformationStudent();
        System.out.println("Enter the ID student you want delete information");
        Scanner sc = new Scanner(System.in);
        String chooseIdDelete = sc.nextLine();
        for (int i = 0; i< listStudent.size(); i++) {
            if(listStudent.get(i).getId().equals(chooseIdDelete)) {
                listStudent.remove(i);
                FuncFileCSV.writeStudentToFileCSV(listStudent);
                System.out.println("Delete complete ");
                break;
            }
        }
        System.out.println(" Enter to continue.");
        sc.nextLine();
        displayMainMenu();
    }

    private static void editStudent() {
        Scanner sc = new Scanner(System.in);
        getAllInformationStudent();
        System.out.println("Enter the ID student you want to edit: ");
        String chooseIdEdit = sc.nextLine();
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getId().equals(chooseIdEdit)) {
                System.out.println(" 1. "+ listStudent.get(i).getId());
                System.out.println(" 2. "+ listStudent.get(i).getName());
                System.out.println(" 3. "+ listStudent.get(i).getGrade());
                System.out.println(" 4. "+ listStudent.get(i).getAddress());
                System.out.println(" Please choose property of student you want edit ");
                String chooseProperty = sc.nextLine();
                System.out.println("Please enter you want to change ");
                String valueProperty = sc.nextLine();
                switch (chooseProperty){
                    case "1":
                        listStudent.get(i).setId(valueProperty);
                        break;
                    case "2":
                        listStudent.get(i).setName(valueProperty);
                        break;
                    case "3":
                        listStudent.get(i).setGrade(valueProperty);
                        break;
                    case "4":
                        listStudent.get(i).setAddress(valueProperty);
                        break;
                }
                FuncFileCSV.writeStudentToFileCSV(listStudent);
                System.out.println(" Edit complete ");
                System.out.println("Enter to continue");
                sc.nextLine();
                displayMainMenu();
                break;
            }
        }
    }

}
