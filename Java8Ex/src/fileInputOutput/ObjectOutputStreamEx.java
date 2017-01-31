package fileInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		Date date = new Date();
		
		fos = new FileOutputStream("test");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(date);
		
		oos.close();
		fos.close();
	}
}
