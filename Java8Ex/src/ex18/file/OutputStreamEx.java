package ex18.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("src/ex18/resource/result.txt");
		byte[] data = "ABCDE".getBytes();
		os.write(data, 2, 3);
		
		os.close();
	}
}
