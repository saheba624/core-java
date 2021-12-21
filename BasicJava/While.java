package BasicJava;

public class While {
	public static void main(String[] args) {
		int count = 1;

		String s = "Zameer Ahamad Ansari";
		
		System.out.println("Mere nam ki length " +s.length()  +" hain");
		System.out.println(s.charAt(9));
		System.out.println(s.indexOf("Ansari"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.replace("a", "b"));
		System.out.println(s.replaceAll("a", "b"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("Z"));
		System.out.println(s.endsWith("Ahamad"));
		System.out.println(s.substring(5));

		/*
		 * while (count < 11) { System.out.println("Count is: " + count); count++; }
		 */
		

		
	}
}
