package json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * 웹 서버에서 전송되는 JSON 파싱하기 1
 */
public class Tutorial3 {
	public static void main(String[] args) throws ParseException {
		
		String jsonStr = "";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/json/ex1.json"));
			StringBuilder sb = new StringBuilder();
			String temp;
			while((temp = br.readLine()) != null){
				sb.append(temp + "\n");
			}
			jsonStr = sb.toString().trim();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(jsonStr);
		
		// 파싱 객체 생성
		JSONParser parser = new JSONParser();
		
		// JSON Object로 파싱한다.
		JSONObject jsonObj = (JSONObject) parser.parse(jsonStr);
		
		// response키 값에 해당하는 객체를 받아온다.
		JSONObject obj = (JSONObject) jsonObj.get("response");

		// 객체 안의 값들을 출력
		System.out.println("이름 : " + obj.get("name"));
		System.out.println("나이 : " + obj.get("age"));
		
	}
}
