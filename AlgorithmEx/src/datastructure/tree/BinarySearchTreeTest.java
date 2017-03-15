package datastructure.tree;
/*
 * 이진 탐색 트리 실행
 */
public class BinarySearchTreeTest {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insertNode(27);
		tree.insertNode(14);
		tree.insertNode(35);
		tree.insertNode(10);
		tree.insertNode(19);
		tree.insertNode(31);
		tree.insertNode(42);
		tree.insertNode(30);
		tree.insertNode(40);
		tree.insertNode(45);
		
		System.out.println("============= Pre Order Traverse ==============");
		tree.preorderTree(tree.rootNode, 0);
//		tree.postorderTree(tree.rootNode, 0);
		System.out.println("============= 35를 삭제 =============");
		tree.removeNode(35);
		tree.preorderTree(tree.rootNode, 0);
		System.out.println("============= 가장 작은 값부터 정렬 (In Order Traverse) ===============");
		tree.inorderTree(tree.rootNode, 0);
		System.out.println("============= 40을 검색한다. ===============");
		System.out.println(tree.search(40));
		System.out.println("============= 41을 검색한다. ===============");
		System.out.println(tree.search(41));
	}
}
