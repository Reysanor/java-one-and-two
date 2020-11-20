
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
// We initialise the scanner and the list into which the input is read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

// reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

// working out the average
        double average = inputs.stream()
                .mapToInt(Integer::valueOf)
                .average()
                .getAsDouble();

// printing out the statistics
        System.out.println("average of the numbers: " + average);


    }
}
