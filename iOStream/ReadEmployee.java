package iOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmployee {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream stream=new FileInputStream("D:\\File1\\test.ser");
		ObjectInputStream out = new ObjectInputStream(stream);
		
		Employee e =(Employee)out.readObject();
		System.out.println(e.getFname());
		System.out.println(e.getId());
		
		
	}

}
