package searchingAlgorithms;
import sortingAlgorithms.BubbleSort;


public class JumpSearch {

	public static void main(String[] args) {
		System.out.print("\n\n jump search : ");
		int[] arr={5,1,4,2,8,7,0,9,14,11,12,13,3,6,22,20,23,25};
		arr=BubbleSort.bubbleSort(arr);
		System.out.print("\n\n sorted array: ");
		BubbleSort.printArray(arr);
		//seach sorted array only
		int k=110;
		System.out.print("\n\n Element found: "+k+" , "+jumpSearch(arr,k));
		k=23;
		System.out.print("\n\n Element found: "+k+" , "+jumpSearch(arr,k));
	}
	public static Boolean jumpSearch(int arr[], int k){
		System.out.println("\n size : "+arr.length);
		int jump=(int) Math.sqrt(arr.length);

		int i=0,n=arr.length;
		// n is set to default for situation when k might be in the last block
		while(i<arr.length){

			if(arr[i]==k){

				return true;
			}
			else if(k<arr[i]){
				i=i-(jump+1); n=i;	break;

			}
			i+=jump;

		}
		if(i>arr.length){
			i=i-jump;
		}
		//		System.out.println("\n low : "+i);
		//		System.out.println("\n up : "+n);
		for(int j=i;j<n;j++){
			if(arr[j]==k){
				return true;
			}
		}
		return false;


	}
}
