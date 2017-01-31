package fileInputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test");
		BufferedInputStream bis = new BufferedInputStream(fis, 1024);
		
		int readCount = 0;
		byte[] receive = new byte[32];
		while((readCount = bis.read(receive)) != -1){
			for(int i=0; i<receive.length; i++){
				System.out.print((char)receive[i]);
			}
		}
		
		bis.close();
		fis.close();
	}
}
