package CompanyService;
public class Organization
{
    // int NoOfEmployees;
    // Employee[] employees;
    // Organization(Employee [] employees){
    //     this.employees= employees;
    //     this.NoOfEmployees = employees.length;

    // }
    private Employee[] employees;

    public Organization() {
        initializeEmployees();
    }

    private void initializeEmployees() {
        employees = new Employee[] {
            new Employee("Arun", 25, 50000, true, 1),
            new Employee("Seema", 28, 55000, true, 2),
            new Employee("Rave", 30, 200000, true, 3),
            new Employee("Anu", 29, 700000, true, 4),
            new Employee("Shan", 31, 690000, true, 5)
        };
    }
    
    public Employee[] getEmployees() {
        return employees;
    }
    public void printEmployeeDetailsAll(){
        System.out.println("Employee Details are : ");
        for (Employee employee : employees) {
            System.out.println("Name : " + employee.name + " Employee id: " + employee.empid + " Employee age : " + employee.age);
        }

    }
    public static void main(String[] args) {
  
    //    Employee [] employees =new  Employee[5];
    //    employees[0]=new Employee("Arun", 25, 50000, true,1) ;
    //    employees[1]= new Employee("Seema", 28, 55000, true,2);
    //    employees[2]= new Employee("Rave",30,200000,true,3);
    //    employees [3]= new Employee("Anu", 29, 700000, true,4);
    //    employees [4]= new Employee("Shan",31,690000,true,5);
    //    Organization PodTest = new Organization(employees);

    Organization PodTest = new Organization();
       PodTest.printEmployeeDetailsAll();


    }
}