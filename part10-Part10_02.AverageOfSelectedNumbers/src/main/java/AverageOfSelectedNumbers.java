
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        // We initialise the scanner and the list into which the input is read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
// reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String divider = scanner.nextLine();


        double average;
        if (divider.equals("n")) {
            average = inputs.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);

        } else {
            average = inputs.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);

        }


    }
}
