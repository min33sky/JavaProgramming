package org.opentutorials.javatutorials.exception;

public class Calculator {
	int left, right;
	
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void divide() throws DivideException{
		if(right == 0){
			throw new DivideException("0으로 나눌 수 없습니다.", this.left, this.right);
		}
		System.out.println(this.left / this.right);
	}
}
