package ex18.file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/java/dir");
		File file1 = new File("c:/java/file1.txt");
		File file2 = new File(new URI("file:///c:/java/file2.txt"));
		
		File temp = new File("c:/java");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a     HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("날짜                   시간     형태           크기         이름");
		System.out.println("---------------------------------------------------------------------------");
		for(File file : contents){
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()){
				System.out.println("\t<DIR>\t\t\t" + file.getName());
			}else{
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}
		}
		System.out.println();
	}
}
