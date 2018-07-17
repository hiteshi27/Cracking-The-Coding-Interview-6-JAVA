package chapter5_bit_manipulation;
/*
 * Next Number: Given a positive integer, print the next smallest and the next largest number that
have the same number of 1 bits in their binary representation.
 */
public class q4_NextNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1775;
		System.out.print("\n N : "+toBinary(n));
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
}
