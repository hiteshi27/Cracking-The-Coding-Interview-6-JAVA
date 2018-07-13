package Dynamic_Programming;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements
 *  of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 */
public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int arr[]={10,22,11,12,33,21,50,41,60,90,13};


		System.out.println("\nRecursive "+ LISRecursive(arr,0,0));
		System.out.println("\nIterative  n^2 "+ LISIterativeNsq(arr));
		System.out.println("\nIterative nlogn with path "+ LISIterativeNlogNwithPath(arr));


	}
	public static  int LISIterativeNlogNwithPath(int[] arr){//O(nlogn)
		int lengths[] = new int[arr.length];
		//		int path[]=new int[arr.length];

		for(int i=0;i<lengths.length;i++) {
			lengths[i]=-1;
			//			path[i]=-1;
		}

		int len=1;
		lengths[0]=0;


		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[lengths[len-1]]) {
				//				path[i]=len-1;
				len+=1;
				lengths[len-1]=i;

			}else if(arr[i]<arr[lengths[0]]) {
				lengths[0]=i;
			}else {
				//				int pos=binarySearch1(arr,lengths,0,len-1,arr[i]);
				//				path[i]=path[lengths[pos]];
				//				path[lengths[pos]]=-1;
				lengths[binarySearch(arr,lengths,0,len-1,arr[i])]=i;


			}

		}
		System.out.print("\n n logn : ");
		for(int i=0;i<lengths.length;i++) {
			if(lengths[i]!=-1)
				System.out.print(" " +arr[lengths[i]]);
		}

		return len;
	}
	public static int LISIterativeNsq(int arr[])
	{	int n=arr.length;
	int lengths[] = new int[n];
	int maxLen = 0;
	/*
	 * lengths
	 *10221112332150416080  
	 *1 2 1 1 1 1 1 1 1 1 i=1
	 *1 2 2 1 1 1 1 1 1 1 i=2
	 *1 2 2 3 1 1 1 1 1 1 i=3
	 *1 2 2 3 4 1 1 1 1 1
	 *1 2 2 3 4 4 1 1 1 1
	 *1 2 2 3 4 4 5 1 1 1
	 *1 2 2 3 4 4 5 5 1 1
	 *1 2 2 3 4 4 5 5 6 1
	 *1 2 2 3 4 4 5 5 6 7 i=n
	 */

	for ( int i = 0; i < n; i++ )
		lengths[i] = 1;

	//	 compare from start till ith
	for ( int i = 1; i <n; i++ ) {
		for ( int j = 0; j <= i; j++ ) {
			if ( arr[i] > arr[j] && lengths[i] < lengths[j] + 1) {
				lengths[i] = lengths[j] + 1;
				if(maxLen<lengths[i]) {
					maxLen=lengths[i];
					//					System.out.print(" "+arr[j]);
				}
			} //ith = most recent smallest+1
		}
	}
			System.out.print("\n n^2 : ");
	int i=1;
	
	for (  i = 1; i < n; i++ ) {
		if(lengths[i-1]!=lengths[i])
			System.out.print(" "+arr[i-1]);
	}

	return maxLen;
	}


	public static int binarySearch(int arr[],int lengths[],int l,int r,int k){
		int n=lengths.length;
		int mid=0;
		while(r-l>1) {
			mid=l+(r-1)/2;
			if(arr[lengths[mid]]>=k) {
				r=mid;
			}else {
				l=mid;
			}

		}

		return r;
	}


	public static  int LISRecursive(int[] arr,int start,int len){//O(n^2)

		if(start>=arr.length)
			return len;
		int pos=start;
		int tempLen=1;
		System.out.print(" "+arr[start]);
		for(int temp=start;temp<arr.length;temp++) {
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

}
