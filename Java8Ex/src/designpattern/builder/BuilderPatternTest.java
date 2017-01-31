package designpattern.builder;

/*
 * Builder Pattern 연습
 */
public class BuilderPatternTest {
	public static void main(String[] args) {
		Beverage beverage = new Beverage.Builder("pooh", 100).calories(200)
								.protein(10).build();
		
		System.out.println(beverage.getCalories());
		System.out.println(beverage.getProtein());
		
		
	}
}
