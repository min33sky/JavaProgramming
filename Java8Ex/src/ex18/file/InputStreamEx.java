package ex18.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("src/ex18/resource/result.txt");
		int readByte;
		byte[] arr = new byte[100];
		while((readByte = input.read(arr)) != -1){
			System.out.print(readByte);
		}
	}
}
