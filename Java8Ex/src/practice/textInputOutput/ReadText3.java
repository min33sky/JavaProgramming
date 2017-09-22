package practice.textInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 텍스트를 한번에 모두 읽는 방법 1 (Scanner)
 * @author Heo-MH
 *
 */
public class ReadText3 {
	public static void main(String[] args) {
		
		File file = new File("test");
		
		try(Scanner scan = new Scanner(file);) {
			
			// 반복문을 이용해서 출력하기
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
			
//			정규표현식으로 모두 출력하기
//			System.out.println(scan.useDelimiter("\\z").next());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
