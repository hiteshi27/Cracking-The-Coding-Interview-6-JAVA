package chapter2_linked_lists;

import chapter2_linked_lists.LinkedList.Node;

/*
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.
 */
public class q4_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> intList = new LinkedList<Integer>();	
		intList.append(1);
		intList.append(12);
		intList.append(3);
		intList.append(34);
		intList.append(35);
		intList.append(36);
		intList.append(7);
		intList.append(8);
		intList.append(19);
		intList.append(1);
		 partition(9,intList);
		 intList.printList();
	}
	
	//push values less than x at the root, the higher ones and x(is in the list) will be automatically on the other side
	public static void partition(int x,LinkedList<Integer> intList){
		Node node=intList.root;
		Node before=null;
		Node after=null;
		if(node==null){
			return;
		}
		while(node.next!=null){
			if((int) node.next.data<x){
				 intList.printList();
				before=null;
					before=node.next;
					
					node.next=node.next.next;
					before.next=intList.root;
					intList.root=before;
				
				
			}else{
				node=node.next;
			}
		
		}
		
		
	}

}
