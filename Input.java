import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        String name = new String();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Your name is " + name + " and your age is " + age);

        input.close(); // Close the scanner to prevent resource leaks

    }

}