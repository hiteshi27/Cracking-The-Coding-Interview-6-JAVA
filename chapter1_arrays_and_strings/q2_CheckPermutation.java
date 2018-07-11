package chapter1_arrays_and_strings;
/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.
*/
import java.util.HashMap;

public class q2_CheckPermutation {
	/*
	 *map the char count of each string into a hashmap  
	 * then compare the hashmaps to determine if the strings are equal
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcbc";
		String s2="babcc";
		System.out.println(checkPermutation( s1,  s2));
	}
	
	
	public static Boolean checkPermutation(String s1, String s2){
		
		if(s1.length()==s2.length()){
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		HashMap<String,Integer> map2=new HashMap<String,Integer>();
		
		map1=count(s1);
		map2=count(s2);
		if(map1.size()==map2.size()){
		for(int i=0;i<s1.length();i++){
			
			if(map1.get(s1.substring(i, i+1))!=map2.get(s1.substring(i, i+1))){
				return false;
			}
			
			
			
		}
		return true;
		}
		else{
		return false;
		}
		}
		return false;
	}
	public static HashMap<String,Integer> count(String str){
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	for(int i=0;i<str.length();i++){



		try{
			;
			map.put(str.substring(i, i+1), map.get(str.substring(i, i+1))+1);
		}
		catch(Exception e){
			map.put(str.substring(i, i+1), 1);
		}
	}
	System.out.println(map);
	return map;
	
	
	
	}
}
