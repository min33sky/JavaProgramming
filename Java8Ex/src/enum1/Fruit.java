package enum1;

/*
 * 상수당 각자 생성자가 실행되어 인스턴스를 생성한다
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
