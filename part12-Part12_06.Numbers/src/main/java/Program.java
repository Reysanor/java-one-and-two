
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<howMany;i++) System.out.println(new Random().nextInt(11));

    }
}
