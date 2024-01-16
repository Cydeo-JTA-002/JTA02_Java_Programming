package Day14_StringMethodsContinue;

public class StringMethodsPractice1 {
    public static void main(String[] args) {

        String str1= "I love";                                // with literal

        String str2 = new String(" Java Programming");  // new key word


        String str3 = str1.concat(str2);

        String str4= str1 + 55;

        System.out.println(str3);
        System.out.println(str4);

        System.out.println("*********************************");

        String myString ="   Hi I     am       David   .    ";
        System.out.println(myString.length());


        System.out.println(myString);
        System.out.println(myString.trim());

        System.out.println(myString);

        String myString2= myString.trim();  // I am creating a new string which is trimmed version of myString
                                            // and assign it to myString2
        System.out.println(myString2);


        System.out.println("------------------------------");

        String stringEmpty = "";
        System.out.println(stringEmpty.length());
        System.out.println(stringEmpty);
        System.out.println(stringEmpty.isEmpty());
        System.out.println(stringEmpty.isBlank());

        System.out.println("---------------------");
        String stringBlank ="    ";
        System.out.println(stringBlank.length());
        System.out.println(stringBlank);
        System.out.println(stringBlank.isEmpty());
        System.out.println(stringBlank.isBlank());

    }
}
