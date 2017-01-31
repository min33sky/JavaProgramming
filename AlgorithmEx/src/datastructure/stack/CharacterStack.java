package datastructure.stack;

public class CharacterStack {
	char[] stack;
	int top;
	
	public CharacterStack(int size){
		stack = new char[size];
		top = -1;
	}
	
	public void push(char data){
		stack[++top] = data;
	}
	 
	public char pop(){
		return stack[top--];
	}
	
	public boolean isEmpty(){
		return top == 0;
	}
}
