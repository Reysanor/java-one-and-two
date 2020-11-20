import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {

        while (true) {
            System.out.print("Command ");
            String word = scanner.nextLine();

            if (word.equals("stop")) {
                break;
            } else if (word.equals("add")) {
                System.out.println("To add: ");
                todoList.add(scanner.nextLine());
            } else if (word.equals("list")) {
                todoList.print();
            } else if (word.equals("remove")) {
                System.out.println("Which one is removed? ");
                todoList.remove(Integer.parseInt(scanner.nextLine()));
            } else {
                System.out.println("Unknown command");
            }


        }

    }
}
