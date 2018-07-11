package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.print("\n\n bubble sort : ");
		int[] arr={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr);
		arr=bubbleSort(arr);
		System.out.print("\n\n sorted array: ");
		printArray(arr);
		
		
		int[] arr1={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr1);
		arr1=bubbleSortRecursive(arr1,arr1.length);
		System.out.print("\n\n sorted array: ");
		printArray(arr1);
	}
	public static void printArray(int arr[]){
		System.out.print("\n\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print("\n\n");
	}
	public static int[] bubbleSort(int arr[]){
		
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++){
			

			//last i elements are in correct place
			for(int j=0;j<n-1-i;j++){

				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] bubbleSortRecursive(int arr[],int n){
		
		if(n==1){
			return arr;
		}
		int temp;
		for(int j=0;j<n-1;j++){
			if(arr[j]>arr[j+1]){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		arr=bubbleSortRecursive(arr,n-1);
		
		return arr;
	}
}
