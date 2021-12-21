package com.string;

public class capacity {
	public static void main(String[] args) {
	
		//Capacity of String
		StringBuffer sb = new StringBuffer();
		System.out.println("default capacity: " + sb.capacity());    
	
		
		//Length of blank string
		String s="";
		System.out.println(s.length());
		
		//memory check
		String name ="saheba ansari";
		String name1 = "Zameer ahamad ansari";
		System.out.println(name.length());
		System.out.println(name1.length());
		
		
	}
}


