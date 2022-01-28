package collection;

import java.util.ArrayList;

public class TestComparableEx {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(new ComparableEx("r2", "ram", 90));
		l.add(new ComparableEx("r3", "Shyam", 80));
		l.add(new ComparableEx("r1", "Zakir", 100));
		
		Collection.sort(l);
		for(Object o:l) {
			System.out.println(o);
		}
		
	}

}
