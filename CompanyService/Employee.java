package CompanyService;
public class Employee{
    String name;
    int age;
    float salaryMonthly;
    int empid;
    boolean isActive;
    Employee(String name,int age,float salaryMonthly,boolean isActive,int empid)
    {
        this.name=name;
        this.age=age;
        this.salaryMonthly=salaryMonthly;
        this.isActive=isActive;
        this.empid = empid; 

    }
    void getDetails(){
     System.out.println("Name: "+name);
     System.out.println("Age : "+age);
     System.out.println("Employee Id : "+empid);       
    }
    double getTaxAmountToBePaid(){
        double TaxAmount=0;
        if(salaryMonthly >100000)
        {
            TaxAmount=salaryMonthly*0.20;
            System.out.println("Tax Amount : "+TaxAmount);
        }
        else
        System.out.println("No Tax to be Paid ");
       return TaxAmount;
        }
 
    public static void main(String[] args) {
      Employee emp1= new Employee("Shan", 31, 690000, true, 5);
      emp1.getDetails();
      emp1.getTaxAmountToBePaid();
      Employee emp2=new Employee("Arun", 25, 50000, true, 1);
      emp2.getDetails();
      emp2.getTaxAmountToBePaid();
    }
}