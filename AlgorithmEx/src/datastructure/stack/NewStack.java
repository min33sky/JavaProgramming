package datastructure.stack;

/*
 * Generic Stack 
 */
public class NewStack<T> {
	private T[] stack;
	private int top;
	private int size;
	
	@SuppressWarnings("unchecked")
	public NewStack(int size) {
		stack = (T[]) new Object[size];
		top = -1;
		this.size = size;
		
	}
	// push
	public void push(T value) {
		top++;
		stack[top] = value;
	}
	// pop
	public T pop(){
		if(top < 0)
			throw new ArrayIndexOutOfBoundsException("Stack Underflow");
		
		return stack[top--];
	}
	// isEmpty
	public boolean isEmpty(){
		if(top <= -1)
			return true;
		return false;
	}
	// size
	public int size(){
		return top + 1;
	}
	
	// print
	public void print(){
		for(int i=0; i<size(); i++){
			System.out.print(stack[i] + " ");
		}
	}
	
	// full check
	public boolean isFull() {
		if(top == size-1){
			return true;
		}
		return false;
	}
}
