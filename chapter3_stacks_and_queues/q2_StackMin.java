package chapter3_stacks_and_queues;



/*
 * Stack Min: How would you design a stack which, in addition to push and pop, has a function min
which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 */
public class q2_StackMin {
	Node top;
	int min;
	private static class Node{
	
		private Integer data=null;
		private Node next;
		Node(Integer data){
			this.data=data;
			next=null;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		q2_StackMin stk=new q2_StackMin();
		System.out.print("\n\n stack empty : "+stk.isEmpty());
		stk.push(11);
		stk.push(12);
		stk.push(13);
		stk.push(14);
		stk.printStack();
		stk.pop();
		stk.printStack();
		stk.push(15);
		System.out.print("\n\n stack empty : "+stk.isEmpty());
	}
	
	public void push(Integer d){
		Node node=new Node(d);
		System.out.print("\n\n push : "+node.data);
		

		if(top==null){
			min=d;
			top=node;
			return;
		}		System.out.print("\n min is : "+min(d));
		node.next=top;
		top=node;
		
	}
	public int min(int data){
		if(data<min){
			min=data;
		}
		return min;
	}
	public void pop(){
		System.out.print("\n\n pop : "+top.data);
		top=top.next;
	
	}
	
	public void peek(){
		System.out.print("\n\n top : "+top.data);
	}
	
	public Boolean isEmpty(){
		return top==null;
	}
	public void printStack(){
		Node node=top;
		System.out.print("\n\n ");
		
		while(node.next!=null){
			
			System.out.print(node.data+" <-- ");
			node=node.next;
		}
		System.out.print("null");
	}
}
