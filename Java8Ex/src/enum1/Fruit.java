package enum1;

/**
 * Enum의 상수를 호출하면 상수당 생성자가 실행되어
 * 인스터스들을 생성한다.
 * @author Heo-MH
 *
 */
public enum Fruit {
	APPLE("Red"), BANANA("Yellow"), MELON("Green");
	private String color;
	
	public String getColor(){
		return color;
	}
	
	Fruit(String color){
		System.out.println("생성자 실행 " + this);
		this.color = color;
	}
}
