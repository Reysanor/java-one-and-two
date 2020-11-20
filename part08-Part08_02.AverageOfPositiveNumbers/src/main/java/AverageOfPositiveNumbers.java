
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String word = scanner.nextLine();

            if (Integer.parseInt(word) == 0) {
                break;
            }
            list.add(Integer.parseInt(word));
        }
        int licznik = 0;
        int sum = 0;
        for (Integer liczba : list) {
            if (liczba > 0) {
                licznik++;
                sum += liczba;

            }
        }

        if (licznik == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((sum * 1.0) / licznik);
        }

    }
}
