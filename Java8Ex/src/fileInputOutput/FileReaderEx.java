package fileInputOutput;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("test");
		
//		int ch = 0;
//		while((ch = reader.read()) != -1 ){
//			System.out.print((char)ch);
//		}

		////////////////////////////////////
		
		int readCount = 0;
		char[] cbuf = new char[100];
		while((readCount = reader.read(cbuf)) != -1){
			String str = String.valueOf(cbuf).trim();
			System.out.println(str);
		}
		
		System.out.println("끝");
		reader.close();
		
	}
}
