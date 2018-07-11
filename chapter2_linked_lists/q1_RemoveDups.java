package chapter2_linked_lists;
/*
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
 */
import java.util.HashMap;
import java.util.HashSet;

import chapter2_linked_lists.LinkedList.Node;

public class q1_RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> intList = new LinkedList<Integer>();

		//append nodes at end
		intList.append(10);
		intList.append(1);
		intList.append(2);
		intList.append(1);
		intList.append(10);
		intList.append(21);
		intList.append(10);

		removeDuplicatesWithoutBuffer(intList);
		intList.printList();
		//append nodes at end
		intList.append(10);
		intList.append(1);
		intList.append(2);
		intList.append(1);
		intList.append(10);
		intList.append(21);
		intList.append(10);
		removeDuplicatesWithBuffer(intList);
		//Print list
		intList.printList();

	}
	public static void removeDuplicatesWithoutBuffer(LinkedList<Integer> intList){
		System.out.println("\n\nremove duplicates ");
		Node current = intList.root;
		Node temp = intList.root;

		while(current!=null){


			temp=current;
			while(temp.next!=null){
				if(temp.next.data==current.data){
					temp.next=temp.next.next;

				}else{
					temp=temp.next;

				}

			}

			current=current.next;

		}



	}
	public static void removeDuplicatesWithBuffer(LinkedList<Integer> intList){
		System.out.println("\n\nremove duplicates ");
		Node current = intList.root;
		Node prev=null;
		HashSet<Integer> map=new HashSet<Integer>();

		while(current!=null){

		
				if(map.contains(current.data)){
					prev.next=current.next;
				}else{
					map.add((Integer) current.data);
					prev=current;

				}

			current=current.next;

		}



	}
}
