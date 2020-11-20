
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int First = 0;
        int Second = 0;

        while (true) {
            // System.out.print("> ");


            System.out.println("First: " + First + "/100");
            System.out.println("Second: " + Second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    if (First + amount > 100) {
                        First = 100;
                    } else {
                        First += amount;
                    }
                }
            }

            if (command.equals("move")) {
                if (amount > 0) {
                    if (First >= amount) {
                        First -= amount;
                        if (amount + Second >= 100) {
                            Second = 100;
                        } else {
                            Second += amount;
                        }

                    } else if (First < amount) {
                        if (First + Second >= 100) {
                            Second = 100;
                        } else {
                            Second += First;
                        }
                        First = 0;

                    }

                }
            }


            if (command.equals("remove")) {
                if (amount > 0) {
                    if (Second - amount < 0) {
                       Second=0;
                    } else {
                        Second-= amount;
                    }
                }
            }

        }
    }
}

