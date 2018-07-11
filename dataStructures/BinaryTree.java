package dataStructures;

public class BinaryTree {
	Node root;

	public BinaryTree(){
		root=null;
	}
	public BinaryTree(int d){
		root=new Node(d);
	}

	class Node{
		int key;
		Node left,right;
		public Node(int d){

			key=d;
			left=right=null;
		}

	}
	

}
