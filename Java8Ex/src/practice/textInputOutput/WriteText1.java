package practice.textInputOutput;

import java.io.File;
import java.io.FileWriter;

/**
 * 파일 출력1
 * @author Heo-MH
 *
 */
public class WriteText1 {
	public static void main(String[] args) {
		try {
			// 출력할 파일의 File 오브젝트 생성
			File file = new File("writeTest");
			
			// FileWriter 오브젝트 생성(추가 기록 모드)
			FileWriter fw = new FileWriter(file, true);
			
			// 문자열 출력
			fw.write("출력 문자열 1\r\n");
			fw.write("출력 문자열 2\r\n");
			
			// FileWriter 오브젝트 닫기
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
