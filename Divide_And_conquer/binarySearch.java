package Divide_And_conquer;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr={0,1,2,3,4,5,6};
		
		int key=0;
		System.out.println(BS(arr,key));

	}
	public static Boolean BS(int[] arr,int key){
		int l=0,r=arr.length;
		int mid=l+(r)/2;
		while(l<=r){
			 mid=l+(r)/2;
				System.out.println(mid);
			if(key==arr[mid]){
				return true;
			}else if(key<arr[mid]){
				r=mid-1;
			}else if(key>arr[mid]){
				l=mid+1;
			}
	
			
		}

		return false;
	}

}
