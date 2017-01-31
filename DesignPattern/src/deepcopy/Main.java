package deepcopy;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012,3));
		
		// 얕은 복사 - 주소값을 복제
		Cat yo = navi;
		yo.setName("Yo");
		
		Cat ho = navi.copy();
		ho.setName("Ho!!");
//		ho.setAge(new Age(2013, 2));
		ho.getAge().setYear(2013);
		ho.getAge().setValue(2);
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		System.out.println(ho.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(ho.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(ho.getAge().getValue());
	}
}
 