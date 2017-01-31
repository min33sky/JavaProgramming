package datastructure.stack;

// 배열을 이용한 기본 스택 구현
public class ArrayStack {
	private int top;		// top 포인터
	private int capacity;	// 크기
	private int[] array;	// 스택을 구현할 자료구조
	
	public ArrayStack(){
		capacity = 1;
		array = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isStackFull(){
		return top == capacity-1;
	}
	
	public void push(int data){
		if(isStackFull()){
			System.out.println("Stack Overflow");
		}else{
			array[++top] = data;
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return 0;
		}else{
			return array[top--];
		}
	}
}
