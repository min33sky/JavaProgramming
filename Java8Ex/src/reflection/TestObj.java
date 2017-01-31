package reflection;

public class TestObj extends ParentObj{
	
	// 클래스가 메모리상에 로딩되면 실행
	static{
		System.out.println("TestObj static block");
	}
	
	public TestObj(){
		System.out.println("빈 생성자");
	}
	
	public TestObj(String str){
		System.out.println("문자열 생성자");
	}
	
	public void doA(){
		System.out.println("doA.....");
	}

	public static void main(String[] args) {
		System.out.println("zzzzzzzzzzzzzzz");
		TestObj obj1 = new TestObj();
		TestObj obj2 = new TestObj();
	}
}		
