package ex14.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaEx1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,1,2,5,7,4,10,8,41,22);

		// 내림차순 정렬
		list.sort((n1,n2) -> n2.compareTo(n1));
		
		System.out.println(list.toString());
	}
}
