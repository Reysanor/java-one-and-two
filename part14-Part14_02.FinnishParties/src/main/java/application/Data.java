package application;

import java.nio.file.Paths;
import java.util.*;

public class Data {


    public Map<String, Map<Integer,Double>> load() {
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            // we read all the lines of the file
            String[] years = scanner.nextLine().split("\t");
            int[] cleanYears = new int[years.length];
            cleanYears[0]=0;
            for (int i = 1; i < years.length; i++) cleanYears[i] = Integer.parseInt(years[i]);

            Map<String, Map<Integer,Double>> data = new LinkedHashMap<>();
            while (scanner.hasNextLine()) {
                String[] temp = scanner.nextLine().split("\t");
                String name = temp[0];

                data.put(name,new HashMap<>());
                for (int i = 1; i < temp.length; i++) {
                    if (!temp[i].equals("-")) data.get(name).put(cleanYears[i],Double.parseDouble(temp[i]));
                }

            }
            scanner.close();
            //print(data);
            return data;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public void print(Map<String, Map<Integer,Double>> map) {
        map.forEach((key, value) -> {
            System.out.println(key);
            value.forEach((key2,value2) ->{
                System.out.println(key2 + " " + value2);
            });
        });
    }
}
