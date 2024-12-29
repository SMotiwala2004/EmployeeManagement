import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("""
                    What would you like to do today?
                    1) Employee Sign In
                    2) Admin Sign In
                    3) Exit System
                    """);
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1" -> { System.out.println("1"); break; }
                case "2" -> { System.out.println("2"); break; }
                case "3" -> { System.exit(64); break; }
                default -> { System.out.print("Invalid choice. Please try again.\n" ); }

            }
        }
    }
}