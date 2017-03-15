package javaBible_ex;

/**
 * @author Heo-MH
 * 2^1 + 2^2 + 2^3 + 2^4 + 2^2
 */
public class Ex6_14 {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i=1; i<=n; i++){
			result += power(x, i);
		}
		System.out.println("Result : " + result);
	}
	
	public static long power(int x, int n){
		
		if(n==1){
			return x;
		}else{
			return x * power(x, n-1);
		}
	}
}
