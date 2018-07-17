package chapter5_bit_manipulation;
/*
 * Insertion: You are given two 32-bit numbers, Nand M, and two bit positions, i and j. Write a method
to insert Minto N such that 
M starts at bit j and ends at bit i.
 You can assume that the bits j through
i have enough space to fit all of M. That is, if M = 18811, you can assume that there are at least 5
bits between j and i. You would not, for example, have j = 3 and i = 2, because M could not fully
fit between bit 3 and bit 2.
 */
public class q1_Insertion {

	public static void main(String[] args) {
		 int N=12345;
		int M=12;
		System.out.print("\n N : "+toBinary(N));
		System.out.print("\n M : "+toBinary(M));
		insert(M,N,8,5);
	}
	public static String  toBinary(int val){
		String binary="";
		
		for(int i=0;i<32;i++){
			int a=val&1;
			binary=a+binary;
//			val=val/2; 
			val=val>>1;
		
			
		}

		return binary;
	}
	public static void insert(int M,int N, int j, int i){
		String newBinary="";
		
		if(i>=32||j<i){
			return ;
		}
		int left=(~0)<<(j+1);//all ones till befor j
		System.out.print("\n Ledt : "+toBinary(left));
//		int right =((1<<i)-1);// all ones after i
		int right =~((~0)<<i);
		System.out.print("\n Right : "+toBinary(right));
		int mask = left|right;
		System.out.print("\n Mask : "+toBinary(mask));
		System.out.print("\n Masked N : "+toBinary((N&mask)));
		System.out.print("\n Insert M in N : "+toBinary((N&mask|N<<i)));
		
	}

}
