package Day28_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String score= "75";

        String newScore = score + 10; // 7510

        System.out.println(newScore);

        int finalScore = Integer.parseInt(score)+10;

        System.out.println(finalScore);

        // price was $ "40.99"
        double price = Double.parseDouble("40.99") + 20;

        System.out.println(price);

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        double max = Double.MAX_VALUE;
        System.out.println(max);

        System.out.println("===============================");

        String str = "Dav123id $%^&^& 567CydEo45*";

        for (int i = 0; i < str.length() - 1; i++) {
            // System.out.print(str.charAt(i)+ " ");
            if ( ! Character.isLetterOrDigit(str.charAt(i))){
                System.out.print(str.charAt(i) +" ");

            }

        }




    }
}
