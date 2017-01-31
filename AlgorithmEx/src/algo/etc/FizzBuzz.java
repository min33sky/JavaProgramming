package algo.etc;

import java.util.ArrayList;
import java.util.List;

/*
 * n = 15, Return: [ "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" ]
 */

public class FizzBuzz {
	public static List<String> solution1(int n){
		List<String> list = new ArrayList<String>();
		for(int i=1; i<=n; i++){
			String str = "";
			if(i%3==0) str = "Fizz";
			if(i%5==0) str += "Buzz";
			else if(i%3!=0) str = i + "";
			list.add(str);
		}
		return list;
	}
	/* 
	 * Solution2 : Not using "%" operation 
	 */
	public static List<String> solution2(int n){
		List<String> list = new ArrayList<String>();
		for(int i=1, fizz=0, buzz=0; i<=n; i++){
			fizz++;
			buzz++;
			if(fizz==3 && buzz==5){
				list.add("FizzBuzz");
				fizz=0;
				buzz=0;
			}else if(fizz==3){
				list.add("Fizz");
				fizz=0;
			}else if(buzz==5){
				list.add("Buzz");
				buzz=0;
			}else{
				list.add(String.valueOf(i));
			}
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		System.out.println(solution1(18));
		System.out.println(solution2(18));
	}
}
