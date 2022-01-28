package iOStream;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String fname;
	private String lname;
	private transient String tempval;
	
	public Employee() {
		
	}
	
	public Employee(int id,String fn,String ln) {
		this.fname=fn;
		this.id=id;
		this.lname=ln;
		
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getTempval() {
		return tempval;
	}

}
