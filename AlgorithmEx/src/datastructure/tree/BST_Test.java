package datastructure.tree;

public class BST_Test {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(27);
		tree.insert(14);
		tree.insert(10);
		tree.insert(19);
		tree.insert(35);
		tree.insert(31);
		tree.insert(42);
		tree.insert(30);
		tree.insert(40);
		tree.insert(45);
		
		tree.preOrder(tree.root, 0);
		
//		System.out.println(tree.search(35));
//		System.out.println(tree.search(10));
//		System.out.println(tree.search(350));
//		
//		System.out.println(tree.remove(3333));
		System.out.println("노드 삭제");
		System.out.println(tree.remove(35));
		tree.preOrder(tree.root, 0);
	}
}
