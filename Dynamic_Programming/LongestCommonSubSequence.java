package Dynamic_Programming;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * LCS Problem Statement: Given two sequences, find the length of longest subsequence 
 * present in both of them. A subsequence is a sequence that appears in the same relative order, but not 
 * necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. 
 * So a string of length n has 2^n different possible subsequences.
 * 
 */
public class LongestCommonSubSequence {

	public static void main(String[] args) {
		String str1="ABCDGH";
		String str2="AEDFHR";

		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSRecursive(str1,  str2, str1.length(),  str2.length(), "")+" "+LCSRecursive(str1,  str2, str1.length(),  str2.length(), "").length());
		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSIterative2ForLoops(str1,  str2)+" "+LCSIterative2ForLoops(str1,  str2).length());


		str1="AGGTAB";
		str2="GXTXAYB";
		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSIterative2DArray(str1,  str2)+" "+LCSIterative2DArray(str1,  str2).length());

		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSRecursive(str1,  str2, str1.length(),  str2.length(), "")+" "+LCSRecursive(str1,  str2, str1.length(),  str2.length(), "").length());




	}
	public static String LCSIterative2DArray(String str1, String str2){//O(n^2)
		String lcs1="",lcs2="";

		int[][] adj=new int[str1.toCharArray().length][str2.toCharArray().length];

		int pos=0;
		for(int i=0;i<str1.length();i++){

			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){

					adj[i][j]=i+j;

					

				}else{
					adj[i][j]=0;
				
				}

			}
		}

		for(int i=0;i<str1.length();i++){
			System.out.println();
			for(int j=0;j<str2.length();j++){
				System.out.print(" "+adj[i][j]);

			}
		}


		return "";
	}
	public static String LCSIterative2ForLoops(String str1, String str2){//O(n^2)
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
