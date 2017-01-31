package org.opentutorials.javatutorials.exception;

/*
 * unchecked Exception -> Runtime Exception이 유일
 * : 예외 상황이 발생한 시점에서 그냥 프로그램을 종료하는것이 더 안전할 때 사용
 * checked Exception
 * : 컴파일러가 강제로 예외처리를 요구함
 */
public class DivideException extends Exception {

	public int left;
	public int right;
	
	public DivideException() {
		super();
	}
	
	DivideException(String message){
		super(message);
	}
	
	DivideException(String message, int left, int right){
		super(message);
		this.left = left;
		this.right = right;
	}
}
