package Java_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Review {

    public static void main(String[] args) {


        System.out.println("Hello World");
        System.out.print("Hello Deha");
        System.out.print("Hello Serdor");


        int num1= -7666666;
        short num2 = 120;

        double num3= 3.79;

        String str1 = "Cydeo";

        System.out.println(str1);
        System.out.println(num1+num2);


        System.out.println(num1*num2);

        System.out.println(10/4);  // 2.5

        System.out.println(10 % 3);   // 10 / 3 = 3         // remainder 3*3=9   10-9 = 1

        System.out.println( 9 <= 10 );

        if(num1 > -10) {

            System.out.println("execute teh code inside of if");

        }else {

            System.out.println("execute else block");

        }

        String str2 = "David";

        System.out.println(str2.contains("av"));
        System.out.println(str1.length());
        System.out.println(str2.indexOf("D"));

        System.out.println(str2.toUpperCase());

        System.out.println(add(10,20));

        System.out.println("*****************************");

        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }

        int j=0;
        while (j<5){

            System.out.println(j);
            j++;
        }


        int[] myArr= new int[10];

        System.out.println(Arrays.toString(myArr));

        myArr[2]=55;
        System.out.println(Arrays.toString(myArr));
        myArr[2]=66;
        System.out.println(Arrays.toString(myArr));
        System.out.println(myArr.length);

        ArrayList <Integer> myList = new ArrayList<>();

        myList.add(5);
        myList.add(15);
        myList.add(25);

        System.out.println(myList);

        myList.add(35);
        myList.add(55);
        myList.remove(2);

        System.out.println(myList);
        System.out.println(myList.size());

    }


    public static int add(int num1, int num2){

        System.out.println("addition is : " + (num1+num2) );

        return (num1+num2);

    }


}
