package chapter2_linked_lists;
import chapter2_linked_lists.LinkedList.Node;

public class q3_DeleteMiddleNode {

	public static void main(String[] args) {
		LinkedList<Integer> intList = new LinkedList<Integer>();	
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
				intList.append(11);


		System.out.print("\n\n");
		deleteMiddleNode(intList.root,intList.root);
		intList.printList();
	}
	
	//2 pointers, ahead is twice as fast as node. when ahead reached end, node is at middle element
	public static void deleteMiddleNode(Node node,Node ahead) {
		if(node==null){
			return;
		}
		int count=1;
	

		while(node.next!=null){

			if(count==1){
				ahead=ahead.next;
			}else{
				ahead=ahead.next.next;
			}
			count+=1;

			if(ahead.next==null||ahead.next.next==null){
				break;
			}
			node=node.next;

		}
		System.out.println("middle node : "+node.next.data);	
		deleteMiddleNodeWithoutHead(node.next);
//		node.next=node.next.next;
	}
	
	public static void deleteMiddleNodeWithoutHead(Node node) {
		if(node==null||node.next==null){
			return;
		}
		node.data=node.next.data;
		node.next=node.next.next;
	}
}
