package algo.interview.chap03;

public class MinStack {
	int[] stack;
	int[] mins;
	int top1;
	int top2;
	int min;
	boolean firstValue;
	
	public MinStack(int size){
		stack = new int[size];
		mins = new int[size];
		min = 0;
		top1 = -1;
		top2 = -1;
	}
	
	public void push(int val){
		stack[++top1] = val;
		
		if(!firstValue){
			min = val;
			firstValue = !firstValue;
		}
		
		if(val < min){
			mins[++top2] = min;
			min = val;
		}else if(val >= min){
			mins[++top2] = min;
		}
	}
	
	public int pop(){
		int value = stack[top1];
		stack[top1--] = 0;
		min = mins[top2--];
		return value;
	}
	
	public int getMin(){
		return min;
	}
}
