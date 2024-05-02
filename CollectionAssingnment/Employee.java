package CollectionAssingnment;

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
	@Override
    public boolean equals(Object obj) {
        Employee other = (Employee) obj;
        return Empid.equals(other.Empid) && Name.equals(other.Name) && Salary == other.Salary;
    }

}
