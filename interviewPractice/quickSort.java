package interviewPractice;

public class quickSort {

	public static void main(String[] args) {
		int arr[]={38,27,43,3,9,82,10};
		arr=QS(arr,0,arr.length-1);
		printArray(arr);
//		int arr1[]={38,27,43,3,9,82,10};
//		arr1=QSstable(arr1,0,arr1.length-1);
//		printArray(arr1);

	}
	public static int[] QS(int[] arr,int l,int r) {
		if(r<l) {
			return arr;
		}
		int low=l,temp,i=low;
		int pivot=r;
		while(i<r) {
			if(arr[i]<=arr[pivot]) {

				temp=arr[low];
				arr[low]=arr[i];
				arr[i]=temp;
				low++;
			}
			i++;
		}
		temp=arr[low];
		arr[low]=arr[pivot];
		arr[pivot]=temp;
		arr=QS(arr,l,low-1);
		arr=QS(arr,low+1,r);
		return arr;

	}
//	public static int[] QSstable(int[] arr,int l,int r) {
//		if(r<=l) {
//			return arr;
//		}
//		int low=l-1,high=r,temp,i=low+1;
//		int pivot=r;
//		while(low<=high) {
//			if(arr[i]<arr[pivot]) {
//				low++;
//				temp=arr[low];
//				arr[low]=arr[i];
//				arr[i]=temp;
//				i++;
//			}
//			else if(arr[i]>arr[pivot]) {
//				high--;
//				temp=arr[high];
//				arr[high]=arr[i];
//				arr[i]=temp;
//				i++;
//			}
//			else {
//				i++;
//			}
//		}
//		//		temp=arr[low];
//		//		arr[low]=arr[pivot];
//		//		arr[pivot]=temp;
//		arr=QSstable(arr,l,low);
//		arr=QSstable(arr,high+1,r);
//		return arr;
//
//	}

	public static void printArray(int[] arr){
		System.out.print("\n");
		for(int a:arr){
			System.out.print(" "+a);
		}
	}

}
