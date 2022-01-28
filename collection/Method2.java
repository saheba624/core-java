package collection;

import java.util.HashMap;
import java.util.Map;

public class Method2 {
		public static void main(String[] args) {
		Map p = new HashMap();
		p.put("a","one");
		p.put("b","two");
		p.put("c","three");
		p.put("d","four");
		p.replace("k","one","hello");
		System.out.println(p.get("b") +"------hashmap------");
		System.out.println(p.entrySet());
		System.out.println(p.containsKey("b"));
		System.out.println(p.containsValue(5));
		System.out.println(p.isEmpty());
		System.out.println(p.keySet());
		System.out.println(p.remove("d"));
		System.out.println(p.size());
		System.out.println(p.values());
	

}}
