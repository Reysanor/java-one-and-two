
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(read(scanner.nextLine()));

    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();

        try {
            rows = Files.lines(Paths.get(file))
                    .collect(Collectors.toCollection(ArrayList::new));
            //   .forEach(row -> System.out.println(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for(String s :rows){
            System.out.println(s);
        }
        return rows;
    }
}
