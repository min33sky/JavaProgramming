package algo.problem.solving1;

/*
 * 소수 구하기
 */
public class Sec06 {
	public static void main(String[] args) {
		System.out.println("2부터 1000 사이의 수 중에서 소수를 구하는 프로그램");
		int count = 0;
		int[] arr = new int[1001];
		for(int i=2; i<arr.length; i++){
			arr[i] = i;
		}
		
		for(int start=2; start*start <= 1000; start++){
			if(arr[start] == 0) continue;
			
			for(int i=start*start; i<=1000; i=i+start){
				arr[i] = 0;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0){
				count++;
				System.out.print(arr[i] + " ");
				if(count%8 == 0){
					System.out.println();
				}
			}
		}
		System.out.println("\n1부터 1000 사이의 소수는 " + count + "개이다.");
	}
}
