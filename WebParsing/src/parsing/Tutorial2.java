package parsing;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * 10초마다 네이버 실시간검색어 순위를 파일에 출력한다.
 */
public class Tutorial2 {
	public static void main(String[] args) throws Exception {
		
		while(true){
			String target = "http://www.naver.com";
			// 해당 URL에 접속할 수 있는 커넥션 생성
			HttpURLConnection conn = (HttpURLConnection) new URL(target).openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			FileWriter fw = null;
			String temp;
			int rank = 0;
			while((temp = br.readLine()) != null){
				// 현재 네이버 서버의 날짜와 시간을 찾아서 출력
				if(temp.contains("var svt = \"")){
					// var svt = "20170219194825"; -> 값만 가져온다.
					fw = new FileWriter(temp.split("var svt = \"")[1].split("\";")[0] + ".txt");
				}
				if(temp.contains("class=\"up\"") && rank < 10){
					fw.write("현재 순위 " + (++rank) + " : " + temp.split("title=\"")[1].split("\">")[0] + "\r\n");
				}
				if(rank == 10){
					fw.close();
				}
			}
			conn.disconnect();
			br.close();
			Thread.sleep(10000); // 10초마다 갱신
		}
	}
}
