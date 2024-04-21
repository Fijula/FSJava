public class Organization
{
    int NoOfEmployees;
     Employee[] employees;

    public Organization(int NoOfEmployees) {
        this.NoOfEmployees = NoOfEmployees;
        employees = new Employee[ NoOfEmployees ];
    }
    public void printEmployeeDetailsAll(){
        System.out.println("Employee Details are : ");
        for (Employee employee : employees) {
            employee.getDetails();
        }

    }
}
