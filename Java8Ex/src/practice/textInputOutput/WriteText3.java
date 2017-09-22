package practice.textInputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * File 클래스로 파일 출력하기
 * @author Heo-MH
 *
 */
public class WriteText3 {
	public static void main(String[] args) {
		// 읽기용 파일
		Path input = Paths.get("test");
		
		// 쓰기용 파일
		Path output = Paths.get("writeTest3");
		
		// 읽기용 파일의 내용을 BufferedReader로 가져온다.
		try(BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
		    BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8)) {
			
			// 읽기용 파일의 내용을 한 줄씩 읽고,
			// 빈 줄이 없는 경우 쓰기용 파일에 기록한다.
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				// 파일 내용 읽기
				System.out.println(line);
				
				// 파일에 쓰기
				writer.write(line);
				writer.newLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
