package javaBible_ex;

import javax.swing.JOptionPane;

public class ArrayEx16 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;		// 사용자 입력을 저장할 공간
		String temp = "";	// 사용자 입력을 저장할 임시공간
		int count = 0;		// 시도횟수를 세기위한 변수
		
		do{
			count++;
			temp = JOptionPane.showInputDialog("1~100사이의 숫자를 입력하세요. 끝내려면 -1을 입력하세요.");
			
			// 사용자가 취소버튼을 누르거나 -1을 입력하면 do-while문을 벗어난다.
			if(temp==null || temp.equals("-1")) break;
			
			System.out.println("입력값 : " + temp);
			
			// 사용자입력을 문자열로 받아오기 때문에 int로 변환해 주어야한다.
			input = Integer.parseInt(temp);
			
			if(answer > input){
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer < input){
				System.out.println("더 작은 수를 입력하세요.");
			}else{
				System.out.println("정답...");
				System.out.println("시도횟수는 " + count + "번입니다.");
				JOptionPane.showMessageDialog(null, "정답!!!\n시도횟수는 " + count + "번입니다.", 
													"축하합니다.", JOptionPane.PLAIN_MESSAGE);
				break;
			}
		}while(true);
	}
}
