package algo.interview.chap03;

public class PushAndPopMinStack {
	public static void main(String[] args) {
		MinStack stack = new MinStack(10);
		stack.push(7);
		System.out.println("최소 값 : " + stack.getMin());
		stack.push(4);
		System.out.println("최소 값 : " + stack.getMin());
		stack.push(5);
		System.out.println("최소 값 : " + stack.getMin());
		stack.push(3);
		System.out.println("최소 값 : " + stack.getMin());
		
		stack.pop();
		System.out.println("최소 값 : " + stack.getMin());
		stack.pop();
		System.out.println("최소 값 : " + stack.getMin());
		stack.pop();
		System.out.println("최소 값 : " + stack.getMin());
		stack.pop();
		System.out.println("최소 값 : " + stack.getMin());
		
		
	}
}
