package javaBible_ex;

public class Ex9_13 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
	}

	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		if (key == null || key.length() == 0)
			return 0;
		
		while((index = src.indexOf(key, pos)) != -1){
			count++;
			pos = index + key.length();		// 검색을 시작할 위치를 변경
		}
		
//		
//		for(int idx=0; idx<src.length(); idx++){
//			if(src.charAt(idx) != 'a') 
//				continue;
//			else
//				if(src.charAt(idx+1) == 'a'){
//					count++;
//					idx++;
//				}else{
//					idx++;
//				}
//		}
	
		
		return count;
	}
}
