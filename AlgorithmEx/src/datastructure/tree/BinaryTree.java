package datastructure.tree;
/**
 * 이진 탐색 트리 (Binary Search Tree)
 * @author Heo-MH
 *
 */
public class BinaryTree {
	Node rootNode = null;
	
	/**
	 * 노드 삽입
	 * @param element
	 */
	public void insertNode(int element){
		/*
		 * 루트가 빈 경우
		 * 즉, 아무 노드도 없는 경우에는 루트 노드로 지정한다.
		 */
		if(rootNode == null){
			rootNode = new Node(element);
		}else{
			Node head = rootNode;
			Node currentNode;
			
			/*
			 * CurrentNode는 현재 가리키는 Node
			 * Head는 다음 노드를 가리킨다.
			 */
			while(true){
				currentNode = head;
				/*
				 * 현재의 루트보다 작은 경우
				 * 왼쪽으로 탐색을 한다.
				 */
				if(element < head.value){
					head = head.leftChild;
					/*
					 * 왼쪽 자식 노드가 비어있는 경우
					 * 해당 위치에 추가할 노드를 삽입한다.
					 * 현재 currentNode head를 가리키고 있다.
					 */
					if(head == null){
						currentNode.leftChild = new Node(element);
						break;
					}
				}else{
					/*
					 * 현재의 루트보다 큰 경우
					 * 오른쪽으로 탐색을 한다.
					 */
					head = head.rightChild;
					/*
					 * 오른쪽 자식이 비어있는 경우
					 * 해당 위치에 추가할 노드를 삽입한다.
					 * 현재 currentNode head를 가리키고 있다.
					 */
					if(head == null){
						currentNode.rightChild = new Node(element);
						break;
					}
				}
			}
		}
	}
	
	/**
	 * 특정 노드 검색하기
	 * @param element
	 * @return
	 */
	public boolean search(int element){
		// 루트 노드가 비었을 경우에는 false
		if(rootNode == null){
			return false;
		}else{
			Node head = rootNode;
			Node currentNode = null;
			
			while(true){
				currentNode = head;
				// 기준이 되는 노드보다 작을 시 왼쪽 서브트리를 검색
				if(element < head.value){
					head = currentNode.leftChild;
					
					if(head == null){ // 해당 값이 없을 시 false
						return false;
					}
				}else if(element > head.value){
				// 기준이 되는 노드보다 클 시 오른쪽 서브트리를 검색
					head = currentNode.rightChild;
				
					if(head == null){ 	// 해당 값이 없을 시 false
						return false;
					}
				}else{
					// 해당 값이 존재하므로 True
					return true;
				}
			}
		}
	}
	
	/**
	 * 원하는 노드 삭제
	 * @param element
	 * @return
	 */
	public boolean removeNode(int element){
		Node removeNode = rootNode;		// 삭제할 노드
		Node parentOfRemoveNode = null;	// 삭제할 노드의 부모 노드
		
		/*
		 * 값 대소를 비교하며 탐색했을 때
		 * 잎 노드(Leaf Node)인 경우 삭제를 위한 탐색
		 */
		while(removeNode.value != element){
			parentOfRemoveNode = removeNode;
			
			/* 삭제할 값이 현재 노드보다 작으면 왼쪽을 탐색한다. */
			if(element < removeNode.value){
				removeNode = removeNode.leftChild;
			}else{
				removeNode = removeNode.rightChild;
			}
			
			// 삭제할 노드를 찾지 못한 경우 false
			if(removeNode == null)
				return false;
		}
		
		/* 
		 * 삭제할 노드의 자식 노드가 모두 없을 때는 
		 * 부모 노드에서 삭제할 노드를 null 처리한다.
		 */
		if(removeNode.leftChild == null && removeNode.rightChild == null) {
			/* 삭제 대상이 트리의 루트일 때 */
			if(removeNode == rootNode) {
				rootNode = null;
			} else if(removeNode == parentOfRemoveNode.rightChild) {
				parentOfRemoveNode.rightChild = null;
			} else {
				parentOfRemoveNode.leftChild = null;
			}
		} 
		
		/* 
		 * 삭제할 노드가 오른쪽 자식 노드만 존재하는 경우 
		 * */
		else if(removeNode.leftChild == null) {
			if(removeNode == rootNode) {
				rootNode = removeNode.rightChild;
			} else if(removeNode == parentOfRemoveNode.rightChild) {
				/*
				 * 삭제 대상의 오른쪽 자식 노드를 삭제 대상 위치에 둔다. 
				 */
				parentOfRemoveNode.rightChild = removeNode.rightChild;
			} else {
				parentOfRemoveNode.leftChild = removeNode.rightChild;
			}
		} 
		
		/* 왼쪽 자식 노드만 존재하는 경우 */
		else if(removeNode.rightChild == null) {
			if(removeNode == rootNode) {
				rootNode = removeNode.leftChild;
			} else if(removeNode == parentOfRemoveNode.rightChild) {
				parentOfRemoveNode.rightChild = removeNode.leftChild;
			} else {
				/*
				 * 삭제 대상의 왼쪽 자식을 삭제 대상 위치에 둔다.
				 */
				parentOfRemoveNode.leftChild = removeNode.leftChild;
			}
		} 
		
		/* 
		 * 두 개의 자식 노드가 존재하는 경우
		 * 1. 삭제할 노드의 왼쪽 서브 트리에 있는 가장 큰 값 노드를 올리거나
		 * 2. 오른쪽 서브 트리에 있는 가장 작은 값 노드를 올리면 된다.
		 * 구현 코드는 2번째 방법을 사용한다.
		 */
		else {
			/* 삭제 대상 노드의 자식 노드 중에서 대체될 노드(replaceNode)를 찾는다. */
			Node parentOfReplaceNode = removeNode;
			
			/* 삭제 대상의 오른쪽 서브 트리 탐색 지정 */
			Node replaceNode = parentOfReplaceNode.rightChild;
			
			while(replaceNode.leftChild != null) {
				/* 가장 작은 값을 찾기 위해 왼쪽 자식 노드로 탐색한다. */
				parentOfReplaceNode = replaceNode;
				replaceNode = replaceNode.leftChild;
			}

			/**
			 * 대체할 노드가 삭제할 노드의 오른쪽 자식노드가 아닐 경우에는
			 * 대체 노드의 부모노드는 대체 노드의 오른쪽 자식 노드를 가리키고
			 * 대체 노드의 오른쪽 자식 노드는 제거할 노드의 오른쪽 자식노드를 가리키게 만든다.
			 */
			if(replaceNode != removeNode.rightChild) {
				/* 
				 * 가장 작은 값을 선택하기 때문에 대체 노드의 왼쪽 자식은 빈 노드가 된다. 
				 */
				parentOfReplaceNode.leftChild = replaceNode.rightChild;
				
				/* 대체할 노드의 오른쪽 자식 노드를 삭제할 노드의 오른쪽으로 지정한다. */
				replaceNode.rightChild = removeNode.rightChild;
			}
			
			/* 삭제할 노드가 루트 노드인 경우 대체할 노드로 바꾼다. */
			if(removeNode == rootNode) {
				rootNode = replaceNode;
			} else if(removeNode == parentOfRemoveNode.rightChild) {
				parentOfRemoveNode.rightChild = replaceNode;
			} else {
				parentOfRemoveNode.leftChild = replaceNode;
			}
			
			/* 
			 * 대체된 노드의 왼쪽 자식 노드는 
			 * 삭제 대상 노드의 왼쪽 자식을 가리킨다.
			 */
			replaceNode.leftChild = removeNode.leftChild;
		}
		
		return true;
	}
	
	
	
	/**
	 * Pre Order Traverse
	 * 트리 모양을 그대로 전송하고 싶을 때 사용한다.
	 * 예) 바이트스트림으로 다른 서버로 전송하면 
	 *     다른 서버에서 동일한 트리를 만들 수 있다.
	 * @param root
	 * @param depth
	 */
	public void preorderTree(Node root, int depth){
		if(root != null){
			for(int i=0; i<depth; i++)
				System.out.print("--");
			System.out.println(root.value);
			preorderTree(root.leftChild, depth+1);
			preorderTree(root.rightChild, depth+1);
		}
	}
	
	/**
	 * Post Order Traverse
	 * 표현식 트리에서 후위 순회를 하면 후위표기식이 나온다.
	 * @param root
	 * @param depth
	 */
	public void postorderTree(Node root, int depth){
		if(root != null){
			postorderTree(root.leftChild, depth+1);
			postorderTree(root.rightChild, depth+1);
			for(int i=0; i<depth; i++)
				System.out.print("--");
			System.out.println(root.value);
		}
	}
	
	/**
	 * In Order Traverse
	 * 가장 작은 값부터 정렬이 된다.
	 * @param root
	 * @param depth
	 */
	public void inorderTree(Node root, int depth){
		if(root != null){
			inorderTree(root.leftChild, depth+1);
			for(int i=0; i<depth; i++)
				System.out.print("--");
			System.out.println(root.value);
			inorderTree(root.rightChild, depth+1);
		}
	}
	
}
