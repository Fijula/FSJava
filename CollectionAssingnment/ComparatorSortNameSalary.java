package CollectionAssingnment;
import java.util.*;
public class ComparatorSortNameSalary implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2)
	{
		int compareName = e2.getName().compareTo(e1.getName());
		if( compareName != 0) return compareName;
		else
			return e1.getSalary()-e2.getSalary();
		
	}
	

}
