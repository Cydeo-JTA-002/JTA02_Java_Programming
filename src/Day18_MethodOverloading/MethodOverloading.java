package Day18_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {

        int num1 = 3;
        int num2= 4;
        double num3 = 5.0;

        sum();
        sum(4.5,7);
        sum(6,4);

        //sumDoubleInt();
       // sumInInt();

        String str1 = "David";




    }

    public static void sum(){
        System.out.println("the sum is " + (3+4));

    }

    public static void sum(int num1, int num2){
        System.out.println("sum is : " + (num1+num2));
    }

    public static void sum(int num1, double num6){

    }

    public static void sum(double num7, int num1){
        System.out.println("sum is : " + (num7+num1) );
    }

}
