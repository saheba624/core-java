package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("ram");
		a.add("shayam");
		a.add("Zameer");
		a.add("saheba");
		
	List l = new ArrayList();
	l.addAll(a);
	
System.out.println(a.get(0));
	System.out.println(l.get(2) + "  add all");
	

	HashMap m = new HashMap();
	m.put(1,"one");
	m.put(2,"two");
	m.put(3,"three");
	m.put(4,"four");
	m.put(5,"five");
	System.out.println(m.size());
	System.out.println(m.get(1) + " Map Result");
	System.out.println(m.remove(1));
	
	
	
	
	
	
}}
	
