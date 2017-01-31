package fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File file = new File("test");
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		System.out.println(file.canRead());
		System.out.println(file.isHidden());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		file = new File("ex");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(i + " 번째 파일 명 : " + files[i]);
		}
		
		BufferedReader br = new BufferedReader(new FileReader(files[0]));
		String str;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		File dir = new File("shabal");
		dir.mkdir();
		dir.delete();
	}
}
