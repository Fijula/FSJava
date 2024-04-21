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
    //Get details
    void getDetails(){
     System.out.println("Name: "+name + ", Age : "+age+ ", Employee Id : "+empid+ ", Status: "+ (isActive?" Active ":"Inactive"));      
    }


    double getTaxAmountToBePaid(){
        double TaxAmount=0;
        if(salaryMonthly >100000)
        {
            TaxAmount=salaryMonthly*0.20;
            System.out.println("Tax Amount for employee "+name +" is :" +TaxAmount);
        }
        else
        System.out.println("No Tax to be Paid for Eployee "+ name);
       return TaxAmount;
        }
    public float getEmployeeSalary(){
            return salaryMonthly;
        }
}