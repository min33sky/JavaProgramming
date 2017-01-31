package datastructure.stack;

// 동적 배열을 이용한 스택 구현
public class DynArrayStack {
	private int top;
	private int capacity;
	private int[] array;
	
	public DynArrayStack(){
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
			doubleStack();	// 공간을 2배 늘린다.
		}
		array[++top] = data;
	}

	private void doubleStack() {
		int[] newArray = new int[capacity*2];
		System.arraycopy(array, 0, newArray, 0, capacity);	// 배열 복사
		capacity = capacity*2;	// 크기를 2배로 재설정
		array = newArray;		// 새로운 배열을 참조한다.
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack Empty");
			return 0;
		}
		return array[top--];
	}
	
	public void deleteStack(){
		top = -1;
	}
}
