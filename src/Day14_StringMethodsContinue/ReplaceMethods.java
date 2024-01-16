package Day14_StringMethodsContinue;

public class ReplaceMethods {
    public static void main(String[] args) {

        String str1 = " I Love Java Programming, Java is easy, Java is common";

        System.out.println(str1);

        String str2 = str1.replace("Java", "Phyton");

        System.out.println(str2);

        String str3 = str1.replace(" ", "*");

        System.out.println(str3);

        String str5 = str1.replaceFirst("Java", "Javascript");
        System.out.println(str5);

        System.out.println(str1);

        str1 = str1.replace(" ", "-");

        System.out.println(str1);

    }
}
