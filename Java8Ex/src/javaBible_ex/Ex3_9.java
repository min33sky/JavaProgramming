package javaBible_ex;

public class Ex3_9 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a'<=ch && ch<='z') || 
				    ('A'<=ch && ch<='Z') || 
				    ('0'<=ch && ch<='9')    ? true : false;
		
		System.out.println(b);
	}
}
