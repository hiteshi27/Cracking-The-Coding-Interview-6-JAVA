package Dynamic_Programming;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * LCS Problem Statement: Given two sequences, find the length of longest subsequence 
 * present in both of them. A subsequence is a sequence that appears in the same relative order, but not 
 * necessarily contiguous. For example, �abc�, �abg�, �bdf�, �aeg�, ��acefg�, .. etc are subsequences of �abcdefg�. 
 * So a string of length n has 2^n different possible subsequences.
 * 
 */
public class LongestCommonSubSequence {

	public static void main(String[] args) {
		String str1="ABCDGH";
		String str2="AEDFHR";

		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSRecursive(str1,  str2, str1.length(),  str2.length(), "")+" "+LCSRecursive(str1,  str2, str1.length(),  str2.length(), "").length());
		System.out.println("\nIterative "+str1+" "+str2+" "+ LCSIterative2ForLoops(str1,  str2)+" "+LCSIterative2ForLoops(str1,  str2).length());
		System.out.println("\n2Darray "+str1+" "+str2+" "+ LCSIterative2DArray(str1,  str2)+" "+LCSIterative2DArray(str1,  str2).length());


		str1="AGGTAB";
		str2="GXTXAYB";
		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSRecursive(str1,  str2, str1.length(),  str2.length(), "")+" "+LCSRecursive(str1,  str2, str1.length(),  str2.length(), "").length());
		System.out.println("\n2Darray "+str1+" "+str2+" "+ LCSIterative2DArray(str1,  str2));




	}
	// 2 d array and 1 nested for loop
	public static String LCSIterative2DArray(String str1, String str2){//O(n^2)
		/*
		 *     G X T X A Y B
		 *   0 0 0 0 0 0 0 0
		 * A 0 0 0 0 0 1 1 1
		 * G 0 1 1 1 1 1 1 1
		 * G 0 1 1 1 1 1 1 1
		 * T 0 1 1 2 2 2 2 2 
		 * A 0 1 1 2 2 3 3 3
		 * B 0 1 1 2 2 3 3 4
		 */

		String lcs="";
		int m=str1.length();
		int n=str2.length();
		int[][] adj=new int[m+1][n+1];

		for(int i=0;i<m+1;i++){

			for(int j=0;j<n+1;j++){
				if(i==0||j==0) {
					adj[i][j]=0;
				}
				else if(str1.charAt(i-1)!=str2.charAt(j-1)){
					adj[i][j]=adj[i][j-1]>adj[i-1][j]?adj[i][j-1]:adj[i-1][j];

				}else{
					adj[i][j]=adj[i-1][j-1]+1;

				}

			}
		}
		// print matrix
		for(int i=0;i<m+1;i++){
			System.out.println();
			for(int j=0;j<n+1;j++){
				System.out.print(" "+adj[i][j]);

			}
		}
		System.out.println();
		//print sequence
		for(int i=m;i>0;i--) {
			for(int j=n;j>0;j--) {
				if(adj[i][j]==adj[i-1][j]||adj[i][j]==adj[i][j-1]) {

				}
				else if(adj[i][j]==(adj[i-1][j-1]+1)) {
					lcs=str1.charAt(i-1)+lcs;
					//					System.out.println(str1.charAt(i-1));
					i=i-1;
				}

			}	

		}

		System.out.print("length "+lcs.length());
		return lcs;
	}

	// 2 nested for loops
	public static String LCSIterative2ForLoops(String str1, String str2){//O(2n^2)
		String lcs1="",lcs2="";


		int pos=0;
		for(int i=0;i<str1.length();i++){

			for(int j=pos;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
					lcs1+=str1.charAt(j);
					pos++;
					break;
				}
			}
		}
		pos=0;

		for(int i=0;i<str2.length();i++){

			for(int j=pos;j<str1.length();j++){
				if(str2.charAt(i)==str1.charAt(j)){
					lcs2+=str1.charAt(j);
					pos++;
					break;
				}
			}
		}



		return lcs1.length()>lcs2.length()?lcs1:lcs2;
	}
	//recursive
	public static String LCSRecursive(String str1, String str2,int m, int n,String lcs){//O(2^n)
		if(m==0)
			return lcs;
		if(n==0)
			return lcs;

		if(str1.charAt(m-1)==str2.charAt(n-1)){
			lcs=str1.charAt(m-1)+lcs;
			return LCSRecursive( str1,  str2, m-1,  n-1, lcs);



		}

		return max(LCSRecursive( str1,  str2, m,  n-1, lcs),LCSRecursive( str1,  str2, m-1,  n, lcs));	
	}
	public static String max(String x,String y){
		return x.length()>y.length()?x:y;
	}



}
