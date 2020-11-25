package B17_IO_TextFile.youtube.Commons;

import B17_IO_TextFile.thuc_hanh.FileUtil;
import B17_IO_TextFile.youtube.models.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FINAL_HEADER_STUDENT = "ID,NAME,GRADE,ADDRESS";
    private static final String fileNameStudent = "src/B17_IO_TextFile/youtube/data/Student.csv";// tao duong dan cho file


    public static void writeStudentToFileCSV(ArrayList<B17_IO_TextFile.youtube.models.Student> listStudent){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameStudent); // tao ra file se luu du lieu
            fileWriter.append(FINAL_HEADER_STUDENT);
            fileWriter.append(NEW_LINE_SEPARATOR);// tu doan nay thi se tao vong lap de luu du lieu
            for (Student student: listStudent) { //lap lay du lieu cua student tu listStudent
                fileWriter.append(student.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getGrade());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        }catch (Exception e){
            System.out.println("Error in CsvFileWriter");
        }finally { // co loi hay ko thi cung thuc hien khoi finally.
            try{
                fileWriter.flush(); // xoa bo nho dem
                fileWriter.close(); // dong chuong trinh
            }catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Student> getFileCSVToListStudent(){   // kieu tra ve la arraylist kieu du lieu sinh vien
        BufferedReader br = null;
        ArrayList<Student> listStudent = new ArrayList<Student>();
        Path path = Paths.get(fileNameStudent);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(fileNameStudent);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try{
            String line;                                                       // tao ra mot bien line de doc tung dong
            br = new BufferedReader(new FileReader(fileNameStudent));         // bat buoc phai co file tuc la file reader va thu 2 la bufferedReader. doc file tu duong dan nao

            while (( line = br.readLine()) !=null) {                            //br chua toan bo du lieu duoc doc tu duong dan fileNamStudent. doc tung dong bang cach gan line vao
                String[] splitData = line.split(",");                   // tao mot mang splitData va cat no ra thanh cac mang, canh nhau boi dau phay
                if(splitData[0].equals("ID")) {
                    continue ;
                }
                Student student = new Student();
                student.setId(splitData[0]);
                student.setName(splitData[1]);
                student.setGrade(splitData[2]);
                student.setAddress(splitData[3]);
                listStudent.add(student);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listStudent; // tra ve du lieu
    }

}
