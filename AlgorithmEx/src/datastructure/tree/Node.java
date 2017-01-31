package datastructure.tree;
/*
 * 노드 클래스
 */
public class Node {
	int value;
	Node rightChild;
	Node leftChild;

	public Node(int value){
		this.value = value;
		this.leftChild = this.rightChild = null;
	}
}
