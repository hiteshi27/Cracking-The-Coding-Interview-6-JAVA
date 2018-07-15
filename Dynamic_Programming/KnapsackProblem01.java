package Dynamic_Programming;

public class KnapsackProblem01 {

	public static void main(String[] args) {
		int[] weights= {10,20,30};
		int[] val= {60,100,120};
		int W=50;
		System.out.print("\ngiven weight value "+W);
		System.out.print("\nMax value "+getMaxValue(weights,val,W));
	}
	public static int getMaxValue(int[] weights,int[] val, int W) {
		int n=weights.length;
		int[][] arr=new int[n+1][W+1];

		for(int i=0;i<=n;i++) {
			for(int j=0;j<=W;j++) {
				if(i==0||j==0) {
					arr[i][j]=0;
				}else if(j<weights[i-1]) {
					arr[i][j]=arr[i][j-1];
				}else if(j>=weights[i-1]) {
					arr[i][j]=max(val[i-1]+arr[i-1][j-weights[i-1]],arr[i-1][j]);
				}
			}
		}
		int i=n,j=W;

			System.out.print("\nweights : ");

			while(j>0) {
				if(j<=0||i<=0)
					break;

				if(arr[i][j]>arr[i-1][j]&&(i-1!=0||j-1!=0)) {
					System.out.print("  "+weights[i-1]);					
					j-=weights[i-1];
					i-=1;
					
				}

				if(j<=0||i<=0)
					break;

			}

		return arr[n][W];
	}
	public static int max(int x,int y) {
		return x>y?x:y;
	}

}
