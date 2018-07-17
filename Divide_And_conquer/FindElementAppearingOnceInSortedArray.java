package Divide_And_conquer;
/*
 * Given a sorted array of integers, every element appears twice except for one. Find that single one in linear time complexity and without using extra memory.
 */
public class FindElementAppearingOnceInSortedArray {

	public static void main(String[] args) {
		int arr[]={9,38,3,27,38,43,3,9,43,82,82,10,10};
		MergeSort.printArray(arr);
		arr=MergeSort.mergeSort(arr);
		MergeSort.printArray(arr);
		System.out.print("\n"+findElement(arr));

	}
	public static Integer findElement(int[] arr){//O(n)
	
		
		for(int i=0;i<arr.length;i++){
			if((i==0&&arr[i]!=arr[i+1])||(i==(arr.length-1)&&arr[i]!=arr[i-1])){
				return arr[i];
			}else if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
				return arr[i];
			}
		}
		return null;
	}
}
