package iOStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadPrimitiveFile {
	public static void main(String[] args) throws IOException {
		long dataposition = 0;
int data=0;
RandomAccessFile raf=new RandomAccessFile("D:\\datafile.dat","r");
dataposition=raf.readLong();
System.out.println("Dataposition:" + dataposition);
raf.seek(dataposition);
data=raf.readInt();
raf.close();
System.out.println("data is " + data);

	}

}
