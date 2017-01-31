package reflection;

import java.lang.reflect.Field;

public class ReflectTest4 {
	public static void main(String[] args) throws Exception{
		Class clz = Class.forName("reflection.MemberVO");
		Object obj = clz.newInstance();
		System.out.println(obj);
		
		Field idField = clz.getDeclaredField("id");
		idField.setAccessible(true); // Private에 접근 가능
		idField.set(obj, "USER00");
		
		System.out.println(obj);
	}
}
