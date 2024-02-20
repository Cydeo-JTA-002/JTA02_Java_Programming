package Day26_ArrayList_Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        System.out.println("----------Array--------------");

        String[] items = new String[5];
        items[0] = "Banana";
        items[1] = "Milk";
        items[2] = "Eggs";
        items[3] = "Chicken";
        items[4] = "Water";



        System.out.println(Arrays.toString(items));

        System.out.println("size of my array= " + items.length);

        System.out.println("----------ArrayList--------------");

        ArrayList<String> groceryList = new ArrayList<>();

        System.out.println(groceryList);

        groceryList.add("Apple");
        groceryList.add("Banana");
        groceryList.add("Milk");
        System.out.println(groceryList);
        groceryList.add("Eggs");
        System.out.println(groceryList);

        System.out.println("size of my arrayList= " + groceryList.size());


        ArrayList<Integer> mathScores = new ArrayList<>();

        mathScores.add(70);
        mathScores.add(80);
        mathScores.add(100);
        System.out.println(mathScores);


        ArrayList<Double> priceList = new ArrayList<>( Arrays.asList(3.99,7.99,0.99,10.0,100.5) );

        System.out.println(priceList);
        System.out.println("priceList.size() = " + priceList.size());
        priceList.add(8.99);
        priceList.add(3.99);
        System.out.println(priceList);
        System.out.println("priceList.size() = " + priceList.size());


    }
}
