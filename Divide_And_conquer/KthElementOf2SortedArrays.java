package Divide_And_conquer;

import java.util.Scanner;

/*
 * Given two sorted arrays of size m and n respectively, you are tasked with finding the element that would be at the k’th position of the final sorted array.
 */
public class KthElementOf2SortedArrays {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();// number of testcases	
		System.out.println(t);
		if((1<=t&&t<=200)){
			for(int j=0;j<t;j++){

				int m=sc.nextInt();//size m		
				int n=sc.nextInt();//size n		 
				int k=sc.nextInt();// pos k

				int arr1[]=new int[m];
				int arr2[]=new int[n];
				for (int i=0;i<m;i++){//arr1
					arr1[i]=sc.nextInt();
				}
				for (int i=0;i<n;i++){//arr1
					arr2[i]=sc.nextInt();
				}

				System.out.println(m);
				System.out.println(n);
				System.out.println(k);
				//		  int arr1[]={11,13,15}; 
				//		int arr2[]={10,12,14};
				//		int posK=6;
				if((1<=m&&m<=1000)&&(1<=n&&n<=100)&&(1<=k&&k<=m+n))
					System.out.print("\n position "+k+" element is "+findElement(arr1,arr2,arr1.length,arr2.length,k));
			}	
		}
	}
	public static Integer findElement(int arr1[],int arr2[],int m,int n,int posK){//O(k) where k=m>n?m:n;
		int arr[]=new int[m+n];
		Integer elem=null;
		int left=0,right=0;
		while(left<m||right<n){

			if(left<m&&right<n){
				if(arr1[left]<arr2[right]){
					elem=arr1[left];
					left++;
				}else if(arr1[left]>arr2[right]){
					elem=arr2[right];
					right++;
				}
				if(left+right-1==posK){
					return elem;
				}
			}else{
				if(left>=m&&right<n){
					elem=arr2[right];
					right++;
				}else if(right>=n&&left<m){
					elem=arr1[left];
					left++;
				}
				if(left+right-2==posK){
					return elem;
				}


			}
			if(left+right-1==posK){
				return elem;
			}
		}
		return null;
	}
}
