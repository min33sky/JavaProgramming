package javaBible_ex;

public class Ex6_22 {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? " + isNumber(str));
	}

	private static boolean isNumber(String str) {
		
		if(str.equals("") || str == null){
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// 숫자가 아니면 false
			if(!('0'<=c && c<='9')){ 
				return false;
			}
		}
		
		return true;
	}
}
