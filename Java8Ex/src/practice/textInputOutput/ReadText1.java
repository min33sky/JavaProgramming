package practice.textInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 파일의 문자를 한 문자씩 읽는 방법 (FileReader)
 * @author Heo-MH
 *
 */
public class ReadText1 {
	public static void main(String[] args) {
		try {
			// 파일 오브젝트 생성
			File file = new File("test");
			
			// 입력 스트림 오브젝트 생성
			FileReader fileReader = new FileReader(file);
			
			int singleCh = 0;
			
			// while 문을 이용해 파일을 읽어 들인다.
			while((singleCh = fileReader.read()) != -1){
				System.out.print((char)singleCh);
			}
			
			// 입력 스트림을 닫늗다.
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e){
			System.out.println(e);
		}
	}
}
