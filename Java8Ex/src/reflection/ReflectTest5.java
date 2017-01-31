package reflection;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectTest5 {
	public static void main(String[] args) throws Exception{
		
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", "홍길동");
		paramMap.put("id", "User00");
		
		Class clz = Class.forName("reflection.MemberVO");
//		System.out.println(clz);
		Object obj = clz.newInstance();
		
		BeanInfo info = Introspector.getBeanInfo(clz);
		
		PropertyDescriptor[] props = info.getPropertyDescriptors();
		
		for(PropertyDescriptor p : props){
			
			System.out.println(p.getDisplayName());
			System.out.println(p.getPropertyType());
			
			// Setter 메서드 역할
			Method setMethod = p.getWriteMethod();
			
			if(setMethod == null){
				continue;
			}
			
			setMethod.invoke(obj, paramMap.get(p.getDisplayName()));
		}
		
		System.out.println(obj);
	}
}
