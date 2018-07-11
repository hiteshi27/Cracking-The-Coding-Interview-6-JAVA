package Dynamic_Programming;
/*
 * Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.

Insert
Remove
Replace
 * 
 */
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1="geek",str2="gessek";
		System.out.println(str1+" "+str2+" "+checkDistanceRecursive(str1,str2,str1.length(),str2.length()));

		str1="cat";str2="cut";
		System.out.println(str1+" "+str2+" "+checkDistanceRecursive(str1,str2,str1.length(),str2.length()));

		str1="sunday";str2="saturday";
		System.out.println(str1+" "+str2+" "+checkDistanceRecursive(str1,str2,str1.length(),str2.length()));

	}
	public static int checkDistanceRecursive(String str1,String str2,int m , int n){//O(3^n)
		//start from last
		if(m==0)
			return n;
		if(n==0)
			return m;

		if(str1.charAt(m-1)==str2.charAt(n-1)){
			return checkDistanceRecursive(str1,str2,m-1,n-1);

		}


		return 1+min(checkDistanceRecursive(str1,str2,m,n-1),checkDistanceRecursive(str1,str2,m-1,n),checkDistanceRecursive(str1,str2,m-1,n-1));
	}
	public static int min(int x,int y , int z){
		if (x<=y && x<=z) return x;
		if (y<=x && y<=z) return y;
		else return z;
	}
	public static int max(int x,int y , int z){
		if (x>=y && x>=z) return x;
		if (y>=x && y>=z) return y;
		else return z;
	}

//	public static int checkDistanceIterative(String str1,String str2,int m , int n){
//		//start from last
//		if(m==0)
//			return n;
//		if(n==0)
//			return m;
//
//		if(str1.charAt(m-1)==str2.charAt(n-1)){
//			return checkDistanceRecursive(str1,str2,m-1,n-1);
//
//		}
//
//
//		return 1+min(checkDistanceRecursive(str1,str2,m,n-1),checkDistanceRecursive(str1,str2,m-1,n),checkDistanceRecursive(str1,str2,m-1,n-1));
//	}
}
