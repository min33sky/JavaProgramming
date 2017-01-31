package util;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextFloat());
		
		System.out.println(random.nextInt(2)+10);
		
		
	}
}
