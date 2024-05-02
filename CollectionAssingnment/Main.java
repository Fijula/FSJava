package CollectionAssingnment;

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

		// Solution 6(a):
		String name = "Suraj";
		System.out.println("Check if : " + name + " exist in employee list using String Compare");
		System.out.println(EmployeeWithClass.searchNameStringCompare(name));

		// Solution 6(b):
		Employee empSearch = new Employee("T1", "Suraj", 97);
		System.out.println("Check if : "+empSearch.getName() + " exist in employee list using Object Compare");
		System.out.println(EmployeeWithClass.searchNameObjectCompare(empSearch));

	}

}
