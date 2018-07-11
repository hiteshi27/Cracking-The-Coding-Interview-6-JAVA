package chapter2_linked_lists;

import chapter2_linked_lists.LinkedList.Node;

public class q8_LoopDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> L1 = new LinkedList<Integer>();	
		L1.append(7);
		L1.append(1);
		L1.append(3);
		L1.append(5);
		L1.append(6);
		L1.append(12);
		L1.append(2);
		L1.append(12);
		L1.append(17);
		L1.append(1);
		L1.append(8);
		L1.append(9);

		Node node=L1.root;

		while(node.next!=null) {
			node=node.next;
		}
		node.next=L1.root.next.next.next.next;
		System.out.println("\n has loop : "+findLoop(L1.root,L1.root.next.next));


	}
	public static Boolean findLoop(Node node,Node ahead) {
		if(node==null||ahead==null){
			return false;
		}



		while(node!=ahead&&ahead!=null){


			ahead=ahead.next.next;

			node=node.next;

		}
		if(node==ahead) {
			return true;
		}
		return false;
	}
}
