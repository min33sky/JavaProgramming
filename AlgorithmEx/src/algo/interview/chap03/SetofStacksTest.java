package algo.interview.chap03;

public class SetofStacksTest {
	public static void main(String[] args) {
		SetofStacks stacks = new SetofStacks();
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		stacks.push(5);
		stacks.push(6);
		stacks.push(7);
		stacks.push(8);
		stacks.push(9);
		
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
	}
}
