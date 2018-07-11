package chapter4_superSets_and_graphs;
import java.util.LinkedList;

/*
 * BST Sequences: A binary search superSet was created by traversing through an array from left to right
 *  and inserting each element. Given a binary search superSet with distinct elements, print all possible
 *   arrays that could have led to this superSet.
 */
public class q9_BSTSequences {
	static LinkedList<LinkedList<Integer>> superSet=new LinkedList<>();
	public static void main(String[] args) {
		BSTIterative heap=new BSTIterative();
		heap.add(6);
		heap.add(4);
		heap.add(8);
		heap.add(3);
		heap.add(5);
		heap.add(7);
		heap.add(9);
		heap.add(1);
		heap.add(10);
		LinkedList<Integer> list=new LinkedList<>();
		System.out.print("\n\n in order : ");heap.traverseInOrder(heap.root);
		System.out.print("\n\n in order : ");makeSets(heap.root);
		for(LinkedList<Integer> l:superSet) {
			System.out.print("\n");
			//			l.printList();
			for(Integer t:l) {
				System.out.print(" "+t);
				//				l.printList();
			}
		}

	}
	public static void makeSets(BSTIterative.Node node){
		if(node==null) {
							
			return ;
		}

		if(node!=null){
			makeSets(node.left);
			makeSets(node.right);

			LinkedList<Integer> temp=new LinkedList<Integer>();
			temp.add(node.key);
			if(node.left!=null)
				temp.add(node.left.key);
			if(node.right!=null)
				temp.add(node.right.key);
			superSet.add(temp);
			temp=new LinkedList<Integer>();
			temp.add(node.key);
			if(node.right!=null)
				temp.add(node.right.key);
			if(node.left!=null)
				temp.add(node.left.key);
			superSet.add(temp);
			
		}

	}
	public static void makeSuperSet(BSTIterative.Node node){
		LinkedList<Integer> temp=new LinkedList<Integer>();
		for(LinkedList<Integer> set:superSet) {
			temp=null;
			temp=new LinkedList<Integer>();
			temp=set;
			for(Integer each:set) {
				
				if()
				
			}
			
		}
		
		

	}
	
}
