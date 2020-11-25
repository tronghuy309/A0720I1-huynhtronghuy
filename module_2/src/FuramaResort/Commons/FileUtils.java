package FuramaResort.Commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class FileUtils {  //doc ghi file   15 phut task 2
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String path;


    public static void writeFile(String[] content){
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true)); // true de khong bi ghi de
            bufferedWriter.write(StringUtils.concat(content,StringUtils.COMMA));
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile() {
        List<String> arrayContent = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            String line = null;

            while((line = bufferedReader.readLine())  !=null) {
                arrayContent.add(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayContent;
    }
    
    public static void setFullPathFile(String fileName) {      // set nguyen duong dan vao.
        StringBuffer path = new StringBuffer("E:\\CODE\\A0720I1_huynh_trong_huy\\module_2\\src\\FuramaResort\\data\\"); // stringbuffer để cong choi lai voi nhau
        path.append(fileName);
        path.append(StringUtils.CSV);

        FileUtils.path = path.toString();
    }
}

