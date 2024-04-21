package package2;
import package1.Animal;
public class Food{
        public void AccessWithDot(){
        Animal animal = new Animal(); 
        animal.name = "Tiger-3"; 
        // animal.age = 5; //private member not allowed to access
        // animal.gender = "Male";  //protected memeber not allowed
        // animal.id = 10;  //default memeber not allowed
        
        System.out.println("Food  class AccesswithDot :");
        System.out.println("Name :" + animal.name);
        // System.out.println("Age :" + animal.age);    //private member not allowed to access
        // System.out.println("Gender :" + animal.gender);  not allowed
        // System.out.println("ID :" + animal.id); //not allowed
    }
    public void AccessWithoutDot(){
       // name = "Lion -3"; //not allowed to access - differnt class
        // age =8;  //not allowed to access - differnt class
        // gender="Female";// not allowed to access - differnt class
        // id=20;  //not allowed to access - differnt class
        
        System.out.println("Food class AccesswithoutDot :");
        System.out.println("Not allowed to access");
        // System.out.println("Name: "+name); //not allowed to access - differnt class
        // System.out.println("Age :" + age);  //private member not allowed to access
        // System.out.println("Gender :" + gender); //not allowed to access - differnt class 
        // System.out.println("ID :" + id);       //not allowed to access - differnt class
}
}

