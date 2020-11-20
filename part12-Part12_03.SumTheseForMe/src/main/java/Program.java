
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};
        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int from = Math.max(fromWhere, 0);
        int to = Math.min(toWhere, array.length);
        int sum = 0;
        for (int i = from; i < to; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }

        return sum;
    }
}
