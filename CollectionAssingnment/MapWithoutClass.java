package CollectionAssingnment;
import java.util.HashMap;

public class MapWithoutClass {
	public void EmployeeMapWithoutClass() {
		HashMap<String, Object[]> EmployeeList1 = new HashMap<>();
		EmployeeList1.put("T1", new Object[] { "T1", "Suraj", 97 });
		EmployeeList1.put("T2", new Object[] { "T2", "Zen", 103 });
		EmployeeList1.put("T3", new Object[] { "T3", "Derrick", 72 });
		EmployeeList1.put("T4", new Object[] { "T4", "Piyush", 108 });
		EmployeeList1.put("T15", new Object[] { "T5", "Zen", 54 });
		//Print values
		for (Object obj[] : EmployeeList1.values())
			System.out.println(obj[0] + " | " + obj[1] + "  | " + obj[2]);
	}

}
