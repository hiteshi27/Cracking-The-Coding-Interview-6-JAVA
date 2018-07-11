package searchingAlgorithms;
import sortingAlgorithms.BubbleSort;
public class BinarySearch {

	public static void main(String[] args) {
		System.out.print("\n\n binary search : ");
		int[] arr={5,1,4,2,8,7,0,9};
		arr=BubbleSort.bubbleSort(arr);
		System.out.print("\n\n sorted array: ");
		BubbleSort.printArray(arr);
		//seach sorted array only
		int k=5;
		System.out.print("\n\n Element found: "+k+" , "+binarySearch(arr,k));
	}
	public static Boolean binarySearch(int arr[],int k){
		int n=arr.length;
		int l=0,r=n;


		while(l<=r){
			int pos=l+(r-l)/2;
		System.out.println(pos);
			if(arr[pos]==k){
				return true;
			}
			if(arr[pos]<k){
				l=pos+1;
			}else{
				r=pos-1;
			}



		}

		return false;
	}

}
