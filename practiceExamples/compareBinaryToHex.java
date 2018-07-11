package practiceExamples;

public class compareBinaryToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Are equal : " + compareBinToHex("1100", "C"));
		
	}
	
	public static boolean compareBinToHex(String binary, String hex) {
		
		int n1=covertBasetoInt(binary,2);
		int n2=covertBasetoInt(hex,16);
		System.out.println("binary : "+binary+" = "+n1);
		System.out.println("hexadecimal : "+hex+" = "+n2);
		
		if(n1<0||n2<0){
			return false;
		}
		return n1==n2;
		
		
	}
	public static int covertBasetoInt(String number,int base){
		
		int val=0;
		if(base<2||(base>10&&base!=16)){
			return -1;
		}
		
		
		for(int i=number.length()-1;i>=0;i--){
			
			int digit=digitToValue(number.charAt(i));
//			System.out.println(digit);
			if(digit<0||digit>=base){
				return -1;
			}
			int exp=number.length()-1-i;
		
			val=(int) (val+(digit*Math.pow(base, exp)));
			
		}
		return val;
		
		
	}
	public static int digitToValue(char c){
		int val=0;
		switch(c){
		
		case '0':val=c-'0';
			break;
		case '1':val=c-'0';
			break;
		case '2':val=c-'0';
			break;
		case '3':val=c-'0';
			break;
		case '4':val=c-'0';
			break;
		case '5':val=c-'0';
			break;
		case '6':val=c-'0';
			break;
		case '7':val=c-'0';
			break;
		case '8':val=c-'0';
			break;
		case '9':val=c-'0';
			break;
		case 'A':val=10;
			break;
		case 'B':val=11;
			break;
		case 'C':val=12;
			break;
		case 'D':val=13;
			break;
		case 'E':val=14;
			break;
		case 'F':val=15;
			break;
		}
		
		return val;
		
	}
}
