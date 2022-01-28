package collection;

public class TestEqual {
private Object rollno;

public boolean equals(Object o) {
	if (o==null)
		return false;
	if(!(o instanceof Marksheet))
return false;

Marksheet other=(Marksheet)o;
return this.rollno.equals(other.getRollNo());



}
}
