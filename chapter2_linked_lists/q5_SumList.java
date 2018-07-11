package chapter2_linked_lists;
import chapter2_linked_lists.LinkedList.Node;

public class q5_SumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> L1 = new LinkedList<Integer>();	
		L1.append(7);
		L1.append(1);
		L1.append(6);
		L1.append(6);

		LinkedList<Integer> L2 = new LinkedList<Integer>();	
		L2.append(5);
		L2.append(9);
		L2.append(2);

		LinkedList<Integer> newNode=sumList(L1.root,L2.root);
		newNode.printList();

		LinkedList<Integer> L3 = new LinkedList<Integer>();	
		L3.append(6);
		L3.append(6);
		L3.append(1);
		L3.append(7);

		LinkedList<Integer> L4 = new LinkedList<Integer>();	
		L4.append(2);
		L4.append(9);
		L4.append(5);
		LinkedList<Integer> newNode2=sumListFwd(L3.root,L4.root);
	}
	@SuppressWarnings("unused")
	public static LinkedList<Integer> sumList(Node n1,Node n2){
		LinkedList<Integer> newNode = new LinkedList<Integer>();	
		int currentSumDigit=0;
		int carry=0;

		while(n1!=null||n2!=null){

			if(n1==null){
				currentSumDigit=(int) n2.data+carry;
				n2=n2.next;
			}else if(n2==null){
				currentSumDigit=(int) n1.data+carry;
				n1=n1.next;
			}else{
				currentSumDigit=(int) n1.data+(int) n2.data+carry;
				n1=n1.next;n2=n2.next;
			}			
			carry=currentSumDigit/10;
			currentSumDigit=currentSumDigit%10;


			newNode.push(currentSumDigit);


		}

		return newNode;
	}
	//Suppose the digits are stored in forward order. Repeat the above problem.
	@SuppressWarnings("unused")
	public static LinkedList<Integer> sumListFwd(Node n1,Node n2){
		LinkedList<Integer> newNode = new LinkedList<Integer>();	

		int num1=0,num2=0;
		while(n1!=null||n2!=null){

			if(n1!=null){
				num1*=10;
				num1+=(int)n1.data;
				n1=n1.next;
			}
			if(n2!=null){
				num2*=10;
				num2+=(int)n2.data;
				n2=n2.next;
			}


		}
		int sum=num1+num2;
		while(sum!=0){

			newNode.push(sum%10);
			sum=sum/10;

		}




		return newNode;



	}
}
