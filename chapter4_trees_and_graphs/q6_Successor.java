package chapter4_trees_and_graphs;

import chapter4_trees_and_graphs.BinaryTree.Node;
import java.util.*;
/*
 * Successor: Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a
binary search tree. You may assume that each node has a link to its parent.
 */
public class q6_Successor {

	public static void main(String[] args) {
		BinaryTree BT =new BinaryTree(5);
		BinaryTree.Node node = BT.root;
		Integer pair[]=new Integer[2];
		LinkedList<Integer> list=new LinkedList<Integer>();
		node.left= BT.new Node(3);node.left.parent=BT.root;
		node.right= BT.new Node(7);node.right.parent=BT.root;
		node.left.left= BT.new Node(2);node.left.left.parent=node.left;
		node.left.right= BT.new Node(4);node.left.right.parent=node.left;
		node.right.left= BT.new Node(6);node.right.left.parent=node.right;
		node.right.right= BT.new Node(8);node.right.right.parent=node.right;
		//				BT.traverseInOrder(node);
//		list.push(BT.root.key);
//		System.out.print("\n next element is " +traverseInOrderFindNext(BT.root, 3,list));
		System.out.print("\n next element is 2 " +traverseInOrderFindNext1(BT.root, 2,pair)[1]);
		pair=new Integer[2];
		System.out.print("\n next element is 3 " +traverseInOrderFindNext1(BT.root, 3,pair)[1]);
		pair=new Integer[2];
		System.out.print("\n next element is 4 " +traverseInOrderFindNext1(BT.root, 4,pair)[1]);
		pair=new Integer[2];
		System.out.print("\n next element is 5 " +traverseInOrderFindNext1(BT.root, 5,pair)[1]);
		pair=new Integer[2];
		System.out.print("\n next element is 6 " +traverseInOrderFindNext1(BT.root, 6,pair)[1]);
		pair=new Integer[2];
		System.out.print("\n next element is 7 " +traverseInOrderFindNext1(BT.root, 7,pair)[1]);
		pair=new Integer[2];
		System.out.print("\n next element is 8 " +traverseInOrderFindNext1(BT.root, 8,pair)[1]);

	}
	public static LinkedList<Integer>  traverseInOrderFindNext(Node node,Integer key,LinkedList<Integer> list){
		
		if(node==null){
			return list;
		}

		System.out.print("\n");

		if(node!=null){
			list=traverseInOrderFindNext(node.left,key,list);
			list.push(node.key);
			list=traverseInOrderFindNext(node.right,key,list);

		}

		return list;
	}
	
public static Integer[]  traverseInOrderFindNext1(Node node,Integer key,Integer pair[]){

		
		if(node!=null){
			
			pair=traverseInOrderFindNext1(node.left,key,pair);

			if(pair[0]==key) {
//				System.out.println("\n0 "+pair[0]);
//				System.out.println("1 "+pair[1]);
			
				return pair; 
			}
			pair[0]=pair[1];
			pair[1]=node.key;
			
			pair=traverseInOrderFindNext1(node.right,key,pair);

		}

		return pair;
	}
}
