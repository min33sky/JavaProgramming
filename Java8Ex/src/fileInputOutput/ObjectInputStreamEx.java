package fileInputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws IOException, Exception {
		FileInputStream fis = new FileInputStream("test");
		Date date = null;
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		date = (Date)ois.readObject();
		System.out.println(date.toString());
		
		ois.close();
		fis.close();
		
	}
}
