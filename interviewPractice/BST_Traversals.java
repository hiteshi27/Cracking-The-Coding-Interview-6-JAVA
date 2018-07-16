package interviewPractice;

public class BST_Traversals {

	public static void main(String[] args) {
		int[] arr={5,1,4,2,8,7,0,9};
		BST tree=createBST(arr);
		System.out.print("\n in");
		tree.inOrder(tree.root);
		System.out.print("\n pre");
		tree.preOrder(tree.root);
		System.out.print("\n post");
		tree.postOrder(tree.root);
	}

	public static BST createBST(int[] arr){
		BST tree=new BST();
		for(int i:arr){
			tree.add(i);
		}
		return tree;
	}



}

//binary tree
class BST{
	Node root;

	public class Node{
		int val;
		Node left,right;
		Node(int val){
			this.val=val;
			left=null;
			right=null;
		}
	}
	public  void add(int val){

		if(root==null) {
			root = new Node(val);

			return;
		}
		Node node=root;
		while(node!=null){
			if(val<node.val){
				if(node.left==null){
					node.left=new Node(val);
					return;
				}
				node=node.left;
			}else{
				if(node.right==null){
					node.right=new Node(val);
					return;
				}
				node=node.right;
			}
		}

	}
	public void preOrder(Node node){
		//left-parent-right
		if(node!=null){
			System.out.print(" "+node.val);	
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	public void inOrder(Node node){
		//left-parent-right
		if(node!=null){

			inOrder(node.left);
			System.out.print(" "+node.val);
			inOrder(node.right);
		}
	}
	public void postOrder(Node node){
		//left-parent-right
		if(node!=null){

			inOrder(node.left);
			inOrder(node.right);
			System.out.print(" "+node.val);
		}
	}
}