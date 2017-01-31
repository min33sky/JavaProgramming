package algo.queue;

import java.util.Scanner;

import datastructure.queue.Queue;

/*
 * Queue Test (https://www.acmicpc.net/problem/10845)
 */
public class QueueTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();	// 개행문자 미리 읽기
		
		Queue<Integer> queue = new Queue<Integer>();
		for(int i=0; i<count; i++){
			String input = sc.nextLine();
			command(queue, input);
		}
	}

	private static void command(Queue queue, String input) {
		String[] splits = input.split(" ");
		Integer result;
		
		switch(splits[0]){
			case "push":
				queue.enQueue(Integer.parseInt(splits[1]));
				break;
			case "pop":
				result = (Integer) queue.deQueue();
				if(result==null){
					System.out.println("-1");
				}else{
					System.out.println(result);
				}
				break;
			case "size":
				System.out.println(queue.getSize());
				break;
			case "empty":
				if(queue.isEmpty()){
					System.out.println("1");
				}else{
					System.out.println("0");
				}
				break;
			case "front":
				result = (Integer) queue.getFront();
				if(result == null){
					System.out.println("-1");
				}else{
					System.out.println(result);
				}
				break;
			case "rear":
				result = (Integer) queue.getRear();
				if(result == null){
					System.out.println("-1");
				}else{
					System.out.println(result);
				}
				break;
		}
	}
}
