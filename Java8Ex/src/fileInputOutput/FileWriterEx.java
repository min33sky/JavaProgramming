package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("test3.txt");
		String str = "아오 샤발 \r\n빡도네";
		writer.write(str);
		writer.close();
		System.out.println("종료");
	}
}
