package algo.problem.solving1;
/*
 * 피보나치 수열
 */
public class Sec04 {
	public static void main(String[] args) {
		System.out.println("피보나치 수열을 구해보자.");
		
		int sum = 0;
		int num1 = 1;
		int num2 = 0;
		int count = 0;
		
		while(count < 24){
			sum = num1 + num2;
			
			if(count%12 == 0)
				System.out.println();
			
			System.out.print(sum + " ");
			num2 = num1;
			num1 = sum;
			count++;
		}
		
	}
}
