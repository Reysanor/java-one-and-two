
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if(row.isEmpty()){
                break;
            }
            words.add(row);


        }
        words.forEach(word -> System.out.println(word));

    }
}
