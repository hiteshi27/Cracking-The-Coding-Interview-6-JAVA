package chapter2_linked_lists;

import chapter2_linked_lists.LinkedList.Node;

/*
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class q2_ReturnKthToLast {

	public static void main(String[] args) {

		int pos=3;
		
		LinkedList<Integer> intList = new LinkedList<Integer>();

		//append nodes at end
		intList.append(1);
		intList.append(2);
		intList.append(3);
		intList.append(4);
		intList.append(5);
		intList.append(6);
		intList.append(7);
		intList.append(8);
		intList.append(9);
		intList.append(10);
		System.out.print("\n\n");
	subList(4,intList);
		

	}
	
	public static void  subList(int pos,LinkedList<Integer> list ){
		Node node=list.root;
		LinkedList<Integer> sub=new LinkedList<Integer>();
		if (node == null || pos < 0) {
            return ;
        }
		while(node!=null&&node.next.next!=null){
			pos-=1;
			
			if(pos<=0){
				System.out.print(node.data+" --> ");
			}
			node=node.next;
		}
		
		System.out.print(" null");
		
		
	}
	
	

}
