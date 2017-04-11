package algo.etc;

import java.util.Stack;
/**
 * 후위 표기법 (Postfix Notation)
 * @author Heo-MH
 *
 */
public class PostfixNotation {

	public static void main(String[] args) {
		String expression1 = "2+3*4+2"; // 234*+2+
		String expression2 = "(3+2)*(3+2*4)-1"; // 32+324*+*1-
		System.out.println("2+3*4+2   =>   " + postfix1(expression1));
		System.out.println("(3+2)*(3+2*4)-1   =>   " + postfix2(expression2));
	}
	
	/**
	 * 괄호 없는 한자리수 후위 표기식
	 * @param expression
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
	
	/**
	 * 괄호 있는 후위 표기식
	 * 괄호가 열린곳에서 닫히기까지 모두 PUSH한후  닫는 괄호에서 POP한다.
	 * @param expression
	 */
	public static String postfix2(String exp){
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		// 괄호가 열리면 그전에 있던것들을 우선순위 상관없이 pop하지 않는다.
		// 괄호가 닫히면 다 pop한다.
		for(int i=0; i<exp.length(); i++){
			char ch = exp.charAt(i);
			
			if(ch == ')'){	// 닫힌 괄호가 올때는 스택에 있는 값들을 모두 POP
				while(!stack.isEmpty()){
					char val = stack.pop();
					if(val != '('){			// 여는 괄호는 포함시키지 않는다.
						sb.append(val);
					}
				}
			}else if(ch >= '0' && ch <= '9'){	// 숫자일 경우 스택에 넣지 않는다.
				sb.append(ch);
			}else{
				if(stack.isEmpty() || stack.peek() == '+' || stack.peek() == '-' ||
															 stack.peek() == '('){
					stack.push(ch);
				}else if(stack.peek() == '*' || stack.peek() == '/'){
					if(ch == '+' || ch == '-'){
						while(!stack.isEmpty()){	// 기존 스택값들을 모두 POP
							sb.append(stack.pop());
						}
						stack.push(ch);				// 연산자를 스택에 PUSH
					}else{
						stack.push(ch);				// 연산자를 스택에 PUSH
					}
				}
				
			}
		}
		
		// 스택에 남이있는 값들을 pop()
		if(!stack.isEmpty()){
			while(!stack.isEmpty()){
				sb.append(stack.pop());
			}
		}

		return sb.toString();
	}
	
}
