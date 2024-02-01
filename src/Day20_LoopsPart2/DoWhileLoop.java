package Day20_LoopsPart2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        do{

            System.out.println("Please enter a number, I will calculate its square");
            System.out.println("Please enter 0 to exit");
            num= scan.nextInt();

            System.out.println("The square of " + num + " is = " + (num*num) );




        }while(num != 0);

        System.out.println("You exitted the program");



    }
}
