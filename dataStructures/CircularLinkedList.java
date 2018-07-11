package dataStructures;

import java.util.Iterator;

import dataStructures.LinkedList.Node;



public class CircularLinkedList<T> implements Iterable<T>{
	Node<T> node=null;
	class Node<T>{
		T data;
		Node<T> next;
		Node(T d){
			data=d;
			next=null;


		}
	}
	public static void main(String[] args) {
		System.out.println("\n \n ===== New Linked List ===== \n \n");
		CircularLinkedList<Integer> intList = new CircularLinkedList<Integer>();

		//appendAfterLast nodes at end
		intList.appendAfterLast(10);
		intList.appendAfterLast(1);
		intList.appendAfterLast(2);
		intList.appendAfterLast(9);
		
		intList.appendAfterLast(29);
		intList.appendAtBeginning(11);
		intList.appendAtBeginning(22);
		intList.insertAfter(11,100);
		intList.insertAfter(111,100);
	
		intList.delete(1);

		intList.delete(2);
		intList.printList();
		
		intList.splitIntwoHalves();
		//Print list
		
	}


	public  void appendAfterLast(T data){
		Node<T> new_node=new Node<T>(data);
		if(node==null){
			node=new_node;
			node.next=new_node;
			node=node.next;
			System.out.println("\n>> Set root node : "+data);
			printList();
			return;
		}

		Node<T> last=node.next;
		new_node.next=last;
		node.next=new_node;
		node=node.next;
		System.out.println("\n>> append After Last node : "+node.data);
		printList();
		return;



	}
	
	public  void insertAfter(T data,T newdata){
		Node<T> new_node=new Node<T>(newdata);
		if(node==null){
			node=new_node;
			node.next=new_node;
			node=node.next;
			System.out.println("\n>> Set root node : "+newdata);
			printList();
			return;
		}
		Node<T> temp=node;
		while(temp.next!=node){
				if(temp.data==data){
					
					new_node.next=temp.next;
					temp.next=new_node;
					System.out.println("\n>> insert node : "+newdata);
					printList();
					return;
				}
				temp=temp.next;
		}
		if(temp.next==node&&temp.data==data){
		new_node.next=node;
		temp.next=new_node;
		printList();
		return;
		}
		System.out.println("\n\n>> did not find : "+data+" to insert next to\n");
		printList();
		return;



	}
	
	public  void appendAtBeginning(T data){
		Node<T> new_node=new Node<T>(data);
		if(node==null){
			node=new_node;
			node.next=new_node;
			node=node.next;
			System.out.println("\n>> Set root node : "+data);
			printList();
			return;
		}

		Node<T> first=node.next;
	
		node.next=new_node;
		new_node.next=first;
		System.out.println("\n>> append At Beginning node : "+node.data);
		printList();
		return;



	}

	public void delete(T data){

		Node<T> prev=node;
		Node<T> temp=node.next;
		
		while(prev.next!=node){

			if(temp.data.equals(data)){
				printList();
				System.out.println("\n \n>> deleting : " +data);
				if(temp==prev){
					node=node.next;
					return;

				}
				prev.next=temp.next;
				return;
			}
			prev=temp;
			temp=temp.next;

		}
		if(temp.data.equals(data)){
			printList();
			System.out.println("\n \n>> deleting : " +data);
			if(temp==prev){
				node=node.next;
				return;

			}
			prev.next=temp.next;
			return;
		}
		System.out.println("\n>> Did not find '"+data+"' in the List");


	}

	public void printList(){

		System.out.print("\n");
		System.out.print(" --> ");
		Node<T> tempNode=node.next;

		while(tempNode.next!=node.next){

			System.out.print(tempNode.data+" --> ");
			tempNode=tempNode.next;
		}
		if(tempNode.next==node.next){
			System.out.print(tempNode.data+" --> ");
		}
		
	}
	
	public void splitIntwoHalves(){

		Node<T> node1=node;
		Node<T> node2=node;
		Node<T> tempNode=node.next;
		int count=0;
		while(tempNode!=node){

			count++;
			tempNode=tempNode.next;
		}
		if(tempNode.next==node.next){
			count++;
		}
		System.out.println("\n length is : "+count);
		if(count%2==0){
			count=count/2;
		}
		else{
			count=(count/2)+1;
		}
		while(count!=0){
			node1=node1.next;
			count=count-1;
		}
		node2=node1.next;
		node1.next=node.next;
		node.next=node2;
		node2=node;
		printList(node1);
		printList(node2);
		
		
	}
	public void printList(Node N){

		System.out.print("\n");
		System.out.print(" --> ");
		Node<T> tempNode=N.next;

		while(tempNode.next!=N.next){

			System.out.print(tempNode.data+" --> ");
			tempNode=tempNode.next;
		}
		if(tempNode.next==N.next){
			System.out.print(tempNode.data+" --> ");
		}
		
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
