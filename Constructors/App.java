package Constructors;

public class App {
    public static void main(String[] args) {

        Animal myDemoAnimal = new Animal("Leo", 400, "Li01");

        System.out.println(myDemoAnimal.getAniName() + " weighs "  + myDemoAnimal.aniWeight
                + "lbs" + " and his ID is " + myDemoAnimal.aniID);
        System.out.println();

        Animal practiceAnimal = new Animal("George");
        System.out.println(practiceAnimal.getAniName());

    }
}
