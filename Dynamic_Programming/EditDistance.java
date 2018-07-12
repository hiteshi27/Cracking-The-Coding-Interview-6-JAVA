package Dynamic_Programming;
/*
 * Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert �str1� into �str2�.

Insert
Remove
Replace
 * 
 */
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1="geek",str2="gessek";
		System.out.println(str1+" "+str2+" "+checkDistanceIterative2DArray(str1,str2));
		System.out.println(str1+" "+str2+" "+checkDistanceRecursive(str1,str2,str1.length(),str2.length()));

		str1="cat";str2="cut";
		System.out.println(str1+" "+str2+" "+checkDistanceIterative2DArray(str1,str2));
		System.out.println(str1+" "+str2+" "+checkDistanceRecursive(str1,str2,str1.length(),str2.length()));

		str1="sunday";str2="saturday";
		System.out.println(str1+" "+str2+" "+checkDistanceIterative2DArray(str1,str2));
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

	public static int checkDistanceIterative2DArray(String str1,String str2){//O(n^2)
		/*
		 *     S U N D A Y 
		 *   0 1 2 3 4 5 6 
		 * S 1 0 1 2 3 4 5
		 * A 2 1 1 2 3 3 4
		 * T 3 2 2 2 3 4 4
		 * U 4 3 2 3 3 4 5 
		 * R 5 4 3 3 4 4 5 
		 * D 6 5 4 4 3 4 5
		 * A 7 6 5 5 4 3 4
		 * Y 8 7 6 6 5 4 3
		 */
		String lcs="";
		int m=str1.length();
		int n=str2.length();

		int[][] adj=new int[m+1][n+1];

		for(int i=0;i<m+1;i++){

			for(int j=0;j<n+1;j++){
				if(i==0) {
					adj[i][j]=j;
				}
				else if(j==0) {
					adj[i][j]=i;
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1)){
					adj[i][j]=adj[i-1][j-1];


				}else{
					adj[i][j]=1+min(adj[i][j-1],adj[i-1][j],adj[i-1][j-1]);

				}

			}
		}
		System.out.println();
		// print matrix
		for(int i=0;i<m+1;i++){
			System.out.println();
			for(int j=0;j<n+1;j++){
				System.out.print(" "+adj[i][j]);

			}
		}
		System.out.println();
		return adj[m][n];
	}
}
