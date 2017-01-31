package datastructure.queue;

public class StackWithTwoQueues {
	LinkedQueue queue1;
	LinkedQueue queue2;
	
	public StackWithTwoQueues(){
		queue1 = new LinkedQueue();
		queue2 = new LinkedQueue();
	}
	
	public void push(int data){
		if(queue1.isEmpty()){
			queue2.enqueue(data);
		}else{
			queue1.enqueue(data);
		}
	}
	
	public int pop() throws Exception{
		int i=0, size=0;
		if(queue2.isEmpty()){
			size = queue1.size();
			while(i<size-1){
				queue2.enqueue(queue1.dequeue());
				i++;
			}
			return queue1.dequeue();
		}else{
			size = queue2.size();
			while(i<size-1){
				queue1.enqueue(queue2.dequeue());
				i++;
			}
			return queue2.dequeue();
		}
	}
}
