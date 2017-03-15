package javaBible_ex;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		
		// String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환한다
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 객체의 주소값으로 해시코드 생성
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
}
