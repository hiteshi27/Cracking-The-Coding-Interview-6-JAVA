package interviewPractice;

public class mergeSort {

	public static void main(String[] args) {
		int[] arr={5,1,4,2,8,7,0,9};
		arr=MS(arr);
		printArr(arr);
	}
	public static int[] MS(int[] arr) {
		int n=arr.length;
		if(n<=1) {
			return arr;
		}
		
		int mid=n/2;
		int[] arrL = new int[mid];
		int[] arrR = new int[n-mid];
		for(int i=0;i<mid;i++) {
			arrL[i]=arr[i];
		}
		for(int i=mid;i<n;i++) {
			arrR[i-mid]=arr[i];
		}

		return merge(MS(arrL),MS(arrR),arr);
	}
	public static int[] merge(int[] arrL,int[] arrR, int arr[]) {
		int l=0,r=0;
		for(int k=0;k<arr.length;k++) {
			if(l>=arrL.length) {
				arr[k]=arrR[r++];
			}else if(r>=arrR.length) {
				arr[k]=arrL[l++];
			}else if(arrL[l]<=arrR[r]) {
				arr[k]=arrL[l++];
			}else if(arrL[l]>arrR[r]) {
				arr[k]=arrR[r++];
			}
		}
		
		return arr;
	}
	public static void printArr(int[] arr) {
		System.out.print("\n" );
		for(int i:arr) {
			System.out.print(" " +i);
		}
	}
}
