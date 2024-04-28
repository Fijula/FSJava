package Java_Collections_Assingment;

public class Employee {
	String Empid;
	String Name;
	int Salary;

	public Employee(String Empid, String Name, int Salary) {
		this.Empid = Empid;
		this.Name = Name;
		this.Salary = Salary;
	}

	public String getId() {
		return Empid;
	}

	public String getName() {
		return Name;
	}

	public int getSalary() {
		return Salary;
	}

}
