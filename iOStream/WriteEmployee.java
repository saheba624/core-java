package iOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployee {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("d:\\Object.ser");
	ObjectOutputStream out = new ObjectOutputStream(file);
	Employee e = new Employee(1,"Saheba","Ansari");
	out.writeObject(e);
	out.close();
	System.out.println("Object is successfully Persisted");
	
	
	
}
}
