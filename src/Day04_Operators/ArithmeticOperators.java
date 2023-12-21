package Day04_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(123+45);

        System.out.println(2344-244);

        System.out.println(23*45);

        System.out.println(66/6);

        System.out.println(10/3);

        // if the number used in arithmetic ops is full number/whole number it is assumed as integer
        // if it has floating value then it is assumed as double

        // if we divide an integer/integer ==>  integer

        //if we divide a double / integer or an integer/ double ==>  double

        System.out.println(10.0/3);
        System.out.println(10/3.0);

        int num1=27;
        int num2=9;
        System.out.println(num1+num2);

        int sum;
        sum=num1+num2;
        
        // a sentence. == statement;

        System.out.println("sum = " + sum);

        // modulus %   23 % 3  = 23/3 7*3=21====> 2

        // odd number   1 3 5 7    7%2=1   5%2=1      7%2 is not 0
        // even number  2 4 6 8    8%2=0   6%2=0      8%2  is not 1

        // a number can be either odd or even

        System.out.println(1%8);

        //lets check if num3 is even

        int num3=878979873;
        System.out.println(num3%2);

        //check num3 is odd?
        System.out.println(num3%2);

        int num4=+3;
        int num5=-3;
        // sum num4 and num5 and assign it to int result variable
        int result=num4+num5;
        //how can i see things in the console
        // by printing
        System.out.println("result = " + result);
        System.out.println(result);

        int number=33;
        number++; // it increases number by 1
        System.out.println(number);
        //last value of number was 34
        number--; // after this ops it should 33 again lets see
        System.out.println(number);



    }

}
