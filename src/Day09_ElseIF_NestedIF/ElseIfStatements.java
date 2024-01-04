package Day09_ElseIF_NestedIF;

public class ElseIfStatements {
    public static void main(String[] args) {

        // assume that we are hungry
        // we need to eat smth to get energy

        int steak = 0;
        int chicken = 0;
        int apple = 0;
        int bread = 0;


//        if (steak>0){
//            System.out.println("Eat STEAK");
//        }else{
//            System.out.println("Find smth else to eat");
//        }
//
//        if (chicken>0){
//
//            System.out.println("Eat Chicken and get energy");
//        }else{
//            System.out.println("Find smth else to eat");
//        }
//
//        if(apple>0){
//
//            System.out.println("Eat Apple and get energy");
//        }else{
//            System.out.println("Find smth else to eat");
//        }


        if (steak>0){
            System.out.println("Eat Steak");
        }else if (chicken>0){
            System.out.println("Eat Chicken");
        }else if(apple>0){
            System.out.println("Eat Apple");
        }else if (bread>0){
            System.out.println("Eat Bread");
        }else{
            System.out.println("Go and find smth to EAT, you can die soon");
        }





    }
}
