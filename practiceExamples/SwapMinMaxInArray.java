package practiceExamples;

import java.util.Arrays;

public class SwapMinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,6,2,9,12,4,23,5};
		int minIndex=0,maxIndex=0;
		minIndex=getMin(arr);
		maxIndex=getMax(arr);
		System.out.println("old array : "+Arrays.toString(arr));
		System.out.println("\nmin : "+arr[minIndex]+" , max : "+arr[maxIndex]);
		arr=swap(minIndex,maxIndex,arr);
		System.out.println("\nnew array : "+Arrays.toString(arr));
		
	}
	public static int getMin(int[] arr){
		int minIndex=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<arr[minIndex]){
				minIndex=i;
			}
			
		}
		return minIndex;
	}
	
	public static int getMax(int[] arr){
		int maxIndex=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>arr[maxIndex]){
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	public static int[] swap(int min, int max, int[] arr){
		
		int temp=arr[min];
		arr[min]=arr[max];
		arr[max]=temp;
		
		
		return arr;
	}
}
