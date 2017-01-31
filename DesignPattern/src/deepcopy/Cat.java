package deepcopy;

public class Cat implements Cloneable {
	private String name;
	private Age age;
	
	public void setAge(Age age) {
		this.age = age;
	}
	
	public Age getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Cat copy() throws CloneNotSupportedException{
		Cat ret = (Cat) this.clone();
		// 깊은 복사를 위해서 추가한다.
		ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
		return ret;
	}
}
