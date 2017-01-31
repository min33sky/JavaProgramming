package datastructure.stack;

public class NewStackTest {
	public static void main(String[] args) {
		NewStack<Integer> stack1 = new NewStack<>(10);
		NewStack<Character> stack2 = new NewStack<>(10);
		
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.print();
		
		System.out.println();
		stack2.push('A');
		stack2.push('B');
		stack2.push('C');
		stack2.push('D');
		stack2.push('E');
		stack2.print();

		System.out.println();
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		// Exception
		System.out.println(stack2.pop());
		
		
		
		
		
	}
}
