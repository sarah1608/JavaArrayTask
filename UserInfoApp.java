import java.util.Scanner;

public class UserInfoApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variables to store user input
        String name;
        int age = -1;
        String profession;

        // Get user's name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // Get and validate age
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0) {
                    validAge = true;
                } else {
                    System.out.println("Age cannot be negative. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer for age.");
                scanner.next(); // clear the invalid input
            }
        }

        // Clear buffer before reading the next line
        scanner.nextLine();

        // Get user's profession
        System.out.print("Enter your profession: ");
        profession = scanner.nextLine();

        // Print formatted output
        System.out.println("\n--- User Information Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);

        // Age-based conditional messages
        if (age >= 13 && age <= 19) {
            System.out.println("You're a teenager.");
        } else if (age < 13) {
            System.out.println("You're a child.");
        } else if (age >= 20 && age <= 35) {
            System.out.println("You're a young adult.");
        } else if (age > 35 && age <= 60) {
            System.out.println("You're an adult.");
        } else {
            System.out.println("You're a senior citizen.");
        }

        // Close scanner
        scanner.close();
    }
}
