package enum1;

/*
 * 상수 활용 (ENUM)
 */
public class ConstantTest {
	public static void main(String[] args) {

		Fruit type = Fruit.APPLE;

		switch (type) {
			case APPLE:
				System.out.println("사과 색깔은 " + Fruit.APPLE.getColor());
				break;
			case BANANA:
				System.out.println("바나나 색깔은 " + Fruit.BANANA.getColor());
				break;
			case MELON:
				System.out.println("멜론 색깔은 " + Fruit.MELON.getColor());
				break;
		}
	}
}
