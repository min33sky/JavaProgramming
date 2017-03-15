package javaBible_ex;

public class Ex4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int temp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		while(temp != 0){
			result = (temp % 10) + (result * 10);
			temp = temp / 10;
		}
		
		if(number == result){
			System.out.println(number + "는 회문수입니다.");
		}else{
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}
}
