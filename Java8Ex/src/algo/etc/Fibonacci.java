package algo.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 피보나치 수열
 */
public class Fibonacci {
	public static void main(String[] args) {
		List<Integer> list = fibonacci(8);
		for(int i : list){
			System.out.print(" " + i);
		}

		System.out.println("\n 8번째 숫자 : "+ fibo1(8));
		
		fibo2(8);

	}
	
	// 피보나치 출력(재귀 메서드를 이용)
	private static void fibo2(int num) {
		for(int i=1; i<=num; i++){
			System.out.print(" " + fibo1(i));
		}
	}

	// 재귀 이용
	public static int fibo1(int num){
		if(num == 0){
			throw new IllegalArgumentException("0이상의 숫자를 넣어라.");
		}
		if(num == 1){
			return 0;
		}else if(num == 2){
			return 1;
		}else{
			return fibo1(num-2) + fibo1(num-1);
		}
	}


	// 반복 이용
	public static List<Integer> fibonacci(int num){
		if(num<0){
			throw new IllegalArgumentException();
		}

		if(num==0){
			return new ArrayList<Integer>();
		}else if(num==1){
			return Arrays.asList(0);
		}else if(num==2){
			return Arrays.asList(0,1);
		}

		List<Integer> seq = new ArrayList<>(num);
		seq.add(0);
		num = num-1;
		seq.add(1);
		num = num-1;

		while(num>0){
			int a = seq.get(seq.size()-1);
			int b = seq.get(seq.size()-2);
			seq.add(a+b);
			num--;		
		}
		return seq;
	}
}
