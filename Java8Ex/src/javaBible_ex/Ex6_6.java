package javaBible_ex;

public class Ex6_6 {
//	두 점사이의 거리 구하기 
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

	private static double getDistance(int x1, int y1, int x2, int y2) {
		// Math.sqrt() : 제곱근 후가히
		// Math.pow(x, n) : x의 n제곱
		
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
//		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
}
