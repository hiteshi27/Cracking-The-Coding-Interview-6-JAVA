package searchingAlgorithms;
import sortingAlgorithms.BubbleSort;
public class LinearSearch {

	public static void main(String[] args) {
		System.out.print("\n\n linear search : ");
		int[] arr={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		BubbleSort.printArray(arr);
		//seach unsorted array
		int k=0;
		System.out.print("\n\n Element found: "+k+" , "+linearSearch(arr,k));
		arr=BubbleSort.bubbleSort(arr);
		System.out.print("\n\n sorted array: ");
		BubbleSort.printArray(arr);
		//seach sorted array
		k=0;
		System.out.print("\n\n Element found: "+k+" , "+linearSearch(arr,k));
		k=10;
		System.out.print("\n\n Element found: "+k+" , "+linearSearch(arr,k));

		k=10;
		System.out.print("\n\n Element found: "+k+" , "+linearSearchRecursove(arr,k,0));
		k=4;
		System.out.print("\n\n Element found: "+k+" , "+linearSearchRecursove(arr,k,0));

	}
	public static Boolean linearSearch(int arr[],int k){

		for(int i=0;i<arr.length;i++){
			if(k==arr[i]){
				return true;
			}

		}
		return false;

	}
	public static Boolean linearSearchRecursove(int arr[],int k,int pos){
		if(pos>=arr.length){
			return false;
		}
		if(arr[pos]==k){
			return true;
		}
		Boolean temp=linearSearchRecursove(arr,k,pos+1);

		return temp;

	}

}
