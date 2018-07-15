package Dynamic_Programming;

public class TheCoinChangeProblem {

	public static void main(String[] args) {
		int n =4;
		long[] c = {2,5,3,6};

		long ways = getWays(n, c);
		
		System.out.print("\n ways : " +ways);
	}
	static long getWays(long n, long[] c) {
		int[][] arr=new int[c.length+1][(int) n+1];

		for(int i=0;i<=c.length;i++) {

			for(int j=0;j<=n;j++) {
				
				if(i==0) {
					arr[i][j]=0;
				}else if(j==0) {
					arr[i][j]=1;
				}
				else if(j<c[i-1]) {
				
					arr[i][j]=arr[i-1][j];
				}else if(j>c[i-1]) {
					System.out.print(c[i-1]);
					arr[i][j]=arr[i][(int) (j-c[i-1])]+arr[i-1][j];
				}else {
					System.out.print(c[i-1]);
					arr[i][j]=arr[i-1][j]+1;
				}
			}
		}
		for(int i=0;i<=c.length;i++) {
			System.out.println("\n");
			for(int j=0;j<=n;j++) {
				System.out.print(" "+arr[i][j]);
			}
		}


		return arr[c.length][(int)n];
	}


}
