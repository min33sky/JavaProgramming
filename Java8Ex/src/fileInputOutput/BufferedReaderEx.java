package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test"), 1024);
//		char[] cbuf = new char[516];
//		while(br.read(cbuf) != -1){
//			System.out.println(cbuf);
//		}
		
		String str = null;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		br.close();
	}
}
