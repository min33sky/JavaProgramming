package algo.problem.solving1;
/*
 * 지그재그 숫자 출력하기
 */
public class Sec07 {
	public static void main(String[] args) {
		System.out.println("지그재그 숫자 출력 프로그램");
		int MaxLine = 5;
		for(int lineNumber = 1; lineNumber <= MaxLine; lineNumber++){
			if(lineNumber % 2 != 0){	// 홀수행
				for(int i= 5*(lineNumber-1)+1; i<=5*(lineNumber-1)+5; i++){
					System.out.printf("%2d ", i);
				}
			}else{						// 짝수행
				for(int i=(5*lineNumber); i>(5*lineNumber)-5; i--){
					System.out.printf("%2d ", i);
				}
			}
			System.out.println();
		}
	}
}
