package chapter3_stacks_and_queues;

import dataStructures.Stack;
import dataStructures.Stack.Node;

/*
 * Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
an additional temporary stack, but you may not copy the elements into any other data structure
(such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
 */
public class q5_SortStack {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		System.out.print("\n\n stack empty : "+stk.isEmpty());
		stk.push(4);
		stk.push(0);
		stk.push(2);
		stk.push(11);
		stk.push(19);
		stk.push(13);

		stk.printStack();
		sortStack(stk);
		stk.printStack();
		Stack<Integer> stk1=new Stack<Integer>();
		System.out.print("\n\n stack empty : "+stk.isEmpty());
		stk1.push(4);
		stk1.push(0);
		stk1.push(2);
		stk1.push(11);
		stk1.push(19);
		stk1.push(13);	
		sortStack2(stk1);
		//		stk.pop();
		stk1.printStack();
		//		stk.push(15);
		//		stk.printStack();
		//		stk.peek();
		//		System.out.print("\n\n stack empty : "+stk.isEmpty());
	}

	public static void sortStack(Stack<Integer> stk){
		Node node=stk.top;
		Node nodetemp=node;
		int temp=0;
		while(node.next!=null){
			nodetemp=stk.top;
			while(nodetemp.next!=null){
				if((int) nodetemp.data>(int)nodetemp.next.data){
					temp=(int) nodetemp.data;
					nodetemp.data=nodetemp.next.data;
					nodetemp.next.data=temp;
				}
				nodetemp=nodetemp.next;
			}	
			node=node.next;
		}
	}
	public static void sortStack2(Stack<Integer> stk){
		Stack<Integer> stktemp=new Stack<Integer>();
		int temp = 0;
		Node node=stk.top;
		Node nodetemp=stktemp.top;

		while(!stk.isEmpty()){
			temp=stk.popreturn();
			while(!stktemp.isEmpty()&&temp<stktemp.peekreturn()){
				stk.push(stktemp.popreturn());
			}
			stktemp.push(temp);
		}
		while(!stktemp.isEmpty()){
			stk.push(stktemp.popreturn());
		}

	}

}
