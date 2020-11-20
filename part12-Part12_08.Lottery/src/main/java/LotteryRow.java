
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random random = new Random();
        // Implement the random number generation here
        while (numbers.size() < 7) {
            int temp = random.nextInt(40) + 1;
            if (!containsNumber(temp)) numbers.add(temp);
        }
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

