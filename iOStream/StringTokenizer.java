package iOStream;

public class StringTokenizer {
	public static void main(String[] args) {
		String str = "Vijay,Dinanath,Chouhan";
		java.util.StringTokenizer sc = new java.util.StringTokenizer(str,",");
		String t = null;
		while (sc.hasMoreElements()) {
		t=sc.nextToken();
		System.out.println(t);
		
	}

}
}
