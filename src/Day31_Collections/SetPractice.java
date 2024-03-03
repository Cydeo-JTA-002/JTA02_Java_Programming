package Day31_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
// not keeping insertion order
// doesn't have index
        Set <String> mySet = new HashSet<>();

        mySet.add("Rumeysa");
        mySet.add("Lola");
        mySet.add("Ihsan");
        mySet.add("Alinur");
        mySet.add("Ali");
        mySet.add("Cemal");
        mySet.add("Alinur");
        mySet.add("Alinur");

        System.out.println(mySet);

        for ( String name    : mySet ) {

            System.out.println(name);
        }
        System.out.println(mySet.contains("Ali"));

        Set <Integer> mySet2 = new LinkedHashSet<>(Arrays.asList(3,7,1,89,77,77,3,1,1,1));

        System.out.println(mySet2);


        //Please come back at 11:35


    }



}
