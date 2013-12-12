package com.facebook;

public class TwoNParenthesis {

	public static void main(String[] args) {
		BinaryTree theTree = new BinaryTree();
		theTree.n = 3;

		int count = 0;
		int leftNode = 0, rightNode = 0;

	}
}

class BinaryTree {
	Node root;
	int leftParenthesisCount;
	int rightParenthesisCount;
	int n;

	public void addNode(int count, String parenthesis) {
		Node newNode = new Node(count, parenthesis);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (n > leftParenthesisCount) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						leftParenthesisCount++;
						return;
					}
				} else if (n > focusNode.count && leftParenthesisCount > rightParenthesisCount) {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						rightParenthesisCount++;
						return;
					}
				}
			}
		}
	}

}

class Node {
	int count;
	String parenthesis;

	Node leftChild;
	Node rightChild;

	Node(int count, String parenthesis) {
		this.count = count;
		this.parenthesis = parenthesis;
	}
}
