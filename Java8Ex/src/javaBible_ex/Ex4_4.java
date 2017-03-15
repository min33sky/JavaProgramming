package javaBible_ex;

public class Ex4_4 {
	public static void main(String[] args) {
		int sum = 0;
		int flag = 1;
		int result = 0;
		
		for(int i=1; sum<100; i++, flag=-flag){
			sum = sum + (i * flag);
			result = i;
		}
		
		System.out.println(result);
	}
}
