package iOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextTranfer {
	public static void main(String[] args) throws IOException {
		String source = "D:\\File.txt";
		String target = "D:\\Write.txt";

		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);

		int ch = reader.read();
		while (ch != -1) {
			writer.write(ch);
			ch = reader.read();
		}

		writer.close();
		reader.close();
		System.out.println(source + " is copied to " + target);

	}

}
