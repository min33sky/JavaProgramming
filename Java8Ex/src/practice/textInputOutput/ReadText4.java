package practice.textInputOutput;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * 텍스트를 한번에 모두 읽는 방법2 (Files)
 * @author Heo-MH
 *
 */
public class ReadText4 {
	public static void main(String[] args) {
		// 파일 오브젝트 생성
		Path path = Paths.get("test");
		
		// 문자셋 지정
		Charset cs = StandardCharsets.UTF_8;
		List<String> list = new ArrayList<String>();
		
		try {
			list = Files.readAllLines(path, cs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 가져온 텍스트 내용을 출력한다.
		for (String readLine : list) {
			System.out.println(readLine);
		}
	}
}
