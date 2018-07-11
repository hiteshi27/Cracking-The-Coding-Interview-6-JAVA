package dataStructures;



public class Queue<T> {
	Node<T> front;
	Node<T> last;

	private static class Node<T>{

		private T data=null;
		private Node<T> next;
		Node(T data){
			this.data=data;
			next=null;

		}


	}
	public static void main(String[] args) {
		Queue<Integer> q=new Queue<Integer>();
		System.out.print("\n\n stack empty : "+q.isEmpty());
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		System.out.print("\n\n stack empty : "+q.isEmpty());
		q.printQueue();
		q.remove();
		q.remove();

		q.printQueue();
	}
	public void add(T d){
		Node node=new Node(d);
		System.out.print("\n\n add : "+node.data);
		if(front==null){
			front=node;
			last=node;
			return;
		}
		last.next=node;
		last=node;



	}

	public void remove(){
		System.out.print("\n\n remove : "+front.data);
		front=front.next;

	}

	public void peek(){
		System.out.print("\n\n front : "+front.data);
	}

	public Boolean isEmpty(){
		return front==null;
	}
	public void printQueue(){
		Node node=front;
		System.out.print("\n\n");

		while(node!=null){

			System.out.print(" < -- "+node.data);
			node=node.next;
		}
		System.out.print(" <-- null");
	}
}
