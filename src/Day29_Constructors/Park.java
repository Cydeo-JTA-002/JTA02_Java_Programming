package Day29_Constructors;

public class Park {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "max";
        dog1.breed = "terrier";
        dog1.age = 2;
        dog1.color = "brown";
        System.out.println("++++++++++++++++++++++++++++++++");

        Dog dog2 = new Dog("fury");

        System.out.println(dog2.name);

        System.out.println("===========================");

        Dog dog3 = new Dog("Charlie", 4);
        dog3.color = "white";

        System.out.println(dog3.age);
        System.out.println(dog3.name);
        System.out.println(dog3.color);

        //System.out.println(dog2.age);
        System.out.println("====================================");

        Dog dog4 = new Dog("Rocky", "Pitbull", 5, "black");

        System.out.println(dog4.name);
        System.out.println(dog4.age);
        System.out.println(dog4.color);
        System.out.println(dog4.breed);

        System.out.println("================================================");
        System.out.println(dog4.toString());
        System.out.println("===================================");

        Dog dog5 = new Dog("Leo", "Golden",2,"blonde");

        System.out.println(dog5.toString());



    }
}
