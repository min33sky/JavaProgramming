package datastructure.tree;
/*
 * 이진 탐색 트리 실행
 */
public class BinarySearchTreeTest {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insertNode(5);
		tree.insertNode(8);
		tree.insertNode(7);
		tree.insertNode(10);
		tree.insertNode(9);
		tree.insertNode(11);
		
		tree.preorderTree(tree.rootNode, 0);
		tree.inorderTree(tree.rootNode, 0);
		tree.postorderTree(tree.rootNode, 0);
	}
}
