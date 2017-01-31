package datastructure.tree;
/*
 * 이진 탐색 트리 (BST)
 */
public class BinaySearchTreeTest {
	public static void main(String[] args) {
		BinarySearchTree mTree = new BinarySearchTree();
		int[] arr = {5, 1, 0, 3, 7, 6, 4, 2, 8};
		for(int i=0; i<arr.length; i++){
			mTree.insert(mTree.getRoot(), arr[i]); // root
		}
		
		System.out.println("PreOrder : ");
		PreOrderPrintTree(mTree.getRoot());
		System.out.println("");
		System.out.println("InOrder : ");
		InOrderPrintTree(mTree.getRoot());
		System.out.println("");
		System.out.println("PostOrder : ");
		PostOrderPrintTree(mTree.getRoot());
		System.out.println("");
		
		System.out.println("Search(4) " + mTree.search(mTree.getRoot(), 4));
		System.out.println("Search(9) " + mTree.search(mTree.getRoot(), 9));
		System.out.println("Search(8) " + mTree.search(mTree.getRoot(), 8));
		System.out.println("Search(-1) " + mTree.search(mTree.getRoot(), -1));
	}

	/* 전위 순회 */
	public static void PreOrderPrintTree(BinarySearchNode node) {
		if (node == null)
			return;
		System.out.print(" " + node.getValue());
		PreOrderPrintTree(node.getLeft());
		PreOrderPrintTree(node.getRight());
	}


	/* 중위 순회 */
	public static void InOrderPrintTree(BinarySearchNode node) {
		if (node == null)
			return;
		InOrderPrintTree(node.getLeft());
		System.out.print(" " + node.getValue());
		InOrderPrintTree(node.getRight());
	}

	/* 후위 순회 */
	public static void PostOrderPrintTree(BinarySearchNode node) {
		if (node == null)
			return;
		PostOrderPrintTree(node.getLeft());
		PostOrderPrintTree(node.getRight());
		System.out.print(" " + node.getValue());
	}
}

class BinarySearchTree {
	private BinarySearchNode root;

	public BinarySearchNode getRoot() {
		return root;
	}

	public void insert(BinarySearchNode node, int insertValue) {
		if(node == null){
			root = new BinarySearchNode(insertValue, null, null);
			return;
		}
		if (node.getValue() > insertValue) {
			if (node.getLeft() == null) {
				node.setLeft(new BinarySearchNode(insertValue, null, null));
			} else
				insert(node.getLeft(), insertValue);
		} else {
			if (node.getRight() == null) {
				node.setRight(new BinarySearchNode(insertValue, null, null));
			} else
				insert(node.getRight(), insertValue);
		}
	}
	
	public boolean search(BinarySearchNode node, int searchValue) {
		if (node.getValue() == searchValue) {
			return true;
		}
		// 해당 노드의 값보다 작으면 왼쪽 노드로 이동
		if (node.getValue() > searchValue && node.getLeft() != null) {
			return search(node.getLeft(), searchValue);
		}
		// 해당 노드의 값보다 크면 오른쪾 노드로 이동
		return node.getRight() != null && search(node.getRight(), searchValue);
	}

}

class BinarySearchNode {
	private int value;
	private BinarySearchNode left;
	private BinarySearchNode right;

	public BinarySearchNode() {

	}

	public BinarySearchNode(int value, BinarySearchNode left,
			BinarySearchNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BinarySearchNode getLeft() {
		return left;
	}

	public void setLeft(BinarySearchNode left) {
		this.left = left;
	}

	public BinarySearchNode getRight() {
		return right;
	}

	public void setRight(BinarySearchNode right) {
		this.right = right;
	}
}
