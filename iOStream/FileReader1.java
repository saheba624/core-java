package iOStream;
import java.io.FileReader;
public class FileReader1 {
	public static void main(String[] args) throws Exception {
	FileReader reader =  new FileReader("D:/File.txt");
	int ch = reader.read();
	char chr;
	while(ch!=-1) {
		chr=(char)ch;
		System.out.println(chr);
		ch=reader.read();
	
	}
	
		
	}

}
