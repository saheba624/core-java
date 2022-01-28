package iOStream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class WritePrimitiveFile {
	public static void main(String[] args) throws IOException {
		long dataposition = 0;
		RandomAccessFile in = new RandomAccessFile("D:/datafile.dat", "rw");
		in.writeLong(0);
		in.writeChar('A');
		dataposition=in.getFilePointer();
		in.writeInt(123);
		in.writeByte(1);
		in.seek(0);
		in.writeLong(dataposition);
		in.close();
		
	}

}
