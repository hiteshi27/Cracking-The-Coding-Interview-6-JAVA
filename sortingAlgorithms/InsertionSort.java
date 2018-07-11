package sortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.print("\n\n insertion sort : ");
		int[] arr={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr);
		arr=insertionSort(arr,arr.length);
		System.out.print("\n\n sorted array: ");
		printArray(arr);

		int[] arr1={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr1);
		arr1=insertionSortRecursion(arr1,1,arr1.length);
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
	public static int[] insertionSort(int arr[],int n){

		int temp,j;
		int index;
		for(int i=1;i<n;i++){
			temp=arr[i];
			j=i-1;
			while (j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;


		}


		return arr;
	}

	public static int[] minIndex(int arr[],int i,int j,int temp){
		printArray(arr);
		if(j<0){

			return arr;
		}	


		if(j >= 0&& arr[j] > temp){
			arr[j+1]=arr[j];
			arr[j]=temp;
			arr = minIndex(arr,i,j-1,temp);
			return arr;
		}



		return arr;
	}
	public static int[] insertionSortRecursion(int arr[],int i,int n){
		if(i==n){
			return arr;
		}
				int j=i-1;
		int temp=arr[i];
				while (j >= 0 && arr[j] > temp)
				{
					arr[j+1] = arr[j];
					j = j-1;
				}
				arr[j+1] = temp;

//		arr = minIndex(arr,i,i-1,temp);

		arr=insertionSortRecursion(arr,i+1,n);

		return arr;
	}

}