package Day15_StringFinal_CustomMethods;

public class StringSubString {

    public static void main(String[] args) {

        int name=9;
        // naming conventions
        // camelCase  happyBirthdayOfJoseph
        // PascalCase  JavaIsGreat
        // snake_case

        //String substring()  method

        String sentence="I love Java Programming";
        // substring(int startingIndex)
        String subString1=sentence.substring(7);
        System.out.println(subString1);
        // substring(int startingIndex, int endingindex)
        String subString2=sentence.substring(7, 11);
        System.out.println(subString2);
    }
}
