package Day08_IfStatements;

public class IfElseStatements {

    public static void main(String[] args) {

        int num = -15;
        boolean isNightTime= true;
        double health=9.5;

        System.out.println("hi you started the game");

        System.out.println(" I am out of if else statement");
        System.out.println(" I am out of if else statement");

        if (num > 0) {

            System.out.println(num + " is a positive number");

        } else {
            System.out.println(num + " is a negative number");
        }


        System.out.println(" I am out of if else statement");
        System.out.println(" new line of code ");
        System.out.println(" another line");


        System.out.println("*************************************");

        int num2=7;

        //  7 / 2 = 3   (3*2)+ 1 = 7



        if ( num2 % 2 == 0){
            // true condition
            System.out.println(num2 + " is an EVEN number");
        }else{
            // false condition
            System.out.println(num2 + " is an ODD number");

        }


        System.out.println("*********************************");

        if ( false ){
            System.out.println(num2 + " is a number");
        }else{
            System.out.println("We are in else statement code block");
        }







    }


}
