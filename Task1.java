package PassCheck;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pass checker = new Pass();

        System.out.println("Password Strength Checker");

        while (true) {
            System.out.print("Enter password (or type quit to exit): ");
            String password = scanner.nextLine();

            if (password.equalsIgnoreCase("quit")) {
                break;
            }

            String result = checker.check(password);
            System.out.println("Result: " + result);
        }

        scanner.close();
        System.out.println("Program finished.");
    }
}
