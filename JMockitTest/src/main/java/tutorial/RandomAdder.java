package tutorial;

public class RandomAdder {
	public int add(){
		RandomNumber rand = new RandomNumber();
		int a = rand.getRandomNumber();
		int b = rand.getRandomNumber();
		
		// 2개의 난수를 더해 반환한다.
		return a + b;
	}
}
