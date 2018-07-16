package nlognSearch;

public class QuickSort {

	public static void main(String[] args) {

		int arr[]={5,1,4,2,8,7,0,9,4};
		printArray(arr);
		arr=quickSort(arr,0,arr.length-1);
		printArray(arr);

	}
	public static int[] quickSort(int arr[],int l,int r){
		if(r<1){
			return arr;
		}

		//System.out.print(arr[r]);
		if(l<r){
			int temp=0,k=l-1;
			for(int i=l;i<r;i++){
				if(arr[i]<=arr[r]){
					k++;
					temp=arr[k];
					arr[k]=arr[i];
					arr[i]=temp;

				}
				//				printArray(arr);
			}		
			temp=arr[k+1];
			arr[k+1]=arr[r];
			arr[r]=temp;
			//		

			arr= quickSort(arr,0,k);
			arr= quickSort(arr,k+1,r);
		}
		return arr;
	}

	public static void printArray(int[] arr){
		System.out.print("\n");
		for(int a:arr){
			System.out.print(" "+a);
		}
	}
}
