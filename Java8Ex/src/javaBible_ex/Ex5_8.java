package javaBible_ex;

public class Ex5_8 {
	public static void main(String[] args) {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++){
			int number = answer[i];
			counter[number-1]++;
		}
		
		for(int i=0; i<counter.length; i++){
			int count = counter[i];
			System.out.print(count);
			for(int j=0; j<count; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
