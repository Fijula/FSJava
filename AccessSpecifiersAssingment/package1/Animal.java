package package1;

import package2.Food;
import package2.Lion;

public class Animal {
    public String name;
    private int age;
    protected String gender;
    int id;

    public void AccessWithDot() {
        Animal animal = new Animal();
        animal.name = "Tiger";
        animal.age = 5;
        animal.gender = "Male";
        animal.id = 10;

        System.out.println("Animal class AccesswithDot :");
        System.out.println("Name :" + animal.name);
        System.out.println("Age :" + animal.age);
        System.out.println("Gender :" + animal.gender);
        System.out.println("ID :" + animal.id);
    }

    public void AccessWithoutDot() {
        name = "Lion";
        age = 8;
        gender = "Female";
        id = 20;

        System.out.println("Animal class AccesswithoutDot :");
        System.out.println("Name: " + name);
        System.out.println("Age :" + age);
        System.out.println("Gender :" + gender);
        System.out.println("ID :" + id);
    }

    public static void main(String[] args) {
        // Create an Animal object and call its methods
        Animal animal = new Animal();
        animal.AccessWithDot();
        animal.AccessWithoutDot();
        System.out.println("---------------------------------------------------");
        // Create a Dog object and call its methods
        Dog dog = new Dog();
        dog.AccessWithDot();
        dog.AccessWithoutDot();
        System.out.println("---------------------------------------------------");
        // Create a Human object and call its methods
        Human human = new Human();
        human.AccessWithDot();
        human.AccessWithoutDot();
        System.out.println("---------------------------------------------------");
        // Create a Food object and call its methods
        Food food = new Food();
        food.AccessWithDot();
        food.AccessWithoutDot();
        System.out.println("---------------------------------------------------");
        // Create a Lion object and call its methods
        Lion lion= new Lion();
        lion.AccessWithDot();
        lion.AccessWithoutDot();
    }
}
