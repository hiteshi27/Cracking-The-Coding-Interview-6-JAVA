package chapter1_arrays_and_strings;
/*

 q3_URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string.
 */
public class q3_URLify {
/*
 * create a new string and append characters from old string. when " " is encountered, append "%20".
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="mr john Smith    ";
		System.out.println("actual length : "+str.length());
		int trueLength=str.trim().length();
		System.out.println("true length : "+trueLength);
		
		System.out.println(replaceSpace( str, trueLength));
	}
	public static String replaceSpace(String str,int trueLength){
		
		String newStr="";
		for(int i=0;i<trueLength;i++){
			if(str.substring(i, i+1).equals(" ")){
				newStr=newStr+"%20";
			}else{
				newStr=newStr+str.substring(i, i+1);
			}
		}
			
		
		return newStr;
	}
}
