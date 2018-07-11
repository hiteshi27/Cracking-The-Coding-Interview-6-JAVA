package chapter1_arrays_and_strings;
/*
 * String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class q6_StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabccccccddavvvt";
		String str1="abcde";

		System.out.println("\n original : "+str);
		System.out.println("\n compressed : "+compressed1( str));
		System.out.println("\n compressed : "+compressed2( str));	
		System.out.println("\n original : "+str1);
		System.out.println("\n compressed : "+compressed1( str1));
		System.out.println("\n compressed : "+compressed2( str1));
	}
	//using only for loop
	public static String compressed1(String str){

		int count=0;
		String newStr="";
		for(int i=0;i<str.length();i++){
			count++;
			if((i+1)>=str.length()||str.charAt(i)!=str.charAt(i+1)){
				newStr=newStr+str.charAt(i)+count;
				count=0;
			}

	
		}

		return newStr.length()<str.length()?newStr:str;
	}
	//using for & while loop
	public static String compressed2(String str){


		int count=0;
		String newStr=new String();
		for(int i=0;i<str.length();i++){
			newStr=newStr+str.substring(i, i+1);
			count=0;
			int j=i;

			while(j!=str.length()&&str.charAt(j)==str.charAt(i)){
				j=j+1;
				count=count+1;
			}
			i=j-1;
			newStr=newStr+count;

		}
		return newStr.length()<str.length()?newStr:str;
	}

}
