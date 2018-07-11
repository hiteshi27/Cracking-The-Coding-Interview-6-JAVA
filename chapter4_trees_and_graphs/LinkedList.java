package chapter4_trees_and_graphs;



import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

	Node<T> root;
	class Node<T>{
		T data;
		Node<T> next;
		Node(T d){
			data=d;
			next=null;


		}
	}

	public static void main(String[] args) {

		//		//declare linked list object
		//		System.out.println("\n \n ===== New Linked List ===== \n \n");
		//		LinkedList<String> strList = new LinkedList<String>();
		//
		//		//append nodes at end
		//		strList.append("root");
		//		strList.append("one");
		//		strList.append("two");
		//
		//		//insert at beginning
		//		strList.push("ZERO");
		//		//insert at position
		//		strList.insert("TEN", 4);
		//
		//		//Delete
		//		strList.delete("twso");
		//		strList.delete("one");
		//
		//		//Print list
		//		strList.printList();
		System.out.println("\n \n ===== New Linked List ===== \n \n");
		LinkedList<Integer> intList = new LinkedList<Integer>();

		//append nodes at end
		intList.append(10);
		intList.append(1);
		intList.append(2);
		intList.append(9);
		intList.append(21);

		//insert at beginning
		intList.push(5);
		//insert at position
		intList.insert(4, 4);

		//Delete
		intList.delete(8);
		intList.delete(1);


		//reverse list
		intList.reverse();		
		//swap
		intList.swap(2,10);
		intList.swap(2,7);

		int count=0;
		for (Iterator<Integer> listIter = intList.iterator(); listIter.hasNext();) {
			Integer i =  listIter.next();
			System.out.println(i);
			

		}
		//Print list
		intList.printList();

		System.out.println("\n>> Print reverse\n");
		intList.printReverse(intList.root);

		//		llist.root  = new Node<T>("root");
		//		llist.root=addNodeAtBeginning(llist.root,new Node<T>("root"));
		//		//declare nodes
		//		Node<T> second = new Node<T>("one");
		//		Node<T> third = new Node<T>("two");
		//
		//		//add to list
		//		llist.root.next=second;
		//		second.next=third;
		//
		//		//add new node to linked list		
		//		addAtEnd(llist.root,new Node<T>("three"));
		//		addAtEnd(llist.root,new Node<T>("four"));
		//		llist.root=addNodeAtBeginning(llist.root,new Node<T>("ZERO"));
		//		addNodeAtPosition(9,llist.root,new Node<T>("TEN"));
		//		//Print list


	}
	public Node getNext(Node node){
		return node.next;
	}
	public boolean isEmpty(){
		return root == null;

	}
	public class TermIterator implements Iterator<T> {

		Node<T> node=root;	

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return node.next!=null;
		}
		@Override
		public T next() {
			// TODO Auto-generated method stub	
			if(hasNext()){
								
				T result = (T) node.next.data;		
				node=node.next;
								
					return result;			
				}

			return null;
		}
		



	}
	@Override
	public Iterator<T> iterator() {		
		return new TermIterator();	
	}

	//INSERT


	//Append Node<T>
	public  void append(T data){
		Node<T> newNode=new Node<T>(data);
		if(root==null){
			root=newNode;
			System.out.println("\n>> Set root node : "+data);
			printList();
			return;
		}

		Node<T> last=root;
		while(last.next!=null){
			last=last.next;
		}
		;
		last.next=newNode;
		System.out.println("\n>> Append node : "+last.next.data);
		printList();
		return;

	}

	//Push
	public void push(T data){
		Node<T> newNode=new Node<T>(data);
		if(root==null){
			root=newNode;
//			System.out.println("\n>> Set root node : "+data);
//			printList();
			return;

		}


		newNode.next=root;
		root=newNode;
//		System.out.println("\n>> Add node at Root : "+root.data);
//		printList();
		return;
	}

	//Insert at Position
	public void insert(T data, int pos){
		int count=0;

		Node<T> node=root;
		while(count!=pos-2&&node.next!=null){

			node=node.next;
			count=count+1;

		}
		Node<T> newNode=new Node<T>(data);
		System.out.println("\n>> Add node '"+newNode.data+"' at position : "+pos+" after "+node.data);



		newNode.next=node.next;
		node.next=newNode;
		printList();

	}


	//DELETE a node

	public void delete(T data){

		Node<T> prev=root;
		Node<T> temp=root;
		while(prev.next!=null&&temp!=null){

			if(temp.data.equals(data)){
				printList();
				System.out.println("\n \n>> deleting : " +data);
				if(temp==prev){
					root=root.next;
					return;

				}
				prev.next=temp.next;
				return;
			}
			prev=temp;
			temp=temp.next;

		}
		System.out.println("\n>> Did not find '"+data+"' in the List");


	}

	//reverse

	public void reverse(){
		Node<T> prev=root;
		Node<T> temp=root.next.next;
		Node<T> current=root.next;


		printList();

		System.out.println("\n\n>> Reversing List");
		prev.next=null;


		while(temp.next!=null){

			current.next=prev;
			prev=current;
			current=temp;
			temp=current.next;

		}

		temp.next=current;
		current.next=prev;
		root=temp;
		printList();
		return;

	}
	void printReverse(Node root)
	{
		if (root == null) return;

		// print list of head node
		printReverse(root.next);

		// After everything else is printed
		System.out.print(root.data+" ");
	}

	//SWAP nodes


	public void swap(T x,T y){
		System.out.println("\n>> Swapping : "+x +" & "+y);
		Node<T> currX=root;
		Node<T> currY=root;
		Node<T> prevX=null;
		Node<T> prevY=null;


		if(x==y){
			System.out.println("Both input values are same");
			return;
		}
		while(currX!=null&&currX.data!=x){			
			prevX=currX;
			currX=currX.next;			
		}


		while(currY!=null&&currY.data!=y){			
			prevY=currY;
			currY=currY.next;			
		}



		if(currX==null){			
			System.out.println("value missing : "+x);
			return;
		}		

		if(currY==null){			
			System.out.println("value missing : "+y);
			return;
		}	


		if(prevX!=null){
			prevX.next=currY;
		}
		else{
			root=currY;
		}
		if(prevY!=null){
			prevY.next=currX;
		}
		else{
			root=currX;
		}
		Node<T> temp = currX.next;
		currX.next=currY.next;
		currY.next=temp;
		printList();
	}
	//Print list
	public void printList(){

		System.out.print("\n");
		Node<T> tempNode=root;
		while(tempNode!=null){

//			System.out.print(tempNode.data+" --> ");
			System.out.print(tempNode.data+" ");

			tempNode=tempNode.next;
		}

//		System.out.print("null");

	}



	//	//=============================================================
	//	//at End
	//		public  static void addAtEnd(Node<T> node,Node<T> newNode){
	//			
	//			while(node.next!=null){
	//				node=node.next;
	//			}
	//			node.next=newNode;
	//			
	//		}
	//		//at Beginning
	//		public  Node<T> addNodeAtBeginning(Node<T> root,Node<T> newNode){
	//			if(root==null){
	//				System.out.println("Set root node : "+newNode.data);
	//				return newNode;
	//			}
	//				
	//			
	//			newNode.next=root;
	//			System.out.println("Add node at beginning : "+newNode.data);
	//
	//			return newNode;
	//		}
	//		//at Position
	//		public static void addNodeAtPosition(int pos,Node<T> node,Node<T> newNode){
	//			int count=0;
	//			
	//			
	//			while(count!=pos-2&&node.next!=null){
	//
	//				node=node.next;
	//				count=count+1;
	//
	//			}
	//			System.out.println("Add node '"+newNode.data+"' at position : "+pos+" after "+node.data);
	//
	//				
	//
	//				newNode.next=node.next;
	//				node.next=newNode;
	//
	//
	//		}

}
//OUTPUT

//
//===== New Linked List ===== 
//
//
//
//>> Set root node : 10
//
//10 --> null
//>> Append node : 1
//
//10 --> 1 --> null
//>> Append node : 2
//
//10 --> 1 --> 2 --> null
//>> Append node : 9
//
//10 --> 1 --> 2 --> 9 --> null
//>> Append node : 21
//
//10 --> 1 --> 2 --> 9 --> 21 --> null
//>> Add node at Root : 5
//
//5 --> 10 --> 1 --> 2 --> 9 --> 21 --> null
//>> Add node '4' at position : 4 after 1
//
//5 --> 10 --> 1 --> 4 --> 2 --> 9 --> 21 --> null
//>> Did not find '8' in the List
//
//5 --> 10 --> 1 --> 4 --> 2 --> 9 --> 21 --> null
//
//>> deleting : 1
//
//5 --> 10 --> 4 --> 2 --> 9 --> 21 --> null
//
//>> Reversing List
//
//21 --> 9 --> 2 --> 4 --> 10 --> 5 --> null
//>> Swapping : 2 & 10
//
//21 --> 9 --> 10 --> 4 --> 2 --> 5 --> null
//>> Swapping : 2 & 7
//value missing : 7
//21
//9
//10
//4
//2
//5
//
//21 --> 9 --> 10 --> 4 --> 2 --> 5 --> null