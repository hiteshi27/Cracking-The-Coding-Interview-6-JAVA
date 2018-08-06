package interviewPractice;

public class BinarySearch {

	public static void main(String[] args) {//O(logn)
		int[] arr= {0,2,3,5,6,7,8,9};
		System.out.print("\n"+BS(arr,4));
		System.out.print("\n"+BS(arr,9));
	}
	
	public static Boolean BS(int[] arr,int k) {
		int l=0,r=arr.length,mid;
		while(r-l>=0) {
			mid=l+(r-1)/2;
			if(k==arr[mid]) {
				return true;
			}
			else if(k<arr[mid]) {
				r=mid-1;
			}else if(k>arr[mid]) {
				l=mid+1;
			}
			
		}
		
		return false;
	}

}
