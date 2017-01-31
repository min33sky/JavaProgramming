package algo.interview.chap03;

/*
 * page 258
 * 하나의 배열로 스택 3개 만들기
 */
public class ThreeStacksInOneArray {	
	public static void main(String[] args) {
		ThreeStack stack = new ThreeStack(3);
		stack.push(1, 1);
		stack.push(1, 2);
		stack.push(1, 3);
		stack.push(2, 4);
		stack.push(2, 5);
		stack.push(2, 6);
		stack.push(3, 7);
		stack.push(3, 8);
		stack.push(3, 9);
			
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(2));
		System.out.println(stack.pop(2));
		System.out.println(stack.pop(2));
		System.out.println(stack.pop(3));
		System.out.println(stack.pop(3));
		System.out.println(stack.pop(3));
	}
}
