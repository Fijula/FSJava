package package1;
public class Dog extends Animal{
    public void AccessWithDot(){
        Animal animal = new Animal(); 
        animal.name = "Tiger-1"; 
        // animal.age = 5; 
        animal.gender = "Male"; 
        animal.id = 10; 
        
        System.out.println("Dog class AccesswithDot :");
        System.out.println("Name :" + animal.name);
        // System.out.println("Age :" + animal.age);
        System.out.println("Gender :" + animal.gender);
        System.out.println("ID :" + animal.id);
    }
    public void AccessWithoutDot(){
        name = "Lion -1";
        // age =8;
        gender="Female";
        id=20; 
        
        System.out.println("Dog class AccesswithoutDot :");
        System.out.println("Name: "+name);
        // System.out.println("Age :" + age);  
        System.out.println("Gender :" + gender);  
        System.out.println("ID :" + id);       
}
}
