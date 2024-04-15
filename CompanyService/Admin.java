package CompanyService;
public class Admin {
    String role;

    Admin(String role) {
        this.role = role;
    }

    // Method to calculate total required budget
    double getTotalReqdBudget(Employee[] employees) {
        double totalReqBudget = 0.0;
        for (Employee employee : employees) {
            if (employee.isActive) {
                totalReqBudget += employee.salaryMonthly;
            }
        }
        return totalReqBudget;
    }

    // Method to calculate total tax collected
    double getTotalTaxCollected(Employee[] employees) {
        double totalTaxCollected = 0.0;
        for (Employee employee : employees) {
            totalTaxCollected += employee.getTaxAmountToBePaid();
        }
        return totalTaxCollected;
    }

    // Method to print tax amount per employee
    void printTaxAmountPerEmployee(Employee[] employees) {
        System.out.println("Tax Amount Per Employee:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.name + ", Tax Amount: " + employee.getTaxAmountToBePaid());
        }
    }

    public static void main(String[] args) {
        // // Create an Organization object
        Organization PodTest = new Organization();
        // Get the employees from the Organization
        Employee[] employees = PodTest.getEmployees();
        // Create an Admin object
        Admin admin = new Admin("Rohan");
        double totalReqBudget = admin.getTotalReqdBudget(employees);
        System.out.println("Total Required Budget: " + totalReqBudget);

        double totalTaxCollected = admin.getTotalTaxCollected(employees);
        System.out.println("Total Tax Collected: " + totalTaxCollected);

        admin.printTaxAmountPerEmployee(employees);
    }
}
