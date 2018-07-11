package practiceExamples;

import java.util.Arrays;
import java.util.HashMap;

public class FindIntegerPairInArray {

	
	public static void main(final String[] args) throws Exception {
	int[] intArr = {1, 7, 5, 9, 2, 12, 3};
	int k=2;
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	
	//put elements of array in a hashmap O(n)
	for(int i: intArr){
		map.put(i, i);
	}
	
	//make pairs O(n)
	for(int i: intArr){
		if(map.containsKey(i+k)){
			System.out.println(i+" , "+ (i+k));
		}
	}
	}
	
}
//answer---------------------
//1 , 3
//7 , 9
//5 , 7
//3 , 5
