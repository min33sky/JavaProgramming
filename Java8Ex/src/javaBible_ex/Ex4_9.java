package javaBible_ex;

public class Ex4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++){
			sum = sum + Integer.parseInt(str.charAt(i)+"");
		}
		
		System.out.println("sum="+ sum);
		
	}
}
