package iOStream;

import java.io.File;
import java.util.Date;

public class Atrib {
	public static void main(String[] args) {
		File f = new File("D:\\File.txt");
		if (f.exists()) {
			System.out.println("name----- " + f.getName());
			System.out.println("Absolute path--- " + f.getAbsolutePath());
			System.out.println("CanWrite------" + f.canWrite());
			System.out.println("CAnRead------" + f.canRead());
			System.out.println("Is File-----" + f.isFile());
			System.out.println("Directory-------" + f.isDirectory());
			System.out.println("Date-----" + new Date(f.lastModified()));
			System.out.println("Length------" + f.length());
			System.out.println("ListFile-------" + f.listFiles());
			System.out.println("Rename-------" + f.renameTo(f));
			System.out.println("List------"+ f.list());
			System.out.println("Mkdir------" + f.mkdir());
			System.out.println("Exists-------" + f.exists());
			
		}
	}

}
