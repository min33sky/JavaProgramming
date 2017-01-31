package fileInputOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(77);
		
		dos.close();
		fos.close();
	}
}
