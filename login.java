import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Hardcoded credentials
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login System ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check credentials
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }
}
