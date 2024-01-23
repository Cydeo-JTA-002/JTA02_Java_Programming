package Day17_CustomMethodsContinue;

public class CheckUserName {
    public static void main(String[] args) {
        String username1="Joseph";
        String username2="josephsky";

        System.out.println(checkUsername(username1));
        System.out.println(checkUsername(username2));
    }

    /*
    * Create a new return method naming checkUsername()
    * accepting a String as an input and returning a boolean result telling true or false
    * */

    public static boolean  checkUsername(String username){
        String realUsername="JosephSky";
        // how to compare the username with realUsername
        // i need to use a string method to compare 2 strings
        // which is equalIgnorecase()

        boolean isUsername=realUsername.equalsIgnoreCase(username);
       return isUsername;
    }




}
