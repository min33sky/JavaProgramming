package datastructure.tree;

/*
  수식트리
  1. 수식을 뒤에서부터 앞쪽으로 읽어나간다.
  2. 수식에서 제일 마지막 토큰은 루트 노드가 된다. 
  3. 수식에서 읽은 토큰이 연산자인 경우에는 가지 노드가 되며, 이 토큰 다음에 따라오는 두 개의 토큰은 각각 오른쪽 자식 노드와 왼쪽 자식 노드가 된다. 
     단, 다음 토큰에도 연속해서 연산자인 경우에는 이 토큰으로부터 만들어지는 하위 트리가 완성된 이후에 읽어낸 토큰이 왼쪽 자식 노드가 된다.
  4. 수식에서 읽은 토큰이 숫자이면 이 노드는 잎 노드이다.
 */
import java.util.Arrays;
import java.util.LinkedList;

public class ExpressionTree {
	private ExpressionNode root;

	public ExpressionNode getRoot() {
		return root;
	}

	public ExpressionTree(String postfixNotation) {
		LinkedList<String> tokens = new LinkedList<String>(
				Arrays.asList(postfixNotation.split(" ")));	// 배열을 List로 변경
		buildExpressionTree(tokens, root);
	}

	public void buildExpressionTree(LinkedList<String> tokens,
			ExpressionNode node) {
		if (tokens.peekLast() == null){	// 리스트에서 요소 확인
			return;
		}
		String tempToken = tokens.removeLast();


		switch (tempToken) {
			case "+":
			case "-":
			case "*":
			case "/":
				if (node == null){
					node = new ExpressionNode();
				}
				node.setData(tempToken);
				if (root == null){
					root = node;
				}
	
				node.setRight(new ExpressionNode());
				node.setLeft(new ExpressionNode());
				buildExpressionTree(tokens, node.getRight());
				buildExpressionTree(tokens, node.getLeft());
				break;
			default:
				node.setData(tempToken);
				break;
		}
	}

	public double evaluationTree(ExpressionNode node) {
		if (node == null)
			return 0.0;
		
		double result = 0.0;
		switch (node.getData()) {
			case "+":
				result = evaluationTree(node.getLeft())
						+ evaluationTree(node.getRight());
				break;
			case "-":
				result = evaluationTree(node.getLeft())
						- evaluationTree(node.getRight());
				break;
			case "*":
				result = evaluationTree(node.getLeft())
						* evaluationTree(node.getRight());
				break;
			case "/":
				result = evaluationTree(node.getLeft())
						/ evaluationTree(node.getRight());
				break;
	
			default:
				result = Double.parseDouble(node.getData());
				break;
		}
		return result;
	}

	/* 전위 순회 */
	public void preOrderPrintTree(ExpressionNode node) {
		if (node == null)
			return;
		System.out.print(node.getData() + " ");
		preOrderPrintTree(node.getLeft());
		preOrderPrintTree(node.getRight());
	}

	/* 중위 순회 */
	public void inOrderPrintTree(ExpressionNode node) {
		if (node == null)
			return;
		inOrderPrintTree(node.getLeft());
		System.out.print(node.getData() + " ");
		inOrderPrintTree(node.getRight());
	}

	/* 후위 순회 */
	public void postOrderPrintTree(ExpressionNode node) {
		if (node == null)
			return;
		postOrderPrintTree(node.getLeft());
		postOrderPrintTree(node.getRight());
		System.out.print(node.getData() + " ");
	}

	class ExpressionNode {
		private String data;
		private ExpressionNode left;
		private ExpressionNode right;

		public ExpressionNode() {
		}

		public ExpressionNode(String data) {
			this.data = data;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public ExpressionNode getLeft() {
			return left;
		}

		public void setLeft(ExpressionNode left) {
			this.left = left;
		}

		public ExpressionNode getRight() {
			return right;
		}

		public void setRight(ExpressionNode right) {
			this.right = right;
		}
	}
}
