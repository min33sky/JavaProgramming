package datastructure.tree;

public class LeftChildRightSiblingTree {
	public void append(Node parent, Node child){
		/*
			자식 노드가 없으면 자식 노드 생성
			자식 노드가 있으면 형제 노드 생성
		*/
		if(parent.getLeftChild() == null){
			parent.setLeftChild(child);
		}else{
			Node temp = parent.getLeftChild();
			// 다음 형제노드가 없을 때 까지 
			while(temp.getRightSibling() != null){
				temp = temp.getRightSibling();
			}
			temp.setRightSibling(child);
		}
	}
	
	public void printTree(Node node, int depth){
		for(int i=0; i<depth; i++){
			System.out.print("-");
		}
		System.out.println(node.getData());
		// 자식 노드 출력
		if(node.getLeftChild() != null){
			printTree(node.getLeftChild(), depth + 1);
		}
		// 형제 노드 출력
		if(node.getRightSibling() != null){
			printTree(node.getRightSibling(), depth);
		}
	}
}
