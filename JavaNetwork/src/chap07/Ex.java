package chap07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex {
	public static void main(String[] args) {
		try {
			URLConnection uc = new URL("http://www.afreeca.com").openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream(), "UTF-8"));
			String temp = "";
			while((temp = br.readLine()) != null){
				System.out.println(temp);
			}
			System.out.println("******************************");
			System.out.println(uc.getContentType());
			System.out.println(uc.getHeaderFieldKey(2));
			System.out.println(uc.getHeaderField(2));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		
		}
	}
}
