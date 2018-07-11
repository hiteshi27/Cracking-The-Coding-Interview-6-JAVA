package chapter1_arrays_and_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class q4_PalindromePermutationString {
	/*
	 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rea rrangement of letters. The palindrome does not need to be limited to just dictionary words.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Tact Ca";
		HashMap<String,Integer> map=new HashMap<String,Integer>();

		map=countChar(str.toLowerCase());
		System.out.println("\nis a permutation of a palindrome result with hashmap : "+checkMaxOneOdd(map));
		System.out.println("\nis a permutation of a palindrome result with bit counter : "+bitCount(str.toLowerCase()));
	}
	//map each charater to count,, using hashmap
	public static HashMap<String,Integer> countChar(String str){
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int valid=0;
		for(int i=0;i<str.length();i++){

			if(!str.substring(i, i+1).equals(" ")){

				try{
					;
					map.put(str.substring(i, i+1), map.get(str.substring(i, i+1))+1);
					valid-=1;
				}
				catch(Exception e){
					map.put(str.substring(i, i+1), 1);
					valid+=1;
				}
			}
		}
	
		return map;
	}
	//check no more than one character has odd count if length is odd , using hashmap
	public static Boolean checkMaxOneOdd(HashMap<String,Integer> map){
		int valid=0;
		for(Integer i:map.values()){
			if(i%2!=0){
				valid+=1;
			}
			if(valid>1){
				return false;
			}
		}


		return true;
	}
	//check validity with bit count using array & counter
	public static Boolean bitCount(String str){
		Integer[] bits = new Integer[26];
		Arrays.fill(bits,new Integer(0));
		int index=0;
		int valid=0;
		for(char c:str.toCharArray()){

			index=	(int) c-'a';
			if(index>-1){
				if(bits[index]==0){
					bits[index]=1;
					valid+=1;
				}else{
					bits[index]=0;
					valid-=1;
				}
			}


		}
		if(valid>1){
			return false;
		}
		return true;
	}
}
//106 121 134 136