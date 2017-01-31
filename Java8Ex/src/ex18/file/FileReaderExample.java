package ex18.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
			FileReader fr = new FileReader("c:/java/bbc.txt");
			
			int readByteNo;
			char[] cbuf = new char[100];
			while((readByteNo = fr.read(cbuf)) != -1){
				String data = new String(cbuf, 0, readByteNo);
				System.out.println(data);
			}
			fr.close();
	}
}
