package collection;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("ram");
		v.add("shayam");
		v.add("Zameer");
		v.add("saheba");

		int q = v.size();
		for (int i = 0; i < q; i++) {
			System.out.println(v.get(i));
		}
			

		
	}

	public static void sort(ArrayList l) {
		// TODO Auto-generated method stub
		
	}

}
