package chapter4_trees_and_graphs;



/*
 * Validate 8ST: Implement a function to check if a binary tree is a binary search tree.
 */
public class q5_ValidateBST {

	public static void main(String[] args) {
		/*
		 * 		    4
		 * 		    /\
		 * 		   2  6
		 * 		  /\  /\	
		 *		 1 3 4	7 
		 */

		BinaryTree BT =new BinaryTree(4);
		BinaryTree.Node node = BT.root;
		node.left= BT.new Node(2);
		node.right= BT.new Node(6);
		node.left.left= BT.new Node(1);
		node.left.right= BT.new Node(3);
		node.right.left= BT.new Node(4);
		node.right.right= BT.new Node(7);

		/*
		 * 		    5
		 * 		    /\
		 * 		   7  3
		 * 		  /\  /\	
		 *		 8 7 1	4 
		 */
		// BinaryTree BT =new BinaryTree(5);
		//  BinaryTree.Node node = BT.root;
		// node.left= BT.new Node(7);
		// node.right= BT.new Node(3);
		// node.left.left= BT.new Node(8);
		// node.left.right= BT.new Node(7);
		// node.right.left= BT.new Node(1);
		// node.right.right= BT.new Node(4);

		/*
		 * 		    5
		 * 		    /\
		 * 		   3  7
		 * 		  /\  /\	
		 *		 2 4 6	8 
		 */
		// BinaryTree BT =new BinaryTree(5);
		// BinaryTree.Node node = BT.root;
		// node.left= BT.new Node(3);
		// node.right= BT.new Node(7);
		// node.left.left= BT.new Node(2);
		// node.left.right= BT.new Node(4);
		// node.right.left= BT.new Node(6);
		// node.right.right= BT.new Node(8);


		/*
		 * 		    20
		 * 		    /\
		 * 		   10 30
		 * 		  /\   \	
		 *		 2 11 	6
		 *			 \
		 *			  9 
		 */
		// BinaryTree BT =new BinaryTree(20);
		// BinaryTree.Node node = BT.root;
		// node.left= BT.new Node(10);
		// node.right= BT.new Node(30);
		// node.left.left= BT.new Node(2);
		// node.left.right= BT.new Node(11);
		// node.right.right= BT.new Node(6);
		// node.left.right.right= BT.new Node(9);

		System.out.print("\n\n pre order : ");BT.traversePreOrder(BT.root);
		System.out.print("\n\n id binary search tree: " + checkNode1( BT.root));
	}

	public static boolean checkNode1(BinaryTree.Node node){

		return checkNode1(node,null,null);


	}
	public static boolean checkNode1(BinaryTree.Node node,Integer min, Integer max){

		if(node==null){
			return true;
		}
		if((min!=null&&node.key<=min)||(max!=null&&node.key>max)){
			return false;
		}
		if(!checkNode1(node.left,min,node.key)||!checkNode1(node.right,node.key,max)){
			return false;
		}
		return true;



	}
}
