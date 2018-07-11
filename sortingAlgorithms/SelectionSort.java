package sortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		System.out.print("\n\n selection sort : ");
		int[] arr={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr);
		arr=selectionSort(arr);
		System.out.print("\n\n sorted array: ");
		printArray(arr);

		
		int[] arr1={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr1);
		arr1=selectionSortRecursive(arr1,0,arr1.length);
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
	public static int[] selectionSort(int arr[]){
		
		
		int temp, index;
		for(int i=0;i<arr.length-1;i++){
			index=i;
			for(int j=i+1;j<arr.length;j++){

				if(arr[j]<arr[index]){

					index=j;
				}

			}
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}

		return arr;
	}
	
	public static int minIndex(int arr[],int j,int n){
		if(j==n){
			return j ;
		}
		int k=minIndex(arr,j+1,n);
		
		return arr[j]<arr[k]?j:k;
		
	}
public static int[] selectionSortRecursive(int arr[],int i,int n){
		
		
		if(i==n){
			return arr; 
		}
		int k=minIndex(arr,i,n-1);
		if(k!=i){
			
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		arr=selectionSortRecursive(arr,i+1,n);
		
		return arr;
	}
	
	

}
