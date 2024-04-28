package Java_Collections_Assingment;

import java.util.Comparator;

public class ComparatorSortSalary implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e2.getSalary() - e1.getSalary();
	}

}
