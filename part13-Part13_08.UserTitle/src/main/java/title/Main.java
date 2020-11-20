package title;


import javafx.application.Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write the title: ");
        Application.launch(JavaFxApplication.class,
                "--title="+scanner.nextLine());
    }
}
