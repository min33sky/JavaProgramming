package datastructure.tree;
/*
 * LeftChildRightSibling Tree Node
 */
public class Node {
	private char data;
	private Node leftChild;		// 자식
	private Node rightSibling;	// 형제
	
	public Node(char data){
		this.data = data;
	}
	
	public char getData(){
		return data;
	}
	
	public void setData(char data){
		this.data = data;
	}
	
	public Node getLeftChild(){
		return leftChild;
	}
	
	public void setLeftChild(Node leftChild){
		this.leftChild = leftChild;
	}
	
	public Node getRightSibling(){
		return rightSibling;
	}
	
	public void setRightSibling(Node rightSibling){
		this.rightSibling = rightSibling;
	}

}
