package chapter4_trees_and_graphs;

import chapter4_trees_and_graphs.minHeap.Node;

public class BinaryTree {
	Node root;

	BinaryTree(){
		root=null;
	}
	BinaryTree(int d){
		root=new Node(d);
	}

	class Node{
		int key;
		Node left,right,parent;
		public Node(int d){

			key=d;
			left=right=parent=null;
		}

	}
	public void traverseInOrder(Node node){
		if(node!=null){
			traverseInOrder(node.left);
			System.out.print(" " + node.key);
			traverseInOrder(node.right);
		}

	}
	public void traversePreOrder(Node node){
		if(node!=null){
			System.out.print(" " + node.key);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}

	}
	public void traversePostOrder(Node node){
		if(node!=null){

			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.key);
		}

	}

}
