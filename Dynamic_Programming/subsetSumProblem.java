package Dynamic_Programming;

public class subsetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int[] c= {3,34,4,12,2};
		System.out.print("\n is a way "+ n+" "+ifSum(n,c));
		
		n=1;
//		c= {3,34,4,12,2};
		System.out.print("\n is a way "+ n+" "+ifSum(n,c));
	}
	public static boolean ifSum(int n,int c[]) {
		int arr[][]= new int[c.length+1][n+1];

		for(int i=0;i<c.length+1;i++) {
			for(int j=0;j<n+1;j++) {
				if(i==0) {
					arr[i][j]=0;
				}
				else if(j==0) {
					arr[i][j]=0;
				}else if(j<c[i-1]) {
					arr[i][j]=arr[i][j-1];
				}else if(j==c[i-1]) {
					arr[i][j]=arr[i][j-1]+1;
				}else if(j>c[i-1]){
					arr[i][j]=arr[i][j-1]+arr[i][j-(int)c[i-1]];
				}else {
					
				}
			}
		}
		
		return arr[c.length][n]>0?true:false;
	}

}
