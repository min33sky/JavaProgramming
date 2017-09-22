package practice.textInputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 파일 출력 - BufferedWriter 사용 : 버퍼링후 파일에 쓰기(효율적 출력, CPU부하 줄임)
 * @author Heo-MH
 *
 */
public class WriteText2 {
	public static void main(String[] args) {
		
		try {
			// 출력 파일의 File 오브젝트 생성
			File file = new File("writeTest2");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			// 파일이 쓰기 가능한지 체크
			if(file.isFile() && file.canWrite()){
				
				// 문자열 쓰기
				bw.write("문자열 출가1");
				// 개행 문자 추기
				bw.newLine();
				
				// 문자열 쓰기
				bw.write("문자열 출가2");
				// 개행 문자 추기
				bw.newLine();
				
				// bw 오브젝트 닫기
				bw.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
