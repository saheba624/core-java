package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Readall {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("ram");
		a.add("shayam");
		a.add("Zameer");
		a.add("saheba");
		
		Iterator it=a.iterator();
		
		while(it.hasNext()){
			Object o= (Object) it.next();
			System.out.println(o + " =//Iterator");
			
		}
		
	}

}
