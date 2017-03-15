package javaBible_ex;

import java.util.Arrays;

public class Ex6_23 {
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{}));
	}

	private static int max(int[] arr) {
		if(arr == null || arr.length == 0){
			return -999999;
		}
		
		int max = arr[0];
		
		// 최대값
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		return max;
	}
}
