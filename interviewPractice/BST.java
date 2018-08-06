package interviewPractice;

public class BST {

	
	public static void main(String[] args) {
	/*
	 *      3
	 *     /\
	 *    1  5
	 *   /\   \
	 *  0  2   6
	 *          \
	 *           7
	 *            \
	 *             8
	 */
		Tree BT=new Tree();
		BT.addNode(3);
		BT.addNode(1);
		BT.addNode(2);
		BT.addNode(0);
		BT.addNode(5);
		BT.addNode(6);
		BT.addNode(7);
		BT.addNode(8);
		System.out.print("\n");
		BT.inOrder(BT.root);
		System.out.print("\n");
		BT.preOrder(BT.root);
		System.out.print("\n");
		BT.postOrder(BT.root);

	}

}
class Tree{
	Node root;
	class Node{
		int key;
		Node left,right;
		public Node(int key) {
			this.key=key;
			left=null;
			right=null;
		}

	}
	public Tree() {
		root=null;
	}
	public void addNode(int key) {
		if(root==null) {
			root=new Node(key);
			return;
		}
		Node node=root;
		while(node!=null) {
			if(node.key>key) {
				if(node.left==null) {
					node.left=new Node(key);
					return;
				}
				node=node.left;
			}
			if(node.key<key) {
				if(node.right==null) {
					node.right=new Node(key);
					return;
				}
				node=node.right;
			}
		}
	}
	public void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(" "+node.key);
		inOrder(node.right);
	}
	public void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(" "+node.key);
		preOrder(node.left);
		preOrder(node.right);

	}
	public void postOrder(Node node) {
		if(node==null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(" "+node.key);
	}
}