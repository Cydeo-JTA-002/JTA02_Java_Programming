package Day18_MethodOverloading;

public class MethodsReview {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 15;

        // System.out.println("the sum is " + 10+15);
        // I want to get the sum of them
        Add(10,15);

        int num3=30;
        int num4 =40;

        Add(num3,num4);

        int num5= 100;
        int num6 =200;

        int result= Add(num5,num6);

        System.out.println(result);

    }

    public static int Add(int myNumber1, int myNumber2){

        int sum  = myNumber1+ myNumber2;
       // System.out.println("The sum is " + sum);

        return sum;

    }



}
