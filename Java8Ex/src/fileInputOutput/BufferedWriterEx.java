package fileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("test");
		BufferedWriter bw = new BufferedWriter(fw, 1024);
		
		bw.write("흥민이 샤발람아 하아......");
		
		bw.close();
		fw.close();
		
	}
}
