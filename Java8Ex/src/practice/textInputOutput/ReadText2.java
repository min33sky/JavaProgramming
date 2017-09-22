package practice.textInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 텍스트를 한 줄씩 읽는 방법 (BufferedReader)
 * @author Heo-MH
 *
 */
public class ReadText2 {
	public static void main(String[] args) {
		try {
			// 파일 오브젝트 생성
			File file = new File("test");
			FileReader fRd = new FileReader(file);
			BufferedReader br = new BufferedReader(fRd);
			
			String line = "";
			
			// while 문을 이용해 파일을 읽어 들인다.
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
			// 입력 스트림을 닫는다.
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
