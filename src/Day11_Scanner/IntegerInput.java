package Day11_Scanner;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {

        // 1. Step Create a scanner object

        Scanner getInteger=new Scanner(System.in);

        // 2. Write a tutorial to the user

        System.out.println("Enter an integer number: ");

        //        use getInteger.nextInt();

        int saveNumber= getInteger.nextInt(); // with this line
        // I get a integer input from the user and save it in a integer variable

        System.out.println("You entered "+saveNumber);
    }
}
