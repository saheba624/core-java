package iOStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WritetoPrint {
	public static void main(String[] args) throws IOException {
		String target = "D:/File.txt";
		FileWriter writer = new FileWriter(target,true);
		
		PrintWriter pw = new PrintWriter(writer);
		
		InputStreamReader isreader=new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isreader);
		
		String line = in.readLine();
		while(!line.equals("quit")) {
			pw.println(line);
			line=in.readLine();
			
		}
		
		pw.close();
		isreader.close();
		System.out.println("Data is saved Sucssecfully");
		
	}

}
