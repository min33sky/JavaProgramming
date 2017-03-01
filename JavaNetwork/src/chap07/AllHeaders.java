package chap07;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AllHeaders {
	public static void main(String[] args) {
		try {
			URLConnection uc = new URL("http://www.afreeca.com").openConnection();
			int count = 0;
			while(uc.getHeaderField(count) != null){
				String key = uc.getHeaderFieldKey(count);
				String header = uc.getHeaderField(count);
				System.out.println(key + " : " + header);
				count++;
			}
			
			System.out.println("*************************");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
