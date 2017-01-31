package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader reader = null;

		try {
			String path = FileInputStreamEx2.class.getResource("siba.txt").getPath();
			fr = new FileReader(path);
			reader = new BufferedReader(fr);
			String str = reader.readLine();
			while(str != null){
				System.out.println(str);
				str = reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
