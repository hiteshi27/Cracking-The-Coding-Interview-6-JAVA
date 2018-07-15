package Dynamic_Programming;

import java.util.Arrays;

/*
 * Given a n*n matrix where all numbers are distinct, find the maximum length path (starting from any cell) 
 * such that all cells along the path are in increasing order with a difference of 1.
 * Input:  mat[][] = {{1, 2, 9}
                   {5, 3, 8}
                   {4, 6, 7}}
Output: 4
The longest path is 6-7-8-9. 
 */
public class LongestPathInMatrix {

	public static void main(String[] args) {
		int mat[][] = {{1, 2, 9},
				{5, 3, 8}, 
				{4, 6, 7}};
	
	System.out.println("\n longest path length :"+findLongestOverAll(mat));	
	}
	public static int getPath(int[][] mat,int i,int j,int[][] dist,int n) {
		if (i<0 || i>=n || j<0 || j>=n)
			return 0;
		if(dist[i][j]!=-1)
			return dist[i][j];
		
		if(dist[i][j]<0) {
		
			
			if(j<n-1&&mat[i][j]+1==mat[i][j+1]) {
				return dist[i][j]=1+getPath(mat,i,j+1,dist,n);
			}
			if(i<n-1&&mat[i][j]+1==mat[i+1][j]) {
				return dist[i][j]=1+getPath(mat,i+1,j,dist,n);
			}
			if(i>0&&mat[i][j]+1==mat[i-1][j]) {
				return dist[i][j]=1+getPath(mat,i-1,j,dist,n);
			}
			if (j>0&&mat[i][j]+1==mat[i][j-1]) {
				return dist[i][j]=1+getPath(mat,i,j-1,dist,n);
			}
		}
		
		return dist[i][j]=1;
	}
	public static int findLongestOverAll(int mat[][]) {
		int n=mat.length;
		int maxLen=0;
		int[][] dist=new int[n][n];
		for(int k=0;k<n;k++) {
			Arrays.fill(dist[k],-1);
		}
		for(int k=0;k<n;k++) {
			for(int l=0;l<n;l++) {
					maxLen=max(maxLen,getPath(mat,k,l,dist,n));
			}	
		}
		return maxLen;
	}
	public static int max(int x,int y) {
		return x>y?x:y;
	}
}
