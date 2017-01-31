package reflection;

import java.util.Scanner;

/*
 * 객체를 만들때 빼곤 클래스가 메모리에 로딩되지 않는다.
 */
public class ReflectTest1 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("로딩하고 싶은 클래스 이름은? ");
		
		String className = scanner.nextLine();
		
//		String className = "reflection.TestObj";
		
		try {
			// 메모리에 클래스를 로딩!!! (동적 로딩)
			Class clazz1 = Class.forName(className);
			System.out.println(clazz1);
			
			Thread.sleep(3000);
			Class clazz2 = Class.forName(className);
			System.out.println(clazz2);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
