package collection;

public class ComparableEx implements Comparable<ComparableEx>{
	public String name;
	public String rollno;
	public int marks;
	
	public ComparableEx(String r,String n, int m) {
		this.marks=m;
		this.name=n;
		this.rollno=r;
		
	}

	@Override
	public int compareTo(ComparableEx o) {
		return rollno.compareTo(o.rollno);
	}
	
	public String toString() {
		return rollno+","+name+","+marks;
		
	}
	
	

}
