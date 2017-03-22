package algo.sorting;

import java.util.Arrays;

/**
 * 힙 정렬
 * nlogn
 * 힙이란 우선순위큐를 표현한 완전이진트리의 배열식 표현을 의미한다.
 * 기본적으로 힙의 i번 요소의 자식은 (2*i+1)번과 (2*i+2)번이다.
 * 
 *  1. n개의 노드에 대한 완전이진트리를 구성한다
 	2. 최대힙을 구성한다 (최대힙 : 부노드가 자노드보다 큰 트리)
 	3. 배열 마지막값과 배열 첫번째 값을 교환한다
 	4. 배열의 길이를 1 줄인 후 2,3을 반복한다
      -> 2번을 수행하게되면 배열의 첫번째 값에 가장 큰 값이 오게 되며 
      3번을 통해 큰값을 맨 뒤로 보낸 후 맨 뒷값을 제외하고 2,3번을 다시 반복하는 것이다.
 * @author Heo-MH
 *
 */
public class HeapSorting_New {
	public static void main(String[] args) {
		int[] arr = {2,8,6,1,10,15,3,12,11};
		System.out.println("원본 : " + Arrays.toString(arr));
		heapSort(arr);
		System.out.println("정렬 : " + Arrays.toString(arr));
	}

	/**
	 * 힙 정렬
	 * @param arr
	 */
	private static void heapSort(int[] arr) {
		
		System.out.println("maxHeap 만들기");
		// maxHeap을 만든다.
		for(int i=(arr.length/2)-1; i>=0; i--){
			maxHeap(arr, i, arr.length);
		}
		// 정렬
		
		// 최대값과 마지막값을 Swap
		// 마지막 값은 정렬에서 제외한다.
		int length = arr.length;
		System.out.println("정렬");
		while(length > 1){
			int temp = arr[0];
			arr[0] = arr[length-1];
			arr[length-1] = temp;
			length--;	// 마지막 값은 다음 정렬에서 제외시킨다.
			maxHeap(arr, 0, length);	// 힙 형태를 재 구성한다.
		}
	}

	/**
	 * 부모가 자식보다 항상 크다
	 * @param arr
	 */
	private static void maxHeap(int[] arr, int index, int length) {
		int parent = index;
		
		while(parent < length/2){		// 자식의 유무 판단
			int child = (parent*2)+1;	// 좌측 자식 노드
			// 우측 자식노드가 존재한고 우측 자식 노드가 크다면 우측 자식 노드를 가리킨다.
			if((child+1 < length) && (arr[child] < arr[child+1]))
				child++;

			// 부모노드가 크다면 힙 형태이므로 반복문 종료
			if(arr[parent] >= arr[child]) 
				break;
			
			// 자식이 크다면 교환
			int temp = arr[parent];
			arr[parent] = arr[child];
			arr[child] = temp;
			
			// 부모 노드 재설정
			parent = child;
		}
		System.out.println(Arrays.toString(arr));
	}
}
