package datastructure.tree;

import java.util.Scanner;

/*
 * 트리 순회 (https://www.acmicpc.net/problem/1991)
 */
public class TreeOrderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		BinaryTree tree = new BinaryTree();
		
		for(int i=0; i<count; i++){
			String input = sc.nextLine();
			String[] inputs = input.split(" ");
			tree.add(inputs[0], inputs[1], inputs[2]);
		}
		
		tree.preOrderPrintTree(tree.getRoot());
		System.out.println();
		tree.inOrderPrintTree(tree.getRoot());
		System.out.println();
		tree.postOrderPrintTree(tree.getRoot());
		System.out.println();
	}
}
