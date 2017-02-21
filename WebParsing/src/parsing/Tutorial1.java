package parsing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tutorial1 {
	public static void main(String[] args) throws Exception {
		String target = "http://www.naver.com";
		// 해당 URL에 접속할 수 있는 커넥션 생성
		HttpURLConnection conn = (HttpURLConnection) new URL(target).openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		String temp;
		int rank = 0;
		while((temp = br.readLine()) != null){
			// 현재 네이버 서버의 날짜와 시간을 찾아서 출력
			if(temp.contains("var svt = \"")){
				// var svt = "20170219194825"; -> 값만 가져온다.
				temp = temp.split("var svt = \"")[1].split("\";")[0];
				int year = Integer.parseInt(temp.substring(0, 4));
				int month = Integer.parseInt(temp.substring(4, 6));
				int day = Integer.parseInt(temp.substring(6, 8));
				int hour = Integer.parseInt(temp.substring(8, 10));
				int minute = Integer.parseInt(temp.substring(10, 12));
				int second = Integer.parseInt(temp.substring(12, 14));
				System.out.println(year+"년"+month+"월"+day+"일"+hour+"시"+minute+"분"+second+"초");
			}
			if(temp.contains("class=\"up\"") && rank < 10){
				System.out.println("현재 순위 " + (++rank) + " : " + temp.split("title=\"")[1].split("\">")[0]);
			}
		}
		conn.disconnect();
		br.close();
	}
}
