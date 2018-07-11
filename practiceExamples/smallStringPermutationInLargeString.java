package practiceExamples;

import java.lang.reflect.Array;
import java.util.HashMap;

public class smallStringPermutationInLargeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abbc";
		String b="cbabadcbbabbcbabaabccbabc";
		String[] arr={s.substring(0, 1),s.substring(1, 2),s.substring(2, 3),s.substring(3, 4)};
		HashMap<String,Integer> temp=new HashMap<String,Integer>();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int count=0;
		int value=0;
		//basics without deep conditions
		for(int j=0;j<arr.length;j++){



			try{
				value=map.get(arr[j]);
				map.put(arr[j], value=value+1);
			}
			catch(Exception e){
				map.put(arr[j], 1);
			}
		}
//		System.out.println(map);

		for(int i=0;i<b.length()-s.length()+1;i++ ){
			temp.clear();;
			temp=new HashMap<String,Integer>();
			temp.putAll(map);;

			//			System.out.println(temp);
			for(int j=0;j<s.length();j++){



				if(b.substring(i+j, i+1+j).equals(arr[0])
					){

					value=temp.get(arr[0])-1;

					temp.put(arr[0], value);
					continue;

				}

				if(b.substring(i+j, i+1+j).equals(arr[1])
						){

					value=temp.get(arr[1])-1;

					temp.put(arr[1], value);
					continue;

				}

				if(b.substring(i+j, i+1+j).equals(arr[2])
					){

					value=temp.get(arr[2])-1;

					temp.put(arr[2], value);
					continue;

				}


				if(b.substring(i+j, i+1+j).equals(arr[3])
						){

					value=temp.get(arr[3])-1;

					temp.put(arr[3], value);
					continue;

				}

			}
			if(temp.get("a")==0&&temp.get("b")==0&&temp.get("c")==0){
				System.out.println(temp);
				System.out.println(b.substring(i, i+arr.length));
				count=count+1;

			}
			else{

			}

		}


		System.out.println("number of permutations : " + count);



	}


}

//answer---------------------
//{a=1, b=2, c=1}
//{a=0, b=0, c=0}
//cbab
//{a=0, b=0, c=0}
//cbba
//{a=0, b=0, c=0}
//abbc
//{a=0, b=0, c=0}
//bcba
//{a=0, b=0, c=0}
//cbab
//{a=0, b=0, c=0}
//cbab
//{a=0, b=0, c=0}
//babc
//number of permutations : 7