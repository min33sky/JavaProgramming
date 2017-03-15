package javaBible_ex;

/*
 * 대문자를 소문자로 바꾸자
 */
public class Ex3_10 {
	public static void main(String[] args) {
		char ch = 'B';
		
		char lowerCase = (char) (('A' <= ch && ch <= 'Z') ? (char)ch+32 : ch);
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase " + lowerCase); 
	}
}
