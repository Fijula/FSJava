package CollectionAssingnment;

import java.util.Collections;
import java.util.*;

public class MapWithClass {
	HashMap<String, Employee> EmployeeList2 = new HashMap<>();

	public void EmployeeMapWithClass() {
		// HashMap<String,Employee> EmployeeList2= new HashMap<>();
		Employee emp1 = new Employee("T1", "Suraj", 97);
		Employee emp2 = new Employee("T2", "Zen", 103);
		Employee emp3 = new Employee("T3", "Derrick", 72);
		Employee emp4 = new Employee("T4", "Piyush", 108);
		Employee emp5 = new Employee("T5", "Zen", 54);

		EmployeeList2.put(emp1.getId(), emp1);
		EmployeeList2.put(emp2.getId(), emp2);
		EmployeeList2.put(emp3.getId(), emp3);
		EmployeeList2.put(emp4.getId(), emp4);
		EmployeeList2.put(emp5.getId(), emp5);
		// Print Values
		for (Employee emp : EmployeeList2.values())
		printEmployee(emp);

	}

	public void sortNameAscending() {
		List<Employee> EmployeeSort = new ArrayList<>(EmployeeList2.values());
		Collections.sort(EmployeeSort, new ComparatorSortName());
		for (Employee emp : EmployeeSort) {
			printEmployee(emp);
		}

	}

	public void sorSalaryDescending() {
		List<Employee> EmployeeSort = new ArrayList<>(EmployeeList2.values());
		Collections.sort(EmployeeSort, new ComparatorSortSalary());

		for (Employee emp : EmployeeSort) {
			printEmployee(emp);
		}
	}

	public void sortNameDescSalryAsc() {
		List<Employee> EmployeeSort = new ArrayList<>(EmployeeList2.values());
		Collections.sort(EmployeeSort, new ComparatorSortNameSalary());

		for (Employee emp : EmployeeSort) {
			printEmployee(emp);
		}

	}

	public boolean searchNameStringCompare(String name) {
		Iterator<Employee> it = EmployeeList2.values().iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public boolean searchNameObjectCompare(Employee searchEmp) {

		Iterator<Employee> it = EmployeeList2.values().iterator();
		while (it.hasNext()) {
			Employee emp = it.next();

			// Method1: Compare each field :
			// if (emp.getName().equals(searchEmp.getName()) && emp.getSalary() ==
			// searchEmp.getSalary() && emp.getId()==searchEmp.getId())
			// return true;

			// Method 2: Override Equals method:
			if (emp.equals(searchEmp))
				return true;
		}
		return false;
	}

	public void printEmployee(Employee emp) {
		System.out.println(emp.getId() + " | " + emp.getName() + " | " + emp.getSalary());
	}

}
