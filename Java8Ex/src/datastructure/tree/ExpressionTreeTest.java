package datastructure.tree;

import java.util.Scanner;

/*
 * 수식 트리
 */
public class ExpressionTreeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String postfixNotation = sc.nextLine();
		
		System.out.println("Input PostfixNotation : " + postfixNotation);
		ExpressionTree tree = new ExpressionTree(postfixNotation);

		System.out.println("PreOrderPrintTree");
		tree.preOrderPrintTree(tree.getRoot());
		System.out.println("");

		System.out.println("InOrderPrintTree");
		tree.inOrderPrintTree(tree.getRoot());
		System.out.println("");

		System.out.println("PostOrderPrintTree");
		tree.postOrderPrintTree(tree.getRoot());
		System.out.println("");
		
		System.out.println("EvaluationTree");
		System.out.println("Result : " + tree.evaluationTree(tree.getRoot()));
	}
}
