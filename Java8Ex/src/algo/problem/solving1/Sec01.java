package algo.problem.solving1;

import java.util.Scanner;

/*
 * 10진수와 16진수 변환 프로그램
 */
public class Sec01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("10진수 -> 16진수 변환 프로그램이다.");
		System.out.println("10진수를 16진수로 바꾸려면 [a] 키를 누르고");
		System.out.println("16진수를 10진수로 바꾸려면 [b] 키를 누르세요.");
		System.out.print("a나 b를 누르세요 : ");
		String select = sc.nextLine();
		System.out.print("변환할 숫자를 입력하세요 : ");
		String number = sc.nextLine();

		change(select.charAt(0), number);
		System.out.println();
	}
	
	private static char getHex(int r) {
		switch(r){
		case 10: 
			return 'a';
		case 11:
			return 'b';
		case 12:
			return 'c';
		case 13: 
			return 'd';
		case 14:
			return 'e';
		case 15:
			return 'f';
		default:
			return (char) (r+48);
		}
	}

	private static void change(char select, String num) {
//		System.out.println(select + " " + num);
		if(select == 'a'){
			int number = Integer.parseInt(num);
			char[] arr = new char[20];
			int q, r;	// q : 몫, r : 나머지
			int index = 0;
			do{
				q = number/16;
				r = number%16;
				arr[index++] = getHex(r);
				number = q;
			}while(q>=16);
			
			if(q==0){	// 한자리 수일땐 뒤에 0이 배열에 추가되는걸 막는다.
				index--;
			}else{
				arr[index] = getHex(q);
			}
			
			// 역순으로 출력
			for(int i=index; i>=0; i--){
				System.out.print(arr[i]);
			}
			
		}else if(select == 'b'){

			
		}else{
			System.out.println("유효하지 않은 메뉴 입력");
		}
	}

}
