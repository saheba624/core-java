package collection;

import java.util.Comparator;

public class OrderbyName implements Comparator<Marksheet>{

		@Override
		public int compare(Marksheet m1, Marksheet m2) {
			return m1.getName().compareTo(m2.getName());
		}

	}


