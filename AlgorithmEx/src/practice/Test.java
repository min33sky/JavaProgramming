package practice;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[4];
		fruits[0] = new Fruit("Pineapple", 70);
		fruits[1] = new Fruit("Apple", 100);
		fruits[2] = new Fruit("Orange", 80);
		fruits[3] = new Fruit("Banana", 90);
		
//		Arrays.sort(fruits);
//		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(fruits, Fruit.nameComparator );
		System.out.println(Arrays.toString(fruits));
		Arrays.sort(fruits, Fruit.quantityComparator );
		System.out.println(Arrays.toString(fruits));
		
	}
	
}
