package ex18.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/ex18/resource/test.txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/ex18/resource/test2.txt")));
		String temp = "";
		while((temp = br.readLine()) != null){
			System.out.println(temp);
			pw.println(temp);
		}
		
		pw.flush();
		pw.close();
		br.close();
	}
}
