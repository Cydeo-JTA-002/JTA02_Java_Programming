package Day25_ArraysPart2;

import java.util.Arrays;

public class StringMethodsWithArray {
    public static void main(String[] args) {

      String email = "david-jacobs@gmail-com";
// Split

        System.out.println(Arrays.toString(email.split("@")));
        System.out.println(Arrays.toString(email.split("-")));

       // toCharArray
        System.out.println(Arrays.toString(email.toCharArray()));
      

    }
}
