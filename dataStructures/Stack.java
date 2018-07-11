package dataStructures;

import dataStructures.LinkedList.Node;

public class Stack<T> {
	 public Node<T> top;
	T min;
	public static class Node<T>{
	
		public T data=null;
		 public Node<T> next;
		Node(T data){
			this.data=data;
			next=null;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		System.out.print("\n\n stack empty : "+stk.isEmpty());
		stk.push(11);
		stk.push(12);
		stk.push(13);
		stk.push(14);
		stk.printStack();
		stk.pop();
		stk.printStack();
		stk.push(15);
		stk.printStack();
		System.out.print("\n\n stack empty : "+stk.isEmpty());
	}
	
	public void push(T d){
		Node node=new Node(d);
		System.out.print("\n push : "+node.data);
		
		if(top==null){
			top=node;
			return;
		}
		node.next=top;
		top=node;
		
	}
	public void pushQ(T d){
		Node node=new Node(d);
//		System.out.print("\n push : "+node.data);
		
		if(top==null){
			top=node;
			return;
		}
		node.next=top;
		top=node;
		
	}
	public void pushNode(Node node){
	
//		System.out.print("\n push : "+node.data);
		
		if(top==null){
			top=node;
			return;
		}
		node.next=top;
		top=node;
		
	}
	
	public void pop(){
		System.out.print("\n\n pop : "+top.data);
		top=top.next;
	
	}
	public T popreturn(){
		System.out.print("\n\n pop : "+top.data);
		T temp=top.data;
		top=top.next;
		return (T) temp;
	
	}
	
	public void peek(){
		System.out.print("\n\n top : "+top.data);
	}
	public T peekreturn(){
//		System.out.print("\n\n top : "+top.data);
		return top.data;
	}
	
	public Boolean isEmpty(){
		return top==null;
	}
	public void printStack(){
		Node node=top;
		System.out.print("\n\n ");
		
		while(node!=null){
			
			System.out.print(node.data+" <-- ");
			node=node.next;
		}
		System.out.print("null");
	}
	public void printStackQ(){
		Node node=top;
		System.out.print("\n\n ");

		while(node!=null){

			System.out.print("  -- > "+node.data);
			node=node.next;
		}
		System.out.print(" --> ");
		
	}

	
}
