package algo.etc;

/*
 * 이진 탐색
 */
public class BinarySearchTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
			
		System.out.println("search(3) : " + binarySearch(arr, 3));
		System.out.println("search(9) : " + binarySearch(arr, 9));
	}

	private static boolean binarySearch(int[] inputs, int search) {
		
		boolean flag = false;
		int left = 0;
		int right = inputs.length - 1;
		while(left <= right){
			int middle = (left+right) / 2;
			if(inputs[middle] > search){
				right = middle - 1; 	// 찾는 값이 중앙값보다 작다면
			}else if(inputs[middle] < search){
				left = middle + 1;		// 찾는 값이 중앙값보다 크다면
			}else{
				flag = true;
				break;
			}
		}
		
		return flag;
	}
}
