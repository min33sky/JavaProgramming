package session;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tutorial1 {
	public static void main(String[] args) throws Exception {
		String username = "qwe";
		String password = "123";
		String target = "http://localhost:3003/auth/login?username="+username+"&password="+password;
		HttpURLConnection conn = (HttpURLConnection) new URL(target).openConnection();
		String cookie = "";
		String temp = conn.getHeaderField("Set-Cookie");
		if(temp != null){
			cookie = temp;
		}
		System.out.println("현재 당신의 세션은 : " + cookie + "입니다.");
		/*
		 * 세션키를 이용해서 정보 얻어오기
		 * 이 코드는 쿠키가 없어도 된는 예제이다. 
		 * 아이디값을 이용해서 DB를 수정하는 코드에 사용하면 좋다.
		 */
		conn = (HttpURLConnection) new URL("http://localhost:3003/topic/2").openConnection();
		conn.setRequestProperty("Cookie", cookie);
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		while((temp = br.readLine()) != null){
			System.out.println(temp);
		}
		conn.disconnect();
		br.close();
	}
}
