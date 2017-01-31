package datastructure.tree;

/*
 * 한개의 노드에 데이터, 자식포인터, 형제포인터 포함하는 트리
 */
public class LeftChildRightSiblingTest {
	public static void main(String[] args) {
		LeftChildRightSiblingTree tree = new LeftChildRightSiblingTree();
		Node root = new Node('A');
		Node B = new Node('B');
 		Node C = new Node('C');
 		Node D = new Node('D');
 		Node E = new Node('E');
 		Node F = new Node('F');
 		Node G = new Node('G');
 		Node H = new Node('H');
 		
 		tree.append(root, B);
 		tree.append(B, C);
 		tree.append(B, D);
 		tree.append(C, E);
 		tree.append(C, F);
 		tree.append(C, G);
 		tree.append(E, H);
 		
 		tree.printTree(root, 0);
	}
}
