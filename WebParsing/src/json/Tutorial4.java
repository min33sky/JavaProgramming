package json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * 웹 서버에서 전송되는 JSON 파싱하기 2
 */
public class Tutorial4 {
	public static void main(String[] args) throws ParseException {
		String jsonStr = "";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/json/ex2.json"));
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
		
		// 파싱 작업
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject) parser.parse(jsonStr);
		JSONObject items = (JSONObject) jsonObj.get("items");
		System.out.println("itemlist의 타입 : " + items.get("itemlist").getClass());
		
		// JSONArray로 값을 받아온다.
		JSONArray arr = (JSONArray) items.get("itemlist");
		JSONObject obj1 = (JSONObject) arr.get(0);
		JSONObject obj2 = (JSONObject) arr.get(1);
		System.out.println(obj1.get("name") + " : " + obj1.get("age"));
		System.out.println(obj2.get("name") + " : " + obj2.get("age"));
		
	}
}
