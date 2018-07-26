package practiceExamples;
//- Write a program to check if a string is a Palindrome. ABBA is a palindrome. ANIRBAN is not a palindrome 
public class checkPalindromeString_HACHARY1 {

	public static void main(String[] args) {
		String str1="acbca";
		System.out.print("\n is palindrome : "+str1+" "+isPalindrome(str1));
		str1="abbca";
		System.out.print("\n is palindrome : "+str1+" "+isPalindrome(str1));
		str1="acbBca";
		System.out.print("\n is palindrome : "+str1+" "+isPalindrome(str1));
		str1="aBbca";
		System.out.print("\n is palindrome : "+str1+" "+isPalindrome(str1));
	}
	public static Boolean isPalindrome(String str){
		
		str=str.toLowerCase();
		int j=str.length()-1;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(j))
				return false;
			j--;
		}
		return true;
	}
}
