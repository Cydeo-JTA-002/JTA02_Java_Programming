package Day20_LoopsPart2;

public class ForLoopPractices {
    public static void main(String[] args) {

        // all even numbers between 1 and 100

        int counter = 0;
        for (int i = 0; i < 101; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
                counter++;
            }


        }
        System.out.println();
        System.out.println(counter);

        System.out.println("--------------------------------------");

        int sumOfOdds = 0;
        int sumOfEvens = 0;

        for (int i = 0; i < 101; i++) {

            //System.out.print(i+" ");
            if (i % 2 == 0) {
                sumOfEvens = sumOfEvens + i;
            } else {
                sumOfOdds = sumOfOdds + i;
            }

        }
        System.out.println();
        System.out.println("Sum of Even Numbers = " + sumOfEvens);
        System.out.println("Sum of Odd Numbers = " + sumOfOdds);

        System.out.println("-----------------------------");

        int num = 3;

        for (int i = 1; i < 11; i++) {

            System.out.println(num + " X " + i  + "\t= " + (num*i));

        }

        System.out.println("----------------------");

        for (int i = 1; i <=7 ; i++) {


            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

    }
}
