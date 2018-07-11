package dataStructures;

import chapter4_trees_and_graphs.minHeap;
import dataStructures.BinaryTree.Node;

public class BSTIterative {
	Node root;

	BSTIterative(){
		root=null;
	}
	BSTIterative(int d){
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
	
	public void add(int d) {
		Node node=new Node(d);
		if(root==null) {
			root = node;
			return;
		}
		Node q=root;
		while(q!=null) {
			if(d<q.key) {
				
				if(q.left==null) {
					q.left=node;
					return;
				}
				q=q.left;
			}
			else if(d>q.key) {
				if(q.right==null) {
					q.right=node;
					return;
				}
				q=q.right;
			}else {
				return;
			}
			
		}
		
			
	}
	public void traverseInOrder(Node node){
		if(node!=null){
			
			
			traverseInOrder(node.left);
			System.out.print(" " + node.key);
			traverseInOrder(node.right);
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTIterative heap=new BSTIterative();
		heap.add(6);
		heap.add(4);
		heap.add(8);
		heap.add(3);
		heap.add(5);
		heap.add(7);
		heap.add(9);
	
		System.out.print("\n\n in order : ");heap.traverseInOrder(heap.root);
	}

}
