package datastructure.tree;
/*
 * 이진트리 테스트
 */
public class BinaryTreeTest {
	public static void main(String[] args) {
		BinaryNode<Integer> root = new BinaryNode<Integer>(10);
		BinaryNode<Integer> six = new BinaryNode<Integer>(6);
		BinaryNode<Integer> three = new BinaryNode<Integer>(3);
		BinaryNode<Integer> eight = new BinaryNode<Integer>(8);
		BinaryNode<Integer> one = new BinaryNode<Integer>(1);
		BinaryNode<Integer> sixteen = new BinaryNode<Integer>(16);
		BinaryNode<Integer> thirteen = new BinaryNode<Integer>(13);
		BinaryNode<Integer> eighteen = new BinaryNode<Integer>(18);
		
		root.setLeft(six);
		root.setRight(sixteen);
		six.setLeft(three);
		six.setRight(eight);
		three.setLeft(one);
		sixteen.setLeft(thirteen);
		sixteen.setRight(eighteen);
		
		System.out.println("전위 순회");
		preOrderPrintTree(root);
		System.out.println("중위 순회");
		inOrderPrintTree(root);
		System.out.println("후위 순회");
		postOrderPrintTree(root);
		
	}
	
	//전위 순회
	public static <E> void preOrderPrintTree(BinaryNode<E> node){
		if(node == null){
			return;
		}
		System.out.println("" + node.getData());
		preOrderPrintTree(node.getLeft());
		preOrderPrintTree(node.getRight());
	}
	//중위 순회
	public static <E> void inOrderPrintTree(BinaryNode<E> node){
		if(node == null){
			return;
		}
		inOrderPrintTree(node.getLeft());
		System.out.println("" + node.getData());
		inOrderPrintTree(node.getRight());
		
	}
	//후위 순회
	public static <E> void postOrderPrintTree(BinaryNode<E> node){
		if(node == null){
			return;
		}
		postOrderPrintTree(node.getLeft());
		postOrderPrintTree(node.getRight());
		System.out.println("" + node.getData());
		
	}
}
