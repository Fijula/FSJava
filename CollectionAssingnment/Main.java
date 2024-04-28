package Java_Collections_Assingment;

public class Main {
	public static void main(String args[]) {

		// Solution 1:
		System.out.println("----------Without Class-----------");
		MapWithoutClass EmployeeWithoutClass = new MapWithoutClass();
		System.out.println("EmpId  |" + "Name | " + "Salary ");
		System.out.println("---------------------------");
		EmployeeWithoutClass.EmployeeMapWithoutClass();

		// Solution 2:
		System.out.println("---------Using Class---------");
		MapWithClass EmployeeWithClass = new MapWithClass();
		System.out.println("EmpId  |" + "Name | " + "Salary ");
		System.out.println("---------------------------");
		EmployeeWithClass.EmployeeMapWithClass();

		// Solution 3:
		System.out.println("-----Sorted Name Ascending Order----");
		System.out.println("EmpId  |  Name     |  Salary ");
		System.out.println("---------------------------");
		EmployeeWithClass.sortNameAscending();

		// Solution 4:
		System.out.println("-----Sorted Salary Descending order----");
		System.out.println("EmpId  |  Name     |  Salary ");
		System.out.println("---------------------------");
		EmployeeWithClass.sorSalaryDescending();

		// Solution 5:
		System.out.println("-----Sorted Name Desc ,Same Name Salary Asc order----");
		System.out.println("EmpId  |  Name     |  Salary ");
		System.out.println("---------------------------");
		EmployeeWithClass.sortNameDescSalryAsc();

	}

}
