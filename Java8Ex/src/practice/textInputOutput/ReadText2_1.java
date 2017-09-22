package practice.textInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * try-with-resources문으로 처리
 * @author Heo-MH
 *
 */
public class ReadText2_1 {
	public static void main(String[] args) {
		File file = new File("test");

		try(FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr)) {

			 String line = "";
			 
			 while((line = br.readLine()) != null){
				 System.out.println(line);
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
