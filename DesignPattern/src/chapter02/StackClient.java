package chapter02;

public class StackClient {
	public static void main(String[] args) {
		ArrayListStack st = new ArrayListStack(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.peek());
		
	}
}
