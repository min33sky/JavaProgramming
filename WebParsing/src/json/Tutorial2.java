package json;

import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * JSON 객체 만들고 파싱하기
 */
public class Tutorial2 {
	public static void main(String[] args) {
		
		JSONObject jsonObj = new JSONObject();
		
		// 데이터 추가
		jsonObj.put("이름", "양팡");
		jsonObj.put("나이", 21);
		jsonObj.put("국적", "한국");
		jsonObj.put("베스트BJ", new Boolean(true));
		
		// JSON 문자열로 변환
		String jsonStr = jsonObj.toJSONString();
		System.out.println(jsonStr);
		
		System.out.println("*** JSON 문자열 파싱하기 ***");
		JSONParser parser = new JSONParser();
		try {
			JSONObject obj = (JSONObject) parser.parse(jsonStr);
			String name = (String) obj.get("이름");
			int age = ((Long) obj.get("나이")).intValue();	// Simple JSON은 수를 LONG으로 리턴한다.
			String national = (String) obj.get("국적");
			boolean bestBJ = (boolean) obj.get("베스트BJ");
			
			System.out.println(name + " " + age + " " + national + " " + bestBJ);
			
			Iterator<String> itr = obj.keySet().iterator();
			while(itr.hasNext()){
				String key = (String) itr.next();
				System.out.println(key + " : " + obj.get(key));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
