package javaBible_ex;

import java.util.Stack;

public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("1.다음");
		goURL("2.구글");
		goURL("3.트위치");
		goURL("4.아프리카");
		
		printStatus();
		
		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();
		
		goURL("javachobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();
		
	}

	private static void goBack() {
		if(!back.empty()){
			forward.push(back.pop());
		}
	}

	private static void goForward() {
		if(!forward.empty()){
			back.push(forward.pop());
		}
	}

	private static void goURL(String url) {
		back.push(url);
		if(!forward.empty()){
			forward.clear();
		}
		
	}

	private static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("현재화면은 ;'" + back.peek() + "' 입니다.");
		System.out.println();
	}
	
	
}
