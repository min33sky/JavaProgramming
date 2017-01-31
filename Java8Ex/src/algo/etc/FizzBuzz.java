package algo.etc;

import java.util.ArrayList;
import java.util.List;
/*
 * FizzBuzz 구현
 * 3의 배수 Fizz 5의 배수 Buzz 15의 배수는 FizzBuzz 
 * 나머지는 숫자 그대로 출력
 */
public class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		List<String> list = fb.alternativeFizzBuzz(20);
//		for(String s : list){
//			System.out.println(s);
//		}
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	public List<String> alternativeFizzBuzz(int number){
		List<String> toReturn = new ArrayList<String>();
		for(int i=1; i<=number; i++){
			String word = toWord(3, i, "Fizz") + toWord(5, i, "Buzz");

			// 3,5,15의 배수가 아닐경우 숫자 그대로 출력
			if(word.length() == 0){
				toReturn.add(Integer.toString(i));
			}else{
				toReturn.add(word);
			}
		}
		return toReturn;
	}

	// 배수 체크 메서드 (배수면 매개변수로 받은 문자가 리턴)
	public String toWord(int divisor, int value, String word) {
		return value % divisor == 0 ? word : "";
	}
}
