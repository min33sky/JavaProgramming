package javaBible_ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class ExceptionEx14 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("error.log", true);
			ps = new PrintStream(fos);
			System.setErr(ps);	// err의 출력을 화면이 아닌, error.log파일로 변경한다.
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // 예외 발생!!
			System.out.println(4);   // 실행되지 않는다.
			
		} catch (Exception e) {
			System.err.println("------------------------------");
			System.err.println("예외발생시간 : " + new Date());
			e.printStackTrace();
			System.err.println("예외메시지 : " + e.getMessage());
			System.err.println("------------------------------");
		}
		System.out.println(6);
	}
}
