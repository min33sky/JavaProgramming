package algo.interview.chap03;

public class ThreeStack {
	int[] stack;
	int top1;
	int top2;
	int top3;
	int floor1;
	int floor2;
	int floor3;
	
	public ThreeStack(int size){
		stack = new int[size * 3];
		top1 = -1;
		top2 = top1 + size;
		top3 = top2 + size;
		floor1 = top1;
		floor2 = top2;
		floor3 = top3;
	}
	
	public void push(int selectStack, int val){
		if(selectStack == 1){
			if(top1 < floor1 || top1 >= top2)
				throw new ArrayIndexOutOfBoundsException();
			top1++;
			stack[top1] = val;
		}else if(selectStack == 2){
			if(top2 < floor2 || top2 >= top3)
				throw new ArrayIndexOutOfBoundsException();
			top2++;
			stack[top2] = val;
			
		}else if(selectStack == 3){
			if(top3 < floor3 || top3 >= stack.length)
				throw new ArrayIndexOutOfBoundsException();
			top3++;
			stack[top3] = val;
		}
	}
	
	public int pop(int selectStack){
		int value = 0;
		if(selectStack == 1){
			value = stack[top1];
			stack[top1] = 0;
			top1--;
		} else if(selectStack == 2){
			value = stack[top2];
			stack[top2] = 0;
			top2--;
			
		} else if(selectStack == 3){
			value = stack[top3];
			stack[top3] = 0;
			top3--;
		}
		return value;
	}
	
}
