package datastructure.tree;
/**
 * Node Class
 * @author Heo-MH
 *
 */
public class Node {
	int value;
	Node rightChild;
	Node leftChild;

	public Node(int value){
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}
}
