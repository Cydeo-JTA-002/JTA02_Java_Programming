package Day17_CustomMethodsContinue;

public class AgeCalculation {
    public static void main(String[] args) {
        int ageOfStudent1=getAge(2010);   //birthyear of student 1 is 2010
        int ageOfStudent2=getAge(2009);   //birthyear of student 1 is 2009
        int ageOfStudent3=getAge(2011);   //birthyear of student 1 is 2009
        System.out.println("ageOfStudent1 = " + ageOfStudent1);
        System.out.println("ageOfStudent2 = " + ageOfStudent2);
        System.out.println("ageOfStudent3 = " + ageOfStudent3);

        int birthYearOfStudent4=2008;

        int ageOfStudent4=getAge(birthYearOfStudent4);

        System.out.println(getAge(2013));

    }
    /*
    * Create a return method
    * that accepts birthYear as an integer and returns your age as an integer
    * give the methodname getAge()
    * */

    public static int getAge(int birthYear){
        int age=2024-birthYear;

    return age;
    }
    public static void getAgeVoid(int birthYear){
        int age=2024-birthYear;

    }


}
