package chapter1_arrays_and_strings;

/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.
*/
import java.util.Arrays;
import java.util.HashMap;

public class q2_CheckPermutation2 {
	/*
	 *convert the strings into character array
	 * sort the character array
	 *check if they are equal
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcbc";
		String s2="babcc";
		System.out.println(checkPermutation( s1,  s2));
	}
	
	
	public static Boolean checkPermutation(String s1, String s2){
		
		char[] c1=s1.toCharArray(),c2=s2.toCharArray();
		if(c1.length==c2.length){
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
		}else{
		return false;
		}
	}
	
}
