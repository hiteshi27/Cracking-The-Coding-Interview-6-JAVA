package chapter3_stacks_and_queues;
/*
 * Three in One: Describe how you could use a single array to implement three stacks.
 */
public class q1_ThreeInOne {

	int arr[];
	int last1,last2,last3;
	int first1,first2,first3;
	int size1,size2,size3;


	public q1_ThreeInOne(int size1,int size2,int size3){

		this.size1=size1;
		this.size2=size2;
		this.size3=size3;
		arr=new int[size1+size2+size3];
		first1=0;
		first2=size1;
		first3=size1+size2;

		last1=-1;
		last2=size1-1;
		last3=size1+size2-1;
	}


	public void add(int data, int stacknumber){
		
		if(stacknumber==1&&!isFull(stacknumber)){
			last1+=1;System.out.print("\n\n add : "+data+" to stack "+stacknumber);
			arr[last1]=data;
			return;
		}else if(stacknumber==2&&!isFull(stacknumber)){
			last2+=1;System.out.print("\n\n add : "+data+" to stack "+stacknumber);
			arr[last2]=data;
			return;
		}else if(stacknumber==3&&!isFull(stacknumber)){
			last3+=1;System.out.print("\n\n add : "+data+" to stack "+stacknumber);
			arr[last3]=data;
			return;
		}

		System.out.print("\n\n array is full, cannot add " +data+" to stack "+stacknumber);



	}
	public void remove(int stacknumber){
		
		if(stacknumber==1&&!isEmpty(stacknumber)){
			System.out.print("\n\n remove : "+arr[last1]+" from stack "+stacknumber);
			last1-=1;

			return;
		}else if(stacknumber==2&&!isEmpty(stacknumber)){
			System.out.print("\n\n remove : "+arr[last2]+" from stack "+stacknumber);
			last2-=1;
			return;
		}else if(stacknumber==3&&!isEmpty(stacknumber)){
			System.out.print("\n\n remove : "+arr[last3]+" from stack "+stacknumber);
			last3-=1;
			return;
		}



	}
	public Boolean isFull(int stacknumber) {
		if(stacknumber==1){
			return size1-1==last1;
		}else if(stacknumber==2){
			return size1+size2-1==last2;
		}else if(stacknumber==3){
			return size1+size2+size3-1==last3;
		}

		return true;
	}
	public Boolean isEmpty(int stacknumber) {
		if(stacknumber==1){
			return last1==-1;
		}else if(stacknumber==2){
			return last2==size1-1;
		}else if(stacknumber==3){
			return last3==size1+size2-1;
		}

		return true;
	}


	public void printQueue(int stacknumber) {
		if(stacknumber==1){
			System.out.print("\n\n");
			for(int i=first1;i<=last1;i++) {
				System.out.print(" < -- "+arr[i]);
			}
			System.out.print(" <-- null");

		}else if(stacknumber==2){

			System.out.print("\n\n");
			for(int i=first2;i<=last2;i++) {
				System.out.print(" < -- "+arr[i]);
			}
			System.out.print(" <-- null");
		}else if(stacknumber==3){

			System.out.print("\n\n");
			for(int i=first3;i<=last3;i++) {
				System.out.print(" < -- "+arr[i]);
			}
			System.out.print(" <-- null");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q1_ThreeInOne stk=new q1_ThreeInOne(3,4,5);

		System.out.print("\n\n stack empty : "+stk.isEmpty(1));
		System.out.print("\n\n stack empty : "+stk.isEmpty(2));
		System.out.print("\n\n stack empty : "+stk.isEmpty(3));

		stk.add(1, 1);stk.add(2, 1);stk.add(3, 1);stk.add(4, 1);
		stk.add(11, 2);stk.add(12, 2);stk.add(13, 2);stk.add(14, 2);stk.add(15, 2);
		stk.add(21, 3);stk.add(22, 3);stk.add(23, 3);stk.add(24, 3);stk.add(25, 3);stk.add(26, 3);stk.add(27, 3);
		stk.printQueue(1);stk.printQueue(2);stk.printQueue(3);
		System.out.println("\n");
		System.out.print("\n\n stack full : "+stk.isFull(1));
		System.out.print("\n\n stack full : "+stk.isFull(2));
		System.out.print("\n\n stack full : "+stk.isFull(3));
		stk.remove(1);stk.remove(1);
		stk.remove(2);
		stk.remove(3);stk.remove(3);
		stk.printQueue(1);stk.printQueue(2);stk.printQueue(3);
	}

}
