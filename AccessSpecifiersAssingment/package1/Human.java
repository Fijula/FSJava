package package1;
public class Human{
        public void AccessWithDot(){
        Animal animal = new Animal(); 
        animal.name = "Tiger-2"; 
        // animal.age = 5; //private member not allowed to access
        animal.gender = "Male"; 
        animal.id = 10; 
        
        System.out.println("Human class AccesswithDot :");
        System.out.println("Name :" + animal.name);
        // System.out.println("Age :" + animal.age);    //private member not allowed to access
        System.out.println("Gender :" + animal.gender);
        System.out.println("ID :" + animal.id);
    }
    public void AccessWithoutDot(){
       // name = "Lion -2"; //not allowed to access - differnt class
        // age =8;  //not allowed to access - differnt class
        // gender="Female";// not allowed to access - differnt class
        // id=20;  //not allowed to access - differnt class
        
        System.out.println("Human class AccesswithoutDot :");
        System.out.println("Not allowed to access");
        // System.out.println("Name: "+name); //not allowed to access - differnt class
        // System.out.println("Age :" + age);  //private member not allowed to access
        // System.out.println("Gender :" + gender); //not allowed to access - differnt class 
        // System.out.println("ID :" + id);       //not allowed to access - differnt class
}
}
