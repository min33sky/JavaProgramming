package test;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

import org.omg.CORBA.Environment;

// 프로퍼티 파일로부터 읽기
public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		/*
		 * Class.getResource() : 상대주소
		 * Class.getPath() : 절대주소
		 */
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(driver + " : " + url);
		System.out.println(username + " : " + password);
		
		
		
		
	}
}
