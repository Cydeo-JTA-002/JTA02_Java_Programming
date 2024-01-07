package Day09_ElseIF_NestedIF;

public class NestedIf {
    public static void main(String[] args) {

        int age=15;


        if (age>0 && age<120) {

            //System.out.println("here I have my Age Program, Senior, Teenager, Bay etc.");
            if (age>60){
                System.out.println("You are Senior");
            }else if (age>20){
                System.out.println("You are Adult");
            }else if(age>13){
                System.out.println("You are Teenager");
            }else if(age > 4){
                System.out.println("You are Child");
            }else{
                System.out.println("You are a Baby");
            }


        }else{
            System.out.println("not a Valid Age, please enter a correct age! ");
        }







    }



}
