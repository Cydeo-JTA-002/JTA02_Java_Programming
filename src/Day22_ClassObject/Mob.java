package Day22_ClassObject;

public class Mob {

    String name;
    String color;
    int strength;

    boolean canThrowSmth;

    public void attack(){
        System.out.println(name + " is attacking, fight or die");

    }

    public void approach(){
        System.out.println(name + " is approaching, run away");
    }

    public void kill(){
        System.out.println(name + " killed the player");

    }

    public void goAway(){
        System.out.println(name + " is going away, didn't see you");

    }

}
