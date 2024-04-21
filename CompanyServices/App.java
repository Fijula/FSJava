public class App {

    public static void main(String[] args) {

        Organization PodTest = new Organization(5);
        PodTest.employees = new Employee[] {
                new Employee("Arun", 25, 50000, true, 1),
                new Employee("Seema", 28, 55000, true, 2),
                new Employee("Ravi", 30, 200000, true, 3),
                new Employee("Anu", 29, 700000, true, 4),
                new Employee("Shan", 31, 690000, true, 5)
        };

        // Print employee details
        System.out.println("Employee Details:");
        PodTest.printEmployeeDetailsAll();

        // Create an Admin object
        Admin admin = new Admin("Rohan");

        // Calculate and print total required budget
        double totalReqBudget = admin.getTotalReqdBudget(PodTest);
        System.out.println("Total Required Budget: " + totalReqBudget);

        // Calculate and print total tax collected
        double totalTaxCollected = admin.getTotalTaxCollected(PodTest);
        System.out.println("Total Tax Collected: " + totalTaxCollected);

        // Print tax amount per employee
        System.out.println("\nTax Amount Per Employee:");
        admin.printTaxAmountPerEmployee(PodTest);

        // Make an Employee Inactive
        PodTest.employees[3].isActive = false;
        // Print employee details after inactive status change
        System.out.println("Employee Details after one employee Inactive:");
        PodTest.printEmployeeDetailsAll();

        // Calculate and print total required budget
        double totalReqBudget1 = admin.getTotalReqdBudget(PodTest);
        System.out.println("Total Required Budget after one employee Inactive: " + totalReqBudget1);

        // Calculate and print total tax collected
        double totalTaxCollected1 = admin.getTotalTaxCollected(PodTest);
        System.out.println("Total Tax Collected after one employee Inactive: " + totalTaxCollected1);

        // Print tax amount per employee
        System.out.println("\nTax Amount Per Employee:");
        admin.printTaxAmountPerEmployee(PodTest);

    }
}