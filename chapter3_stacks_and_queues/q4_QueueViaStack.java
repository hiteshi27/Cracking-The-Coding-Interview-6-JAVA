package chapter3_stacks_and_queues;

import dataStructures.Stack;





/*
 * Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks
 */
public class q4_QueueViaStack<T>{

	Stack<T> S1=new Stack<T>();
	Stack<T> S2=new Stack<T>();
	dataStructures.Stack.Node<T> front;
	dataStructures.Stack.Node<T> last;

	private static class Node<T>{

		private T data=null;
		private Node<T> next;
		Node(){
			this.data=data;
			next=null;

		}



	}

	public static void main(String[] args) {
		q4_QueueViaStack<Integer> Q=new q4_QueueViaStack<Integer>();
		Q.push(11);
		Q.push(12);
		Q.push(13);
		Q.push(14);
		Q.printQueue();


		Q.pop();
	
		Q.push(16);
	
		Q.pop();
	}
	public void push(T data){
		System.out.print("\n push : "+data);
		if(S1.isEmpty()){
			S1.pushQ(data);
			return;
		}
		S1.pushQ(data);
		


	}
	public void pop(){
		S2=null;
		S2=new Stack<T>();
		if(S1.isEmpty()){			
			return;
		}
		dataStructures.Stack.Node<T> node=S1.top;
		while(node!=null){

			S2.pushQ(node.data);

			node=node.next;

		}
		S2.pop();
		S1=null;
		S1=new Stack<T>();
		
		node=S2.top;
		while(node!=null){


			S1.pushQ(node.data);
			node=node.next;


		}
		printQueue();

	}



	public void printQueue(){
		S1.printStackQ();
	}

}
