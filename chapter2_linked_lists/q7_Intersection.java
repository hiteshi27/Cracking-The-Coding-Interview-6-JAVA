package chapter2_linked_lists;

import chapter2_linked_lists.LinkedList.Node;

/*
 * Intersection: Given two (singly) linked lists, determine if the two lists intersect.
 *  Return the inter- secting node. Note that the intersection is defined based on reference, not value. That is,
 *   if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list,
 *    then they are intersecting.
 */
public class q7_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> L1 = new LinkedList<Integer>();	
		L1.append(7);
		L1.append(1);
		L1.append(6);
		

		LinkedList<Integer> L2 = new LinkedList<Integer>();	
		L2.append(5);
		L2.append(9);
		L2.append(2);
		L2.append(1);
		L2.append(0);	
		Node n1=L1.root;
		Node n2=L2.root;
		n2.next.next=n1.next;
		
		System.out.println("\n has intersection : "+findIfIntersect( n1,  n2) );
	}
	public static Boolean findIfIntersect(Node n1,Node  n2) {
		if(n1.next==n2||n2.next==n1) {
			return true;
		}
		while(n1!=null||n2!=null) {
			
			while(n2!=null) {
				if(n1.next==n2.next) {
					return true;
				}
				n2=n2.next;
			}
			n1=n1.next;
		}
		return false;
	}
}
