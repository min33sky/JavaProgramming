package ex18.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) throws IOException {
		String originalFileName = "C:/java/bbc.txt";
		String targetFileName = "c:/java/bbc3.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;						// 실제로 읽은 바이트 수
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1){
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
