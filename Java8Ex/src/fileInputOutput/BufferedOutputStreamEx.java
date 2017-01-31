package fileInputOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test");
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
		
		byte[] receive = {'S','A','N','A','\'','S'};
		bos.write(receive);
		
		bos.close();
		fos.close();
	}
}
