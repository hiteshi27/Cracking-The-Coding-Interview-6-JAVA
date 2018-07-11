package chapter4_trees_and_graphs;

import java.util.LinkedList;

/*
 * Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes
 *  of this question, a balanced tree is defined to 
 * be a tree such that the heights of the two subtrees of any node never differ by more than one.
 */
public class q4_CheckBalanced {

	public static void main(String[] args) {
//		minHeap BT=new minHeap();
		minHeap heap=new minHeap();
		heap.add(6);
		heap.add(4);
		heap.add(8);
		heap.add(3);
		heap.add(5); //comment to chk
		heap.add(7);
		heap.add(9);
		heap.add(1);
		System.out.print("\n\n in order : ");heap.traversePostOrder(heap.root);
		System.out.print("\n\n is balance : " +ifBalanced(heap));
	
		
		heap=new minHeap();
		heap.add(6);
		heap.add(4);
		heap.add(8);
		heap.add(3);
//		heap.add(5); //comment to chk
		heap.add(7);
		heap.add(9);
		heap.add(1);
		System.out.print("\n\n post order : ");heap.traversePostOrder(heap.root);
		System.out.print("\n\n is balance : " +ifBalanced(heap));


	}
	public static boolean  ifBalanced(minHeap BT) {
		LinkedList<minHeap.Node> Q=new LinkedList<>();
		Q.push(BT.root);
		minHeap.Node s;
		int hl=0,hr=0;
		while(!Q.isEmpty()) {
			s=Q.pollFirst();
			if(s.left!=null)
				Q.add(s.left);
			 hl=findHeightL(s.left,0);
			if(s.right!=null)
				Q.add(s.right);
			 hr=findHeightR(s.right,0);
			System.out.print("\n node : "+s.key+" , left height : "+hl+" , right height : "+hr);
			if(hl-hr>1||hr-hl>1){
				return false;
			}
		}
		return true;

	}

	public static int findHeightL(minHeap.Node node,int height) {


		if(node==null) {

			return height;
		}
		if(node!=null) {
			height=height+1;
			if(node.left!=null) {
				
				height=findHeightL(node.left,height);
			
			}else{
				height=findHeightL(node.right,height);
			}
		
			
		}



		return height;
	}
	public static int findHeightR(minHeap.Node node,int height) {


		if(node==null) {

			return height;
		}
		if(node!=null) {
			
			height=height+1;
			if(node.right!=null) {
				height=findHeightR(node.right,height);
				
				
				
				
			}else{
				height=findHeightR(node.left,height);
			}
		}



		return height;
	}




	
}