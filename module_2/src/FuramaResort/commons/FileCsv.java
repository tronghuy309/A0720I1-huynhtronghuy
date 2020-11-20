package FuramaResort.commons;

import FuramaResort.models.Services;
import FuramaResort.models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCsv {
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String VILLA_CODE= "SVVL";
    private static final String HOUSE_CODE= "SVH0";
    private static final String ROOM_CODE= "SVRO";

    public static void writeServicesToCSV(List<Services> serviceList, String filePath){
        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(filePath);
            for (Services service : serviceList) {
                if(serviceList.indexOf(service)==0){
                    fileWriter.append(service.getHeader());
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
                fileWriter.append(service.writeToCSV());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


    public static List<Services> readServiceListFromCSV(String filePath) {
        BufferedReader br = null;
        List<Services> servicesList = new ArrayList<>();

        Path path = Paths.get(filePath);
        if(!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(filePath);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try{
            String line;
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[1].equals("Service Name")) {
                    continue;
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return servicesList;
    }
}

