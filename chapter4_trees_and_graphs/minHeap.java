package chapter4_trees_and_graphs;



public class minHeap {
	Node root;

	minHeap(){
		root=null;
	}
	minHeap(int d){
		root=new Node(d);
	}

	class Node{
		int key;
		Node left,right;
		public Node(int d){

			key=d;
			left=right=null;
		}

	}
	public static void main(String[] args) {
		minHeap heap=new minHeap();
		heap.add(6);
		heap.add(4);
		heap.add(8);
		heap.add(3);
		heap.add(5);
		heap.add(7);
		heap.add(9);
	
		System.out.print("\n\n in order : ");heap.traverseInOrder(heap.root);
		System.out.print("\n\n pre order : ");heap.traversePreOrder(heap.root);
		System.out.print("\n\n post order : ");heap.traversePostOrder(heap.root);
	}
	public Node addRecursive(Node current,int d){
		if(current==null){
			return new Node(d);
		}
		if(d<current.key){
			current.left=addRecursive(current.left,d);
		}else if(d>current.key){
			current.right=addRecursive(current.right,d);
		}else{
			return current;
		}
		return current;
	}
	public void add(int d){

		root = addRecursive(root,d);
	}
	public void traverseInOrder(Node node){
		if(node!=null){
			traverseInOrder(node.left);
			System.out.print(" " + node.key);
			traverseInOrder(node.right);
		}

	}
	public void traversePreOrder(Node node){
		if(node!=null){
			System.out.print(" " + node.key);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}

	}
	public void traversePostOrder(Node node){
		if(node!=null){

			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.key);
		}

	}
	//	public void printTree(){
	//		traverseInOrder()
	//	}

}
