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
}
