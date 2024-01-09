package Day11_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        // 1. Step: Create a scanner object
        Scanner userInput= new Scanner(System.in);

        // 2. Give some explanations to the user with println()
        System.out.println("Enter your username:");

        // 3. Step: get a String input using userInput.nextLine()

        String userName=userInput.nextLine(); // input type should be a String

        // 4. Step Use or process the data you get
        // in this example I will print

        System.out.println("userName = " + userName);


    }
}
