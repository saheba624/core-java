package iOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws IOException {
		FileOutputStream stream = new FileOutputStream("D:/File.txt");
		
		ObjectOutputStream out =new ObjectOutputStream(stream);
		Employee e = new Employee(2,"Saheba","Ansari");
		out.writeObject(e);
		out.close();
		System.out.println("Object is successfully");
		
		
	}

}
