package javapuzzleer;

import java.math.BigDecimal;

/**
 * 부동소수점 타입은 정확한 값을 표현할 수 없다.
 * @author Heo-MH
 */
public class Ex2 {
	public static void main(String[] args) {
		System.out.println(2.00 - 1.10);
		System.out.println(200 - 110);
		// BigDecimal 생성자는 double이 아니라 String을 사용한다.
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}
}
