package chapter2_linked_lists;

import java.util.ArrayList;
import java.util.List;

import chapter2_linked_lists.LinkedList.Node;

/*
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 */
public class q6_Palindrome {

	public static void main(String[] args) {

		LinkedList<Integer> intList = new LinkedList<Integer>();	
		intList.append(1);
		intList.append(2);
		intList.append(3);
		intList.append(4);
		intList.append(5);
		intList.append(5);
		intList.append(4);
		intList.append(3);
		intList.append(2);
		intList.append(1);
		System.out.println("\n\n is palindrome : "+palindrome(intList.root,intList.root));
		intList.printList();

	}
	public static Boolean palindrome(Node node,Node ahead){
		Node node1=node;
		LinkedList<Integer> list= new LinkedList<Integer>();	
		if(node==null){
			return false;
		}
		int count=1;
	

		while(node.next!=null){

			if(count==1){
				ahead=ahead.next;
			}else{
				ahead=ahead.next.next;
			}
			count+=1;

			
			if(ahead.next==null||ahead.next.next==null){
				node=node.next;

				break;
			}
			node=node.next;

		}
		
		while(node!=null) {
			list.push((int)node.data);
			node=node.next;
		}
		Node node2=list.root;
		while(node1!=null&&node2.next!=null) {
			if(node1.data!=node2.data) {
				System.out.println("\n "+node1.data+","+node2.data);	
				return false;
			}
			node1=node1.next;node2=node2.next;
		}
		list.printList();
		
return true;
	}
}
