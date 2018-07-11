package chapter4_trees_and_graphs;

import java.util.*;
import java.util.LinkedList;



/*
 * List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes
at each depth (e.g., if you have a tree with depth D, you 'll have D linked lists).
 */
public class q3_ListOfDepths {

	public static void main(String[] args) {
		q2_MinimalTree BT=new q2_MinimalTree();
		int arr[]={0,1,2,3,4,5,6,7,8,9,10,11};
		BT.minHeightBT(arr,0,arr.length-1,BT.root);
		System.out.print("\n\n");
		BT.traversePreOrder(BT.root);
		nodeAtLevels(BT);

	}

	public static void nodeAtLevels(q2_MinimalTree BT){
		LinkedList<q2_MinimalTree.Node> Q=new LinkedList<>();	
		LinkedList<LinkedList<Integer>> list=new LinkedList<>();
		Q.push(BT.root);
		list=levelRecurse(Q,list) ;
		printLL(list);

	}
	public static LinkedList<LinkedList<Integer>> levelRecurse(LinkedList<q2_MinimalTree.Node> Q,LinkedList<LinkedList<Integer>> list ) {
		q2_MinimalTree.Node s=null;
		LinkedList<q2_MinimalTree.Node> Qnext=new LinkedList<>();
		LinkedList<Integer> arr=new LinkedList<>();
		if(Q==null) {
			return list;
		}
		while(!Q.isEmpty()) {
			s=Q.poll();
			if(s.left!=null)
				Qnext.push(s.left);
			if(s.right!=null)
				Qnext.push(s.right);
			//			System.out.println(s.key);
			arr.add(s.key);

		}
		list.add(arr);
		if(!Qnext.isEmpty()) {
			levelRecurse(Qnext,list) ;
		}

		return list;
	}
	public static void printLL(	LinkedList<LinkedList<Integer>> list) {
		for(LinkedList<Integer> L:list) {
			System.out.println("\n");
			for(int k: L) {
				System.out.print(" "+k);	
			}
		}
	}

}