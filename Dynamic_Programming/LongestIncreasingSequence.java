package Dynamic_Programming;
/*
 * The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements
 *  of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 */
public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int arr[]={10,22,9,33,21,50,41,60,80};

		System.out.println("\nRecursive "+ LISIterative2Darray(arr));


	}
//	public static  int LISIterative(int[] arr,int start,int len){
//		if(arr.length==0){
//			return 0;
//		}
//		
//		if(start>arr.length-1){
//			return len;
//		}
//		
//		
//		if(start==0&&arr[start]<=arr[len]){
//		
//			System.out.println(arr[start]);
//			 len+=1;
//			return LISIterative(arr,start+1,len);
//		}
//	
//		else if(arr[start]>arr[len]){
//			len+=1;
//			System.out.println(arr[start]);
////			return 	len+=1;
//		}
//		len+=LISIterative(arr,start+1,len);
//		
//		return LISIterative(arr,start+1,len)?LISIterative(arr,start+1,len);
//	}
	public static  int LISIterative2Darray(int[] arr){
		/*
		*{10,22,9,33,21,50,41,60,80}
		 */
			int maxLen=0;
			int len=0;
			int pos=0;
		for(int i=0;i<arr.length;i++) {
			pos=i;len=0;
			System.out.println();
			System.out.print(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[pos]<arr[j]) {
					len+=1;
					pos=j;
					System.out.print(" "+arr[j]);
				}
			}
			if(maxLen<len)
				maxLen=len;
			System.out.println(" len "+len);
		}
		
	return maxLen;	
	}
}
