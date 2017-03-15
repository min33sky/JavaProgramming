package javapuzzleer;
/**
 * 큰 수를 계산할 때는 Overflow를 조심하자....
 * long = int * int -> 자동으로 long으로 타입 변경되서 계산되지 않는다.
 * @author Heo-MH
 */
public class Ex3 {
	public static void main(String[] args) {
		// int 타입끼리 계산했기때문에 오버플로가 발생한다.
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		// long 타입으로 오버플로를 예방한다.
		final long MICROS_PER_DAY2 = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY2 = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		System.out.println(MICROS_PER_DAY2 / MILLIS_PER_DAY2);
	}
}
