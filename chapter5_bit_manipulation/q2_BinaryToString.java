package chapter5_bit_manipulation;
/*
 * Binary to String: Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double,
print the binary representation. If the number cannot be represented accurately in binary with at
most 32 characters, print "ERROR:'
 */
public class q2_BinaryToString {

	public static void main(String[] args) {
		Double num=0.15;
		//		System.out.print("\n  "+num.SIZE);	
		System.out.print("\n  "+toBinary(num));
	}
	public static String  toBinary(Double num){
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}
//		System.out.println(num.);
		StringBuilder binary = new StringBuilder();
		double frac = 0.5;
		binary.append(".");
		int bin=~0;
		while (num > 0) {
			/* Setting a limit on length: 32 characters */
			if (binary.length() >= 32) {
//				bin2dec(binary.toString());
				return binary.toString();
			}
			if (num >= frac) {
				
				binary.append(1);
				num -= frac;
			} else {
				binary.append(0);
			}
			frac /=0.5;
		}
//		bin2dec(binary.toString());
		return binary.toString();
	}
	public static void bin2dec(String bin){
		bin=bin+" ";
		double count=0;
		for(int i=1;i<=bin.split("\\.")[1].length();i++){
//			System.out.println(bin.split("\\.")[1].substring(i, i+1));
			if(bin.split("\\.")[1].substring(i, i+1).equals("1")){
				count=(count+(Math.pow(0.5,i)));
				
			}else{
//				count=(int) (count+(Math.pow(2,0)));
			}
		
		}
		System.out.println("count" +count);
	}
}
