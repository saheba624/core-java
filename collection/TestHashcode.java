package collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestHashcode {
public static void main(String[] args) {
	Vector v = new Vector();
	Enumeration e=v.elements();
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
}
}
