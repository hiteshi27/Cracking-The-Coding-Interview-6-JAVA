package chapter3_stacks_and_queues;
/*
 * Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
composed of several stacks and should create a new stack once the previous one exceeds capacity.
SetOfStacks. push () and SetOfStacks. pop() should behave identically to a single stack
(that is, pop ( ) should return the same values as it would if there were just a single stack).
FOLLOW UP
Implement a function popAt (int index) which performs a pop operation on a specific substack.
 * 
 */
public class q3_StackOfPlates {
	int arr[];
	int top;
	int size;
	int count=1;
	public q3_StackOfPlates(int size){
		arr=new int[size];
		top=0;
		this.size=size;
	}

	public void push(int d){
		System.out.print("\n push : "+d);
		if(top<size-1){
			

			arr[top]=d;
			top+=1;
			return;
		}
		if(top==size-1){
			this.size+=(size/count);
			int newarr[]=new int[size];
			for(int i=0;i<top;i++){
				newarr[i]=arr[i];
			}
			arr=null;
			arr=new int[size];
			arr=newarr;
			
			arr[top]=d;
			top+=1;
			
			count+=1;
		}
		System.out.print("\n size : "+this.size);
		
	}
	
	
	public void printStack(){
		System.out.print("\n\n");
		for(int i=0;i<top;i++){
			System.out.print(arr[i]+" <-- ");
		}
		System.out.print("null");
	}
	
	public void popAt(int index){
		
		if(index==count){
			top=top-1;
		}
		else{
			System.out.print("\n pop : "+arr[((size/count)*2)-2]);
			for(int i=((size/count)*2)-2;i<top;i++){
				arr[i]=arr[i+1];
			}
			top=top-1;
		}
		
	}
	public void numberOfStacks(){
		System.out.print("\n\n number of stacks : " + count);
	}
	public static void main(String[] args) {
		q3_StackOfPlates stk1=new q3_StackOfPlates(4);
		
		stk1.push(11);
		stk1.push(12);
		stk1.push(13);
		stk1.push(14);
		
		stk1.push(15);
		stk1.push(16);
		stk1.push(11);
		stk1.push(12);
		
		stk1.push(13);
		stk1.push(14);
		stk1.push(15);
		stk1.push(16);
		stk1.push(11);
		stk1.printStack();
		stk1.numberOfStacks();
		
		stk1.popAt(2);
		stk1.printStack();
	}

}
