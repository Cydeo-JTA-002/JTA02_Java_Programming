package Day17_CustomMethodsContinue;

public class ParameterReturnMethods {
    public static void main(String[] args) {
        System.out.println(leftOverArea(10));
        System.out.println(leftOverArea(9));

    }

    public static int areaOfSquare(int edgeOfSquare){

        int areaOfSquare=edgeOfSquare*edgeOfSquare;

        return areaOfSquare;
    }
    public static double areaOfCircle(double radius){

        double areaCircle=3.14*radius*radius;
        return  areaCircle;
    }

    // lets create calculate leftOver() as a return method accepting edgeOfSquare

    public static double leftOverArea(int edgeOfSquare){

       // I need area of square
        int squareArea=areaOfSquare(edgeOfSquare);
       // I need area of circle
       double circleArea=areaOfCircle(edgeOfSquare/4);
       // result is areaof square- 4*cicrclearea
        double result= squareArea-4*circleArea;

        return result;
    }





}
