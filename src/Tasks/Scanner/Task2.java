package Tasks.Scanner;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // 1. create a scanner object
        Scanner scan=new Scanner(System.in);

        System.out.println("street number");

        //if you use scan.next() method and in the next line
        // if you use scan.nextLine()  this method will not run.

        //to solve this issue you need to put scan.nextline() between these 2 methods



        // get the integer data
        String nInt=scan.next();
         scan.nextLine();
        System.out.println("building name");

        String buildingName=scan.nextLine();


        System.out.println(buildingName+nInt);
    }
}
