package Day11_Scanner;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {

        // 1. Step Create a scanner object

        Scanner getDouble=new Scanner(System.in);

        // 2. Write a tutorial to the user

        System.out.println("Enter a double number: ");

        //        use getDouble.nextInt();

        double saveNumber= getDouble.nextDouble(); // with this line
        // I get a integer input from the user and save it in a integer variable

        System.out.println("You entered "+saveNumber);

    }
}
