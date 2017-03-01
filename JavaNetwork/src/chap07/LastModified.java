package chap07;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class LastModified {
	public static void main(String[] args) {
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL("http://www.naver.com").openConnection();
			conn.setRequestMethod("HEAD");
			System.out.println("네이버 " + "was last modified at " + new Date(conn.getLastModified()));
			System.out.println("******************************************************");
			System.out.println("응답코드 : " + conn.getResponseCode());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
