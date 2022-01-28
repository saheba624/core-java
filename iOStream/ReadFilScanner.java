package iOStream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFilScanner {
public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("D:\\file.txt");
		Scanner sc=new Scanner(fr);
		
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		fr.close();
	}

}
