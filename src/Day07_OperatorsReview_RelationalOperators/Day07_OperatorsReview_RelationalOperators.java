package Day07_OperatorsReview_RelationalOperators;

public class Day07_OperatorsReview_RelationalOperators {

    public static void main(String[] args) {
        /*
        *
        * 3<5 true
        *
        * 5>6  false
        *
        * 3==3   true
        * 3==(6-3)  true
        *
        * 18<15   false
        *
        * 3 >=3   true
        * */

        //  I have square hole  and one dimention of the hole
        //is 10 cms
        // and I have square shape its one dimention 9 cms
        // the question is
        //if the shape fits to the hole or not?
        boolean canFit=false;
       int dimentionOfTheHole=8;
       int dimentionOfTheShape=9;

       //  dimentionOftheShape<=dimentionOfTheHole
        // if this condition works then shape fits the hole
        canFit=dimentionOfTheShape<=dimentionOfTheHole;
        System.out.println("canFit = " + canFit);

        // I bought a refgirator height= 6 ft, width= 1.5 ft,
        // entrance of the house door size is this
        // height= 6.5 ft width= 1.49 ft

        // the question is does the ref. fits to my door?

        double housedoorheight=6.5;
        double housedoorwidth=1.49;
        double refheight=6.55;
        double refwidth=1.49;
        //first compare heights
        //then compare widths
        boolean heightFit=false;
        boolean widthFit=false;
        heightFit=refheight<=housedoorheight;
        widthFit=refwidth<=housedoorwidth;
        System.out.println("heightFit = " + heightFit);
        System.out.println("widthFit = " + widthFit);
        boolean refFits=heightFit&&widthFit;
        // you have two conditions
        // and both of them should be true to have success
        System.out.println("refFits = " + refFits);

        //below 3 years old or below 110 cms eat free.

        int babyAge=3;
        int freeEatingAge=3;
        boolean ageFits=babyAge<=freeEatingAge;

        double babyHeight=90;
        double freeEatingHeight=110;
        boolean heightFits=babyHeight<=freeEatingHeight;
        //if either of the condition is ok then baby eats free.
        // since we say if either of them is ok, then we need to use
        // or operation
                 boolean freeEntrance= ageFits||heightFits;
        System.out.println("freeEntrance = " + freeEntrance);

    }

}
