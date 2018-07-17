package Divide_And_conquer;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={38,27,43,3,9,82,10};
		printArray(arr);
		arr=mergeSort(arr);
		printArray(arr);
	}

	public static int[] mergeSort(int[] arr){
		int n=arr.length;
		if(n<=1){
			return arr;
		}

		int mid= n/2;
		int arrL[]=new int[mid],arrR[]=new int[n-mid];
		for(int i=0;i<arrL.length;i++){
			arrL[i]=arr[i];
		}
		for(int i=0;i<arrR.length;i++){
			arrR[i]=arr[i+mid];
		}
			
		return  merge( mergeSort(arrL), mergeSort(arrR),arr);
	}
	public static int[] merge(int arrL[], int arrR[],int arr[]){
//		int arr[]=new int[arrL.length+arrR.length];
		int i=0,j=0;
	
		for(int k=0;k<arr.length;k++){
			if(i>=arrL.length){
				arr[k]=arrR[j++];
			}
			else if(j>=arrR.length){
				arr[k]=arrL[i++];
			}
			else if(arrL[i]<=arrR[j]){
				arr[k]=arrL[i++];
			}
			else if(arrL[i]>arrR[j]){
				arr[k]=arrR[j++];
			}
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
