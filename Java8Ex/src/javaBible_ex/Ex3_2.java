package javaBible_ex;

public class Ex3_2 {
	public static void main(String[] args) {
		int numberOfApples = 123;	// 사과의 개수
		int sizeOfBucket = 10;		// 바구니의 개수
		int numOfBucket = (numberOfApples / sizeOfBucket) + 
							((numberOfApples % sizeOfBucket) == 0 ? 0 : 1);
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}
}
