package package2;
import package1.Animal;
public class Lion extends Animal{
    public void AccessWithDot(){
        Animal animal = new Animal(); 
        animal.name = "Tiger-4"; 
        // animal.age = 5; //private member not allowed to access
        // animal.gender = "Male";  //protected member not allowed
        // animal.id = 10;  private memeber not allowed

        System.out.println("Lion  class AccesswithDot :");
        System.out.println("Name :" + animal.name);
        // System.out.println("Age :" + animal.age);    //private member not allowed to access
        // System.out.println("Gender :" + animal.gender);  //not allowed
        // System.out.println("ID :" + animal.id); // not allowed
    }
    public void AccessWithoutDot(){
        name = "Lion -4";
        // age =8;  //private member not allowed to access
        gender="Female";  //protected memeber not allowed
        // id=20;  //default member not allwed
        
        System.out.println("Lion class AccesswithoutDot :");
        System.out.println("Name: "+name);
        // System.out.println("Age :" + age);  //private member not allowed to access
        System.out.println("Gender :" + gender);  //not allowed
        // System.out.println("ID :" + id);       //not allowed
}
}
