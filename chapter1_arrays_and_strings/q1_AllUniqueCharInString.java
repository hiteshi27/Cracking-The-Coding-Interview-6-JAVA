package chapter1_arrays_and_strings;
/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
*/
import java.nio.charset.Charset;
import java.util.HashMap;

public class q1_AllUniqueCharInString {

	/*
	 *method1: compare each character with the other following character and keep a count. as soon as the count exceeds 1 ,return false.Otherwise true
	 * method 2: add character count into a hashmap. when the count exceeds 1 in the hasmap, return false.Otherwise true.
	 *
	 */
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrsatuvwxyz";
		System.out.println(isUnique(str));
		System.out.println(isUniqueWithHM(str));
	}

	public static Boolean isUnique(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			count=0;
			for(int j=i+1;j<s.length();j++){
				
				if(s.charAt(i)==s.charAt(j)){
					count=count+1;
				}
				if(count>0){
					return false;
				}
				
			}
			if(count>0){
				return false;
			}
			
			
		
		}
		return true;
		
	}

	public static Boolean isUniqueWithHM(String s){
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			try{
//			if(!map.get(s.charAt(i)).equals(null)){
				if(map.get(s.charAt(i))>1){
					return false;
				}else{
					map.put(s.charAt(i),map.get(s.charAt(i))+1);
				}
//			}
			}catch(Exception e){
				map.put(s.charAt(i),1);
				
			}
			
			System.out.println(map);
			
		
		}
		return true;
		
	}

}
