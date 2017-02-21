package json;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 * JSON 파싱하기
 * https://code.google.com/p/json-simple/ 혹은 Maven Repository에서 라이브러리 다운
 */
public class Tutorial1 {
	public static void main(String[] args) throws Exception {
		String target = "http://localhost:3003/notice/list";
		FileWriter fileWriter = null;
		HttpURLConnection conn = (HttpURLConnection) new URL(target).openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		String temp = "";
		StringBuilder sb = new StringBuilder();
		while((temp = br.readLine()) != null){
			System.out.println(temp + "\n");
			sb.append(temp + "\n");
		}
		String jsonString = sb.toString().trim();
		
		System.out.println("***** 위에 문자열은 서버에서 받아온 정보입니다. *****");

		// JSON 파서 
		JSONParser parser = new JSONParser();
		// JSON 문자열을 JSON 객체로 파싱한다.
		JSONObject obj = (JSONObject) parser.parse(jsonString);
		// Key를 이용해서 JSON 배열값을 가져온다
		JSONArray arr = (JSONArray) obj.get("response");
		System.out.println("JSON 배열의 크기 : " + arr.size());
		// 파일에 출력
		fileWriter = new FileWriter("jsonObject.txt");
		for(int i=0; i<arr.size(); i++){
			JSONObject jsonObj = (JSONObject) arr.get(i);
			String r1 = (String) jsonObj.get("noticeContent");
			String r2 = (String) jsonObj.get("noticeName");
			String r3 = (String) jsonObj.get("noticeDate");
			System.out.println(r1 + " " + r2 + " " + r3);			// 콘솔 출력
			fileWriter.write(r1 + " " + r2 + " " + r3 + "\r\n");	// 파일 출력
		}
		fileWriter.flush();
		fileWriter.close();
		br.close();
		conn.disconnect();
	}
}
