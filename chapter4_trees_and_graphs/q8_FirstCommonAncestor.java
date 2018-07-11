package chapter4_trees_and_graphs;

import chapter4_trees_and_graphs.BinaryTree.Node;

/*
 * First Common Ancestor: Design an algorithm and write code to find the first common ancestor of two nodes 
 * in a binary tree. Avoid storing additional nodes in a data structure. NOTE:This is not necessarily a binary 
 * search tree.
 */
public class q8_FirstCommonAncestor {

	public static void main(String[] args) {
		BinaryTree BT =new BinaryTree(5);
		BinaryTree.Node node = BT.root;
		Integer pair[]=new Integer[2];
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		node.left= BT.new Node(3);
		node.right= BT.new Node(7);
		
		node.left.left= BT.new Node(2);
		node.left.right= BT.new Node(4);
		
		node.right.left= BT.new Node(6);
		node.right.right= BT.new Node(8);
		
		node.right.left.right= BT.new Node(0);
		node.right.left.left= BT.new Node(10);
		
		node.right.right.left= BT.new Node(9);
		node.right.right.right= BT.new Node(1);

		
		System.out.print("\n lowest common ancestor is : "+findCommonAncestor(BT.root,6,0,null));
		System.out.print("\n lowest common ancestor is : "+findCommonAncestor(BT.root,4,0,null));
		System.out.print("\n lowest common ancestor is : "+findCommonAncestor(BT.root,10,7,null));
		System.out.print("\n lowest common ancestor is : "+findCommonAncestor(BT.root,10,0,null));
		System.out.print("\n lowest common ancestor is : "+findCommonAncestor(BT.root,6,1,null));
		System.out.print("\n lowest common ancestor is : "+findCommonAncestor(BT.root,9,1,null));
	}

	public static Integer findCommonAncestor(Node node ,int p,int q,Integer ancestor) {
		if(node==null) {
			return ancestor;
		}
		
		if(findnode(node,p ) &&findnode(node,q) ) {

			 ancestor=node.key;
			
		}
		ancestor=findCommonAncestor(node.left,p,q,ancestor);
		ancestor=findCommonAncestor(node.right,p,q,ancestor);
		return ancestor;

	}
	public static boolean findnode(Node node, int k) {
		if(node==null) {
			return false;
		}
		if(k==node.key) {
			return true;
		}
		if(findnode(node.left,k)){
			return true;
		}
		if(findnode(node.right,k)) {
			return true;
		}
		boolean val=findnode(node.left,k);
		val=findnode(node.right,k);
		return val;
	}

	

}
