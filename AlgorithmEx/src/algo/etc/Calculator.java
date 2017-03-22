package algo.etc;

import java.util.Stack;

/**
 * 계산기
 * @author Heo-MH
 *
 */
public class Calculator {
	public static void main(String[] args) {
		String exp = "2+3*4+2";
		System.out.println(postfix1(exp));
		int sum = calc(postfix1(exp));
		System.out.println(sum);
	}
	
	/**
	 * 계산기
	 * @param exp
	 * @return
	 */
	public static int calc(String exp){
		
		Stack<Integer> stack = new Stack<Integer>();
		int result = 0;
		// 1. 스택에 피연산자를 넣는다.
		// 2. 연산자 순서일때는 스택에 있는 2개의 수를 Pop()해서 계산한다.
		// 3. 계산한 수를 다시 push한다.
		// 4. 스택에 남은 마지막 값이 답이다.
		for(int i=0; i<exp.length(); i++){
			char ch = exp.charAt(i);
			if(ch >= '0' && ch <= '9'){		// 0~9일 경우
				int num = ch - '0';			// 문자형을 숫자로 바꾸기
				stack.push(num);			// 스택에 PUSH
			}else{	
				// 연산자일 경우 스택에서 2개를 POP()한다.
				int arr[] = new int[2];
				for(int j=0; j<2; j++){
					arr[j] = stack.pop();
				}
				result = operation(arr, ch);	// 연산자와 피연산자들을 보내서 계산한다.
				stack.push(result); 			// 결과값을 스택에  다시 push
				System.out.println("합 : "  +  result);
			}
		}
		
		return result;
	}
	
	/**
	 * 연산
	 * @param i
	 * @param ch
	 * @return
	 */
	private static int operation(int[] arr, char ch) {
		int result = 0;
		switch(ch){
			case '+':
				result = arr[0] + arr[1];
				break;
			case '-':
				result = arr[0] - arr[1];
				break;
			case '*':
				result = arr[0] * arr[1];
				break;
			case '/':
				result = arr[0] / arr[1];
				break;
		}
		return result;
	}

	/**
	 * 후위 표기법
	 * @param expression
	 * @return
	 */
	public static String postfix1(String expression){
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<expression.length(); i++){
			char ch = expression.charAt(i);
			if(ch != '+' && ch != '-' && ch != '*' && ch != '/'){	// 숫자는 스택에 넣지 않는다.
				sb.append(ch);
			}else{	// 연산자는 스택에 넣는다. 스택 top에 있는 연산자보다 우선순위가 낮은 연산자가 스택에 들어올땐 모두 pop한다.
				if(stack.isEmpty() || stack.peek() == '+' || stack.peek() == '-'){
					stack.push(ch);
				}else if(stack.peek() == '*' || stack.peek() == '/'){
					if(ch == '+' || ch == '-'){	// 모두 pop
						while(!stack.isEmpty()){
							char op = stack.pop();
							sb.append(op);
						}
						stack.push(ch);
					}else{
						stack.push(ch);
					}
				}
			}
		}
		// 스택에 남아있는 연산자들을 모두 POP한다.
		if(!stack.isEmpty()){
			while(!stack.isEmpty()){
				sb.append(stack.pop());
			}
		}
		
		return sb.toString();
	}
	
}
