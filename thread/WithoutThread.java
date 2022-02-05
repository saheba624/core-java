package thread;

public class WithoutThread {
private String name=null;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void run() {
	for (int i = 0; i < 5; i++) {
		System.out.println(i+"hello " + name);
		
	}
		
	}
}

