package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class OrderBysalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary>o2.salary) {
			return -1;
			
		}
		else if(o1.salary==o2.salary) {
			return 0;
			
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		
	}
	
	

}
