// package FSJava.CompanyService;
public class Admin {
    String role;

    Admin(String role) {
        this.role = role;
    }

    // Method to calculate total required budget
    double getTotalReqdBudget(Organization organization) {
        double totalReqBudget = 0.0;
        for (Employee employee : organization.employees) {
            if (employee.isActive) {
                totalReqBudget += employee.salaryMonthly;
            }
        }
        return totalReqBudget;
    }

    // Method to calculate total tax collected
    double getTotalTaxCollected(Organization organization) {
        double totalTaxCollected = 0.0;
        for (Employee employee : organization.employees) {
            if (employee.isActive) {
            totalTaxCollected += employee.getTaxAmountToBePaid();
        }
    }
        return totalTaxCollected;
    }

    // Method to print tax amount per employee
    void printTaxAmountPerEmployee(Organization organization){

        System.out.println("Tax Amount Per Employee:");
        for (Employee employee : organization.employees) {
            if (employee.isActive) {
            System.out.println("Name: " + employee.name + ", Tax Amount: " + employee.getTaxAmountToBePaid());
        }
    }
    }

    // public static void main(String[] args) {
    //     // // Create an Organization object
    //     Organization PodTest = new Organization();
    //     // Get the employees from the Organization
    //     Employee[] employees = PodTest.getEmployees();
    //     // Create an Admin object
    //     Admin admin = new Admin("Rohan");
    //     double totalReqBudget = admin.getTotalReqdBudget(employees);
    //     System.out.println("Total Required Budget: " + totalReqBudget);

    //     double totalTaxCollected = admin.getTotalTaxCollected(employees);
    //     System.out.println("Total Tax Collected: " + totalTaxCollected);

    //     admin.printTaxAmountPerEmployee(employees);
    // }
}
