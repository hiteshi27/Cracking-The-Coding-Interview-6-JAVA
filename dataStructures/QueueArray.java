package dataStructures;

public class QueueArray{
	int size;
	int array[];
	int capacity;
	
	public QueueArray(int capacity){
		this.capacity=capacity;
		size=-1;
		array=new int[this.capacity];
	}
	public Boolean isFull() {
		return capacity==size;
	}
	public Boolean isEmpty() {
		return size==-1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			return;
		}
		System.out.print("\n\n add : "+data);
		array[size+1]=data;
		size+=1;
	}
	public void dequeue() {
		if(isEmpty()) {
			return;
		}
		System.out.print("\n\n remove : "+array[0]);
		for(int i=0;i<size;i++) {
			array[i]=array[i+1];
		}
//		array[size]=(Integer) null;
		size-=1;
	}
	
	public void printQueue() {
		System.out.print("\n\n");
		for(int i=0;i<=size;i++) {
			System.out.print(" < -- "+array[i]);
		}
		System.out.print(" <-- null");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray queue=new QueueArray(5);
		System.out.println(queue.isFull());
		System.out.println(queue.isEmpty());

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.printQueue();

		queue.dequeue();
		queue.printQueue();
		queue.enqueue(4);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}

}
