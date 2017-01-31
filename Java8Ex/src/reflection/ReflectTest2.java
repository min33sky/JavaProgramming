package reflection;

import java.lang.reflect.Constructor;

public class ReflectTest2 {
	public static void main(String[] args) throws Exception {
		String className = "reflection.TestObj";
		Class clazz = Class.forName(className);
		
		// 생성자가 없거나 ()생성자가 있는 경우는 클래스에서 바로 객체 생성 가능
//		Object obj = clazz.newInstance();
//		System.out.println(obj);
//		
		Constructor con = clazz.getDeclaredConstructor(String.class);
		
		Object obj = con.newInstance("");
		System.out.println(obj);
		

	}
}
