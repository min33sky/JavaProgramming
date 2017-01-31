package algo.problem.solving2;

import java.awt.event.FocusAdapter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 숫자 순환
 */
public class Sec05 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input");
		BufferedReader br = new BufferedReader(fr);
		int testNum = Integer.parseInt(br.readLine());

		for(int i=0; i<testNum; i++){
			int[] arr = new int[testNum];
			String[] temp = br.readLine().split(" ");
			arr[0] = Integer.parseInt(temp[0]);
			arr[1] = Integer.parseInt(temp[1]);
			circulation(arr, arr[0], arr[1]);
		}
	}

	private static void circulation(int[] arr, int initNumber, int powerNumber) {
		int[] calculatedNumber = new int[100000];
		int[] foundFlag = new int[100000];
		int solution = 0;

		while(true){
			int tempNumber = 0;
			
			while(initNumber != 0){
				int digit = initNumber % 10;	// 1의 자리
				initNumber = initNumber / 10;	// 10의 자리
				
				// 주어진 powerNumber 값만큼 곱함
				if(powerNumber >= 2){
					for(int i=2; i<= powerNumber; i++)
						digit *= digit;
				}
				tempNumber += digit;
			}
			initNumber = tempNumber;
			// 이미 있는 숫자이면 반복문에서 빠져나온다.
			if(foundFlag[initNumber] == 1)
				break;
			// 없는 숫자이면 배열에 추가시켜준다.
			foundFlag[initNumber] = 1;
			calculatedNumber[solution++] = initNumber;	
		}
		
		for(int i=0; i<solution; i++){
			// 연산으로 구한 숫자가 반복되면 for문을 빠져나옴
			if(initNumber == calculatedNumber[i]){
				// 처음 숫자를 포함해야 하기때문에 1을 더한다.
				System.out.println("반복 되기 전 숫자 개수 : " + (i+1));
				break;
			}
		}

//		// foundFlag 배열의 초기화
//		for(int i=0; i<solution; i++){
//			foundFlag[calculatedNumber[i]] = 0;
//		}
	}
}
