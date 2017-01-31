package datastructure.tree;

public class BinaryNode<E> {
	private E data;
	private BinaryNode<E> left;
	private BinaryNode<E> right;
	
	public BinaryNode(E data){
		this.data = data;
	}
	
	public E getData(){
		return data;
	}
	
	public void setData(E data){
		this.data = data;
	}
	
	// 왼쪽 자식 노드 리턴
	public BinaryNode<E> getLeft(){
		return left;
	}
	
	// 왼쪽 자식 노드 설정
	public void setLeft(BinaryNode<E> left){
		this.left = left;
	}
	
	// 오른쪽 자식 노드 리턴
	public BinaryNode<E> getRight(){
		return right;
	}
	
	// 오른쪽 자시 노드 설정
	public void setRight(BinaryNode<E> right){
		this.right = right;
	}
}
