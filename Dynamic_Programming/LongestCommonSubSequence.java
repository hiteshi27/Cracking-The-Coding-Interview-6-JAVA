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

		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSRecursive(str1,  str2, str1.length(),  str2.length(), ""));

		str1="AGGTAB";
		str2="GXTXAYB";

		System.out.println("\nRecursive "+str1+" "+str2+" "+ LCSRecursive(str1,  str2, str1.length(),  str2.length(), ""));




	}

	public static String LCSRecursive(String str1, String str2,int m, int n,String lcs){
		if(m==0)
			return lcs;
		if(n==0)
			return lcs;

		if(str1.charAt(m-1)==str2.charAt(n-1)){
			lcs=str1.charAt(m-1)+lcs;
			return LCSRecursive( str1,  str2, m-1,  n-1, lcs);



		}

		return LCSRecursive( str1,  str2, m,  n-1, lcs).length()>LCSRecursive( str1,  str2, m-1,  n, lcs).length()?
				LCSRecursive( str1,  str2, m,  n-1, lcs):LCSRecursive( str1,  str2, m-1,  n, lcs);	
	}

}
