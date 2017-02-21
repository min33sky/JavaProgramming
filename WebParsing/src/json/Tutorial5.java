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
 * 웹 서버에서 전송되는 JSON 파싱하기 3
 */
public class Tutorial5 {
	public static void main(String[] args) throws ParseException {
		String jsonStr = "";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/json/ex3.json"));
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
		
		// response 가져오기
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject) parser.parse(jsonStr);
		JSONObject response = (JSONObject) jsonObj.get("response");

		// body 가져오기
		JSONObject body = (JSONObject) response.get("body");
		
		// items 가져오기
		JSONObject items = (JSONObject) body.get("items");
		
		// itemlist 가져오기(배열값)
		JSONArray itemlist = (JSONArray) items.get("itemlist");

		// 요소 출력
		for(int i=0; i<itemlist.size(); i++){
			JSONObject obj = (JSONObject) itemlist.get(i);
			String name = (String) obj.get("name");
			String age = (String) obj.get("age");
			System.out.println(name + " : " + age);
			
		}
	}
}
