
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted(Comparator.comparing(p -> p[5]))
                    .forEach(each -> System.out.println(each[3]
                            + " ("
                            + each[4] + "), "
                            + each[2].substring(1, each[2].indexOf("(") - 1)
                            + ", "
                            + each[5].trim()));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        /*
                ArrayList<Result> results = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .map(a -> new Result(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
                    .forEach(t -> results.add(t));
        } catch (IOException ex) {
            System.out.println("Error reading file.");
        }
        results.stream().sorted((t1, t2) -> {
            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                return 1;
            }
            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
         */

    }
}
