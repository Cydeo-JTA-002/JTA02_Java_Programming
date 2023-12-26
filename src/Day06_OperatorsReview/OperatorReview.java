package Day06_OperatorsReview;

public class OperatorReview {
    public static void main(String[] args) {

        //Arithmetic Operators

        //  +  - / * %
        System.out.println(10+5);
        System.out.println(10-5);
        System.out.println(10/5);
        System.out.println(10*5);

        //     23+12+"23"    35+"23"    "3523"
        //      1+1+"1"+25   2+"1"+25   "21"+25    "2125"
        //      5+3+"35"+54    8+"35"+54 "835"+54   "83554"

        //REMAINDER
        // in minecraft with 5 diamonds we can buy 1 helmet. if we have 16 diamonds
        //how many helmets can I buy?
        //how many diamonds will be left?

        System.out.println("1_"+16/5+" helmets");
        System.out.println("2_"+16%5+" diamond is left");
        //   23%5  3    34%3   1


        //UNARY OPERATORS
        //   +  -  ++  --      no+++  or no---
        // -3

        System.out.println(-3);
        int wood=5;
        wood++; // wood+1      wood=wood+1
        System.out.println(wood);  //6

        wood--; // i used one wood so -1  like wood=wood-1

        System.out.println(wood);

        // using ++ we increase a variable by 1
        //using -- we decrease a variable by 1

        int number=12;
                 number = number+1; //12+1  now number is 13
        System.out.println("number = " + number);

        int counter=0;

        System.out.println("counter = " + counter);

        counter=counter+1;  // counter is 1 now

        System.out.println("counter = " + counter);

        counter=counter+5;

        System.out.println("counter = " + counter);


       int health= 9;

       health--;

        System.out.println("health = " + health);

        health=health+1;

        System.out.println("health = " + health);


        // increase health by 3

        health=health+3;

        System.out.println("health = " + health);


    }
}
