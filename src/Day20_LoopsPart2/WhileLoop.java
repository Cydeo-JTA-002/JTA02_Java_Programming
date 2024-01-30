package Day20_LoopsPart2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // numbers up to 10

        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();



        int num=0;
        while (num <= 10){

            System.out.print(num+ " ");
            num++;

        }

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Hey user please enter a number, I will put all numbers down to zero");


        int num2= input.nextInt();

        while (num2>=0){
            System.out.print(num2+" ");
            num2--;
        }

    }
}
