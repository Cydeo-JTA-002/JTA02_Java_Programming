package Day22_ClassObject;

public class Avatar {

    String name;
    String hairColor;
    int food;
    double health;
    int weapon;
    boolean hasArmour;


    public void walk(){
        System.out.println(name + " is walking around peacefully with " + hairColor + " hairs" );
    }
    public void eat(){
        System.out.println(name + " is eating smth");
        food--;
        health++;

    }

    public void fight(){
        System.out.println(name + " is fighting with a monster");

    }
    public void runAway(){
        System.out.println(name + " is escaping from smth");

    }


}
