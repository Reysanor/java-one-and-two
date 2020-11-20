
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            String row = scanner.nextLine();
            if (Integer.parseInt(row) < 0) {
                break;
            }
            numbers.add(Integer.parseInt(row));

        }
        numbers.stream().filter(num -> num>0 && num<6).forEach(num -> System.out.println(num));
    }
}
