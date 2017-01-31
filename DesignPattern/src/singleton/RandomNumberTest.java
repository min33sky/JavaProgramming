package singleton;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RandomNumberTest {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Random r1 = new Random();
		int v1 = r1.nextInt();
		int v2 = r1.nextInt();
		System.out.println(v1 + " , " + v2);
		
		// SecureRandom : 보안강화
		Random r2 = new SecureRandom();
		int v3 = r2.nextInt();
		int v4 = r2.nextInt();
		System.out.println(v3 + " , " + v4);
		
		Random r4 = SecureRandom.getInstance("SHA1PRNG");
		int v5 = r4.nextInt();
		int v6 = r4.nextInt();
		System.out.println(v5 + " , " + v6);
		
		
	}
}
