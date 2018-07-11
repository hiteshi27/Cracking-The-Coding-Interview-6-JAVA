package practiceExamples;

import java.util.ArrayList;
import java.util.List;

public class permutationsOfString {

	static List<String> temp=new ArrayList<String>();
	static String s="abcb";
	static String[] str={s.substring(0, 1),s.substring(1, 2),s.substring(2, 3),s.substring(3, 4)};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> strArr=new ArrayList<List<String>>();

		permutation( strArr);



	}
	public static void permutation(List<List<String>> strArr){

		//init
		List<String> tempChar=new ArrayList<String>(); 
		tempChar.add(str[0]);
		strArr.add(tempChar);

		//recursion
		strArr= permutationAgain( strArr);
		List<List<String>> strArrTemp=new ArrayList<List<String>>();
		
		
		for(List<String> s:strArr){
			
			if(s.size()==str.length&&!strArrTemp.contains(s)){

				strArrTemp.add(s);
				System.out.println(s);
			}
		}

		System.out.println(strArrTemp.size());
	}
	public static List<List<String>> permutationAgain(List<List<String>> strArr){
		int len=0;
		List<List<String>> strArrTemp=new ArrayList<List<String>>();

		for(List<String> s:strArr){

			//			System.out.println(s.size());
			len=s.size();
			for(int i=0;i<=len;i++){
				if(len<str.length){
					temp=null;
					temp=new ArrayList<String>(s); 


					temp.add(i, str[len]);


					strArrTemp.add(temp);
				}
			}
		}
		if(len<str.length){
			strArr= permutationAgain( strArrTemp);


		}
		else{
			return strArr;	
		}
		return strArr;
	}
}
