package datastructure.tree;

public class BST {
	// 루트 노드
	public MyNode root;
	
	/**
	 * 노드에 삽입
	 * @param data
	 */
	public void insert(int data){
		if(root == null){					// 트리가 비어있을 때
			root = new MyNode(data);		// 루트 노드로 설정
		}else{
			MyNode cur = root;				// 루트노드를 현재 노드로 설정
			
			while(cur != null){				// 현재 노드가 null이 아니라면
				if(cur.data > data){		// 현재 값보다 더 작을경우 왼쪽 서브트리로
					if(cur.left == null){	// 비어있다면 노드 추가하고 종료
						cur.left = new MyNode(data);
						break;
					}
					cur = cur.left;			// 비어 있지 않다면 현재 노드를 다음 노드로 이동
				}else if(cur.data < data){	// 클 경우 오른쪽 서브트리로
					if(cur.right == null){	// 비어있다면 노드 추가하고 종료
						cur.right = new MyNode(data);
						break;
					}
					cur = cur.right;		// 비어 있지 않다면 현재 노드를 다음 노드로 이동
				}
			}
		}
		
	}
	
	/**
	 * 검색
	 * @param data
	 * @return
	 */
	public boolean search(int data){
		// 만약 트리가 비어있다면
		if(root == null){
			return false;
		}else{
			MyNode cur = root;
			
			while(cur != null){
				if(cur.data == data){
					return true;
				}else if(cur.data < data){
					cur = cur.right;
				}else if(cur.data > data){
					cur = cur.left;
				}
			}
		}
		return false;
	}

	/**
	 * 삭제
	 * @param data
	 * @return
	 */
	public boolean remove(int data){
		if(root == null){	// 빈 트리일 때
			return false;  
		}else{
			MyNode cur = root;		// 현재 노드(삭제할 노드)
			MyNode parent = root;	// 현재 노드의 부모 노드(삭제 노드의 부모)
			// 값이 있는지 없는지 체크
			while(cur != null){
				if(cur.data == data){		// 삭제할 노드가 존재하면 반복문 종료
					break;
				}else if(cur.data > data){
					if(cur.left == null){
						System.out.println("삭제할 값이 없다.");
						return false;
					}
					parent = cur;
					cur = cur.left;
				}else if(cur.data < data){
					if(cur.right == null){
						System.out.println("삭제할 값이 없다.");
						return false;
					}
					parent = cur;
					cur = cur.right;
				}
			}
			
			/// 삭제
			
			if(cur.left == null && cur.right == null){	// 자식이 없을 때
				if(cur == parent.left){
					parent.left = null;
				}else{
					parent.right = null;
				}
			}else if(cur.left == null){	// 자식이 1개일때(왼쪽, 오른쪽)
				parent.right = cur.right;
			}else if(cur.right == null){
				parent.left = cur.left;
			}else{	// 자식이 2개일때
				MyNode replaceParent = cur.right;		// 교체 노드의 부모
				MyNode replaceCur = cur.right;		// 교체 노드
				while(replaceCur.left != null){
					if(replaceCur.left == null){
						break;
					}else{
						replaceParent = replaceCur;
						replaceCur = replaceCur.left;
					}
				}
				
				
				// 교체되는 노드가 오른쪽 자식 노드를 갖고 있을 경우 자식 노드를 연결
				if(replaceCur.right != null){
					replaceParent.left = replaceCur.right;
				}else{	// 없을때는 노드를 삭제한다.
					replaceParent.left = null;
				}
				
				// swap
				replaceCur.right = cur.right;
				replaceCur.left = cur.left;
				parent.right = replaceCur;
			}
		}
		
		return true;
	}
	
	
	public void preOrder(MyNode node, int depth){
		if(node != null){
			for(int i=0; i<depth; i++){
				System.out.print("--");
			}
			System.out.println(node.data);
			preOrder(node.left, depth+1);
			preOrder(node.right, depth+1);
		}
	}
	// inOrder
	public void inOrder(MyNode node, int depth){
		if(node != null){
			inOrder(node.left, depth+1);
			for(int i=0; i<depth; i++){
				System.out.print("==");
			}
			System.out.println(node.data);
			inOrder(node.right, depth+1);
		}
	}
	
	// postOrder
	public void postOrder(MyNode node, int depth){
		if(node != null){
			postOrder(node.left, depth+1);
			postOrder(node.right, depth+1);
			for(int i=0; i<depth; i++){
				System.out.print("==");
			}
			System.out.println(node.data);
		}
	}
}
