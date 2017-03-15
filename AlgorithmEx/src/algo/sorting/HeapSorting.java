package algo.sorting;

/*
 ********************* 힙 정렬 ****************************************************************** 
 * 힙이란 우선순위큐를 표현한 완전이진트리의 배열식 표현을 의미한다.
 * 기본적으로 힙의 i번 요소의 자식은 (2*i)번과 (2*i +1)번이다.
 * 
 *  1. n개의 노드에 대한 완전이진트리를 구성한다
 	2. 최대힙을 구성한다 (최대힙 : 부노드가 자노드보다 큰 트리)
 	3. 배열 마지막값과 배열 첫번째 값을 교환한다
 	4. 배열의 길이를 1 줄인 후 2,3을 반복한다
      -> 2번을 수행하게되면 배열의 첫번째 값에 가장 큰 값이 오게 되며 
      3번을 통해 큰값을 맨 뒤로 보낸 후 맨 뒷값을 제외하고 2,3번을 다시 반복하는 것이다.
 */
public class HeapSorting {
	public static void main(String[] args)  {
//		int[] array = new int[7] ;
//		for (int i=0; i<array.length; i++) 
//			array[i] = ((int)(Math.random() * 25) ) +1;
		int[] array = {5,3,4,1,2,0,6};
		printArray(array);
		System.out.println("============================");
		heapSort(array);
		System.out.println("============================ 최종 결과");
		printArray(array);
	}

	public static void heapSort(int[] arr) {
		int length = arr.length;
		/* 2*n이 왼쪽 자식노드 위치이므로 배열의 절반 이상 인덱스는 
		   자식이 없으므로 반복 대상에서 제외
		*/   
		for (int k = length / 2; k > 0; k--) {
			downHeap(arr, k, length);
		}
		System.out.println("### 1~2번 최대 힙 구성 완료 ###\n");
		do{
			System.out.print("### 2~4번 반복 과정 : ");
			int temp = arr[0];
			arr[0] = arr[length-1];
			arr[length-1] = temp; 
			// 제일 큰 숫자가 젤 뒤로 갔으니 정렬 대상에서 제외한다.
			length = length-1;
			downHeap(arr, 1, length);	// len은 정렬 될 위치를 나타낸다.
		}while (length>1);
	}

	// 트리 재구성 함수 (가장 큰 수가 가장 첫번째 인덱스)
	private static void downHeap(int arr[], int start, int length){
		int temp = arr[start-1];
		while (start <= length/2){	// 자식의 존재 여부 판별
			// 오른쪽 자식->왼쪽자식->루트순으로 비교
			int child = 2 * start; 
			// 왼쪽, 오른쪽 자식을 비교해서 더 큰 값을 가지는 자식을
			if ((child < length) && (arr[child-1] < arr[child])) child++;
			
			// temp와 비교해서 temp가 크면 적절한 위치이므로 끝
			if (temp >= arr[child-1]) break;
			
			// 자식이 클 경우엔 자식을 부모 자리로 이동
			arr[start-1] = arr[child-1];
			start = child;
			
		}
		// 자식이 크면 start-1은 자식 위치 아니면 start-1은 부모 위치 그대로
		arr[start-1] = temp;
		printArray(arr);
	}

	static void printArray(int[] array) {
		for (int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

}
