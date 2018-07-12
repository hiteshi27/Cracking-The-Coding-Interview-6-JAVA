package Dynamic_Programming;
/*
 * The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements
 *  of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 */
public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int arr[]={10,22,9,33,21,50,41,60,80};

		System.out.println("\nIterative "+ LISIterative2Darray(arr));
		System.out.println("\nRecursive "+ LISRecursive(arr,0,0));


	}
	public static  int LISRecursive(int[] arr,int start,int len){//O(n^2)
		
		if(start>=arr.length)
			return len;
		int pos=start;
		int tempLen=1;
		System.out.print(" "+arr[start]);
		for(int temp=start+1;temp<arr.length;temp++) {
			if(arr[pos]<arr[temp]) {
				tempLen+=1;
				pos=temp;
				System.out.print(" "+arr[temp]);
			}
			
		}
		System.out.print(" "+tempLen);
		len=tempLen>len?tempLen:len;
		System.out.print("\n");
		len=LISRecursive(arr,start+1,len);

		return len;
	}
	public static  int LISIterative2Darray(int[] arr){//O(n^2)
		/*
		 *{10,22,9,33,21,50,41,60,80}
		 */
		int maxLen=0;
		int len=1;
		int pos=0;
		for(int i=0;i<arr.length;i++) {
			pos=i;len=1;
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
