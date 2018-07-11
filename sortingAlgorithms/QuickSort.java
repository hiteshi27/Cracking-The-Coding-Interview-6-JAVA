package sortingAlgorithms;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,1,4,2,8,7,0,9,4};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr);
		arr=quickSort(arr,0,arr.length-1);
		System.out.print("\n\n sorted array: ");
		printArray(arr);

		int[] arr1={5,1,4,2,8,7,0,9,4};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr1);
		arr1=quickSortStable(arr1,0,arr1.length-1);
		System.out.print("\n\n sorted array: ");
		printArray(arr1);
	}
	public static int[] quickSort(int arr[],int low,int high){
		if(high<1){
			return arr;
		}
		if(low<high){

			int pivot=arr[high];
			int temp;
			int i=low-1;
			for(int k=low;k<high;k++){

				if(arr[k]<=pivot){
					i++;
					temp=arr[i];
					arr[i]=arr[k];
					arr[k]=temp;					
				}
			}
			temp=arr[i+1];
			arr[i+1]=arr[high];
			arr[high]=temp;

			arr=quickSort(arr,0,i);
			arr=quickSort(arr,i+1,high);

		}	

		return arr;
	}
	public static int[] quickSortStable(int arr[],int low,int high){
		if (high < low) {
            return arr;
        }



		int temp;

		int left=low,right=high;
		int i=left+1;
		while(i<=right){

			if(arr[i]<arr[left]){
					
				temp=arr[i];
				arr[i]=arr[left];
				arr[left]=temp;
				left++;	
				i++;
			}
			else if(arr[i]>arr[left]){
				
				temp=arr[i];
			
				arr[i]=arr[right];
				arr[right]=temp;
				right--;			
			}else{
				i++;
			}
		}


		arr=quickSortStable(arr,low,left-1);
		arr=quickSortStable(arr,right+1,high);


		return arr;
	}
	public static void printArray(int arr[]){
		System.out.print("\n\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print("\n\n");
	}
}
