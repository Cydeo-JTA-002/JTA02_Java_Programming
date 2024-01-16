package Day12_ScannerCont;

import java.util.Scanner;

public class ScannerKnowledgeContest {
    public static void main(String[] args) {
     //1.step create a scanner object
        Scanner scan=new Scanner(System.in);
//2. Make an explanation of the game
        System.out.println("Welcome to the Knowledge Contest!");
        System.out.println("If you want to continue type true otherwise type false");
//3. get a boolean answer as either true or false to accept the contest
// and save it in a boolean variable called toCompete
        boolean toCompete=scan.nextBoolean();
//4. we will continue rest of the code if toCompete is true and
// we will stop if toCompete is false
        if(toCompete==true){
           //CONTEST WILL BE HERE
//5. Lets create a counter variable which will count the correct answers
            int counter=0;
//--Question1-------------------------
//6. ask the first question
            System.out.println("Question1_: A car travels 120 km in 2 hours. What is the average speed in kilometers per hour?");
// 7. save the real answer of the question
            int answer1=60;
// 8. get the answer from the user
            int answer1input=scan.nextInt();
            if(answer1input==answer1){
                counter++;  // will increase the counter by 1
                System.out.println("Correct!!!! \n Next Question!");
            }

//--Question2-------------------------
//9. ask the second question
// 10. save the real answer of the question
// 11. get the answer from the user
//--Question3-------------------------
//12. ask the third question
// 13. save the real answer of the question
// 14. get the answer from the user
//--Question4-------------------------
//15. ask the forth question
// 16. save the real answer of the question
// 17. get the answer from the user
//--Question5-------------------------
//18. ask the fifth question
// 19. save the real answer of the question
// 20. get the answer from the user
// if the number of correct answers is greater than 0, say "Good Job!"
        }else{
            System.out.println("No worries, you can try again later!");
        }
    }
}
