package reflection;

import java.lang.reflect.Method;

public class ReflectTest3 {
	public static void main(String[] args) throws Exception{
		String className = "reflection.Calculator";
		String methodName = "doB";
		
		Class<?> clz = Class.forName(className);
//		 메소드 찾기 - 메소드 이름, 파라미터들...
		
		Object obj = clz.newInstance();
		
		Method[] methods = clz.getDeclaredMethods();
//		Method[] methods = clz.getMethods();
		
		for(Method m : methods){
			String mName = m.getName();
			if(methodName.equals(mName)){
				System.out.println("find: " + m);
				
				// invoke : 호출
				m.invoke(obj, null);
			}
		}
	}
}
