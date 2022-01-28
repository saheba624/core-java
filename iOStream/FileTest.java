package iOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileTest {
	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream("D:/File.txt");
		ObjectInputStream in = new ObjectInputStream(stream);
		
		System.out.println(in.readInt());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		System.out.println(in.readBoolean());
		
		in.close();
	}

}
