package chapter5_bit_manipulation;
/*
 * Flip Bit to Win: You have an integer and you can flip exactly one bit from a 0 to a 1. Write code to
find the length of the longest sequence of 1 s you could create.
 */
public class q3_FlipBitToWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1775;
		System.out.print("\n N : "+toBinary(n));
		System.out.print("\n longest sequense of 1s :"+findLongestSequence(toBinary(n)));
		 n=12;
		System.out.print("\n N : "+toBinary(n));
		System.out.print("\n longest sequense of 1s :"+findLongestSequence(toBinary(n)));
		 n=15;
		System.out.print("\n N : "+toBinary(n));
		System.out.print("\n longest sequense of 1s :"+findLongestSequence(toBinary(n)));
		 n=71;
		System.out.print("\n N : "+toBinary(n));
		System.out.print("\n longest sequense of 1s :"+findLongestSequence(toBinary(n)));
		System.out.print("\n N : "+"00000000000000000000011011101011");
		System.out.print("\n longest sequense of 1s :"+findLongestSequence("00000000000000000000011011101011"));
	
	}
	public static String  toBinary(int val){
		String binary="";
		
		for(int i=0;i<32;i++){
			int a=val&1;
			binary=a+binary;
			val=val>>1;
		
			
		}

		return binary;
	}
	public static int findLongestSequence(String bin){
		bin=" "+bin+" ";
		int counter=0,maxLen=0,posZero=0;
		System.out.print("\n ");
		for(int i=0;i<bin.length()-1;i++){
		
			if(bin.charAt(i+1)=='1'&&bin.charAt(i)=='0'){
				if(counter>0){
				counter=(i-posZero);
				}else {
					counter=1;
				}
				posZero=i;
			}
			else if(bin.charAt(i)=='1'&&counter>0){
				counter+=1;
			}
			else if(bin.charAt(i)=='0'&&bin.charAt(i-1)=='0'){
				
				posZero=i;
			}
			if(maxLen<counter){
				maxLen=counter;
			}

		}
			return maxLen;
	}
}
