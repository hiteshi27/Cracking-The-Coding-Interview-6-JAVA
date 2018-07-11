package practiceExamples;

public class ReverseString {

	public static void main(String[] args) {
		String s="madaM to Adam";
		System.out.println(reverse(s));

	}
	public static String reverse(String s){
		char temp=' ';
		char[] chars=s.toCharArray();
		int last=chars.length;
		for(int i=0;i<chars.length/2;i++){
			
			temp=chars[i];
			chars[i]=chars[last-1];
			chars[last-1]=temp;
			last--;
		}
		return new String(chars);
				
	}

}
