package iOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteAFile {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("D:/File.txt");
		PrintWriter pw = new PrintWriter(writer);
		
		//pw.write("Hello I am Saheba ansari");
		//pw.write("Hello i am Zameer");
		
		  for (int i = 0; i < 5; i++) { pw.println(i+"Line");
		  
		  }
		 
		
		pw.close();
		writer.close();
		
		System.out.println("File is Successfully Written");

	}

}
