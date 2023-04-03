package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        String csvFile = "./data.csv";
        String line = "";
        String csvDelimiter = ",";
        String[] header = null;
        Map<String, String> row = null;
        Map<String, String>[] array = new HashMap[6];

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            header = br.readLine().split(csvDelimiter);
            System.out.println(header[0]);
            int j = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvDelimiter);
                row = new HashMap<String, String>();
                for (int i = 0; i < header.length; i++) {
                    row.put(header[i], values[i]);
                }
                array[j] = row; 
                j++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Map <String,String> a : array){
            String insComp = a.get("Insurance_Company");
            System.out.println(insComp);
        }
        // for(Map <String,String> a: array){
        //     String insComp = a.get("Insurance_Company");
        //     String folderPath = System.getProperty("user.dir");
        //     File folder = new File(folderPath);
        //     File[] fileList = folder.listFiles();
            
        //     for 

        // }
    }
}
