package datastructure.tree;

public class BinaryTree {
	private BinaryNode rootNode;
	private BinaryNode tempRpptNode;
	
	public BinaryNode getRoot() {
		return rootNode;
	}

	public void add(String parentNode, String leftNode, String rightNode) {
		// 루트 노드가 없다면 루트 노드 생성
		if(rootNode == null){
			rootNode = new BinaryNode(parentNode);
			if(!leftNode.equals(".")){
				rootNode.setLeft(new BinaryNode(leftNode));
			}
			if(!rightNode.equals(".")){
				rootNode.setRight(new BinaryNode(rightNode));
			}
		}else{
			setTempNode(rootNode, parentNode);
			if(!leftNode.equals(".")){
				tempRpptNode.setLeft(new BinaryNode(leftNode));
			}
			if(!rightNode.equals(".")){
				tempRpptNode.setRight(new BinaryNode(rightNode));
			}
		}
	}

	// 자식 노드를 추가 할 부모 노드를 찾는다.
	private void setTempNode(BinaryNode node, String search) {
		if(node.getData().equals(search)){
			tempRpptNode = node;
			return;
		}
		// 왼쪽 자식노드에서 검색
		if(node.getLeft() != null){
			setTempNode(node.getLeft(), search);
		}
		// 오른쪾 자식노드에서 검색
		if(node.getRight() != null){
			setTempNode(node.getRight(), search);
		}
	}

	public void preOrderPrintTree(BinaryNode node) {
		if(node == null){
			return;
		}
		System.out.print("" + node.getData());
		preOrderPrintTree(node.getLeft());
		preOrderPrintTree(node.getRight());
	}

	public void inOrderPrintTree(BinaryNode node) {
		if(node == null){
			return;
		}
		inOrderPrintTree(node.getLeft());
		System.out.print("" + node.getData());
		inOrderPrintTree(node.getRight());
		
	}

	public void postOrderPrintTree(BinaryNode node) {
		if(node == null){
			return;
		}
		postOrderPrintTree(node.getLeft());
		postOrderPrintTree(node.getRight());
		System.out.print("" + node.getData());
	}

}
