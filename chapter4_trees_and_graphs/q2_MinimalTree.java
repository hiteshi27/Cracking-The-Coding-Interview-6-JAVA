package chapter4_trees_and_graphs;

import java.util.ArrayList;
import java.util.List;

import chapter4_trees_and_graphs.minHeap.Node;

/*
 * Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an algorithm
to create a binary search tree with minimal height.
 */
public class q2_MinimalTree {

	Node root;

	q2_MinimalTree(){
		root=null;
	}

	class Node{
		int key;
		Node left,right;
		public Node(int d){

			key=d;
			left=right=null;
		}

	}


	public static void main(String[] args) {
		q2_MinimalTree BT=new q2_MinimalTree();
		int arr[]={0,1,2,3,4,5,6,7,8,9,10,11};
		BT.minHeightBT(arr,0,arr.length-1,BT.root);
		System.out.print("\n\n");
		BT.traverseInOrder(BT.root);
		System.out.print("\n\n");

		BT.traversePostOrder(BT.root);
		System.out.print("\n\n");

		BT.traversePreOrder(BT.root);

		System.out.print("\n root is : " +BT.root.key);
	}

	public  void minHeightBT(int arr[],int l,int r,Node node){

		if(l<=r){

			int rootElem=l+(r-l)/2;
//			System.out.println(arr[rootElem]);
			if(root==null){
				root=new Node(arr[rootElem]);
				node=root;
				minHeightBT(arr,rootElem+1,r,node);
				minHeightBT(arr,l,rootElem-1,node);
		
			}
			else{
				if(arr[rootElem]<node.key){	
					node.left=new Node(arr[rootElem]);
					minHeightBT(arr,l,rootElem-1,node.left);
					minHeightBT(arr,rootElem+1,r,node.left);

				}else{		
					node.right=new Node(arr[rootElem]);
					minHeightBT(arr,l,rootElem-1,node.right);
					minHeightBT(arr,rootElem+1,r,node.right);
				}
			}
			
	
		}
		
		return;

	}
	public void traverseInOrder(Node node){
		if(node!=null){


			traverseInOrder(node.left);
			System.out.print(" " + node.key);
			traverseInOrder(node.right);
		}

	}
	public void traversePostOrder(Node node){
		if(node!=null){

			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.key);
		}

	}
	public void traversePreOrder(Node node){
		if(node!=null){
			System.out.print(" " + node.key);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}

	}

}