package ex16.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("양팡", 21),
				new Student("철구", 29),
				new Student("오메킴", 28),
				new Student("김봉준", 27));
		
		Stream<Student>	stream = list.stream();
		stream.forEach(s->{
			String name = s.getName();
			int age = s.getAge();
			System.out.println(name + " : " + age); 
		});
		
		
		
	}
}
