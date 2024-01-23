package Day17_CustomMethodsContinue;

public class AverageScoreClass {
    public static void main(String[] args) {
// Lets use this getAverageScore() method in 2 students data
        // student1 scores 56, 67, 75, 77
        // student2  scores 67, 77, 75, 87

        double averageScoreOfStudent1=getAverageScore(56,67,75,77);
        double averageScoreOfStudent2=getAverageScore(67,77,75,87);
        System.out.println("averageScoreOfStudent1 = " + averageScoreOfStudent1);
        System.out.println("averageScoreOfStudent2 = " + averageScoreOfStudent2);

    }
    /*
    *
    * Create a method naming getAverageScore()
    * as a returm method returning double
    * acceoting 4  double scores naming score1 score2 score3 and score4
    *
    * */

    public static double getAverageScore(double score1, double score2,double score3, double score4 ){
       double averageScore=(score1+score2+score3+score4)/4;

      return averageScore;
    }




}
