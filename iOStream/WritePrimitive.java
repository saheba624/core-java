package iOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePrimitive {
	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream("D:\\primitivedata.dat");
		DataOutputStream out  = new DataOutputStream(file);
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('a');
		out.writeDouble(1.9);
		out.close();
		file.close();
		System.out.println("Primitive data is successfully written");
		
	}

}
