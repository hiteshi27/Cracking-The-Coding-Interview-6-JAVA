package dataStructures;

import dataStructures.CircularLinkedList.Node;

public class DoublyLinkedList<T> {
	Node<T> root=null;
	class Node<T>{
		T data;
		Node<T> next;
		Node<T> prev;
		Node(T d){
			data=d;
			next=null;
			prev=null;


		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n \n ===== New Linked List ===== \n \n");
		DoublyLinkedList<Integer> intList = new DoublyLinkedList<Integer>();

		//appendAfterLast nodes at end
		intList.appendAfterLast(10);
		intList.appendAfterLast(1);
		intList.appendAfterLast(2);
		intList.appendAfterLast(9);
		intList.printList();
	}
	public  void appendAfterLast(T data){
		
		Node<T> new_node=new Node<T>(data);
		if(root==null){
			root=new_node;
			
			System.out.println("\n>> Set root node : "+data);
			printList();
			return;
		}
		Node<T> last=root;
		while(last.next!=null){
			last=last.next;
		}
		;
		last.next=new_node;
		System.out.println("\n>> Append node : "+last.next.data);
		printList();
		return;
		
		
	}
	public void printList(){

		System.out.print("\n");
		Node<T> tempNode=root;
		while(tempNode!=null){

			System.out.print(tempNode.data+" --> ");
			tempNode=tempNode.next;
		}

		System.out.print("null");
		
	}
	
}
