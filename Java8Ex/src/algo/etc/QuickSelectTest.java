package algo.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * K 번째 수 (https://www.acmicpc.net/problem/11004)
 */
public class QuickSelectTest {
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		String[] inputConditions = bfReader.readLine().split(" ");
		int resultIndex = Integer.parseInt(inputConditions[1]);	// 찾을 수의 인덱스
		
		String[] inputs = bfReader.readLine().split(" "); // 숫자들 입력

		System.out.println(quickSelect(stringArrayToIntArray(inputs), resultIndex - 1));
	}

	private static Integer quickSelect(int[] array, int k) {
		int left = 0;
		int right = array.length - 1;
		Random rand = new Random();
		while (right >= left) {
			int pivotIndex = 
					partition(array, left, right, rand.nextInt(right - left + 1) + left);
			
			if (pivotIndex == k) {
				return array[pivotIndex];
			} else if (pivotIndex < k) {
				left = pivotIndex + 1;
			} else {
				right = pivotIndex - 1;
			}
		}
		return null;
	}

	private static int partition(int[] array, int left, int right, int pivot) {
		int pivotVal = array[pivot];
		swap(array, pivot, right);
		int storeIndex = left;
		for (int i = left; i < right; i++) {
			if (array[i] < pivotVal) {
				swap(array, i, storeIndex);
				storeIndex++;
			}
		}
		swap(array, right, storeIndex);
		return storeIndex;
	}

	public static void swap(int[] array, int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	// String[] -> int[] 변환
	private static int[] stringArrayToIntArray(String[] inputs) {
		int[] outputs = new int[inputs.length];
		for (int i = 0; i < inputs.length; i++) {
			outputs[i] = Integer.parseInt(inputs[i]);
		}
		return outputs;
	}
}
