package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {
	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		c.add("Ram");
		c.add("Shyam");
		c.add("Jai");
		c.add("Vijay");

		
		Iterator it = c.iterator();

		
		c.add("Ajay");

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}


