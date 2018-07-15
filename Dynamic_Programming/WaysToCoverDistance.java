package Dynamic_Programming;

public class WaysToCoverDistance {

	public static void main(String[] args) {
		int n =5;
		long[] c = {1,2,3};

		long ways = getWays(n, c);

		System.out.print("\n ways : " +ways);
		
		 ways = getWaysRecursion(n, c);

		System.out.print("\n ways : " +ways);
	}
	public static long getWays(long n, long[] c) {//O(n) time , O(m) space
		/*
		 *  0 0 0 1 2 3 4 5 
		 *  0 0 1 1 2 4 7 13
		 */

		long[] ways=new long[(int)n+3];
		for(int i=0;i<n+3;i++) {
			if(i<2)
				ways[i]=0;
			else if(i==2)
				ways[i]=1;
			else if(i>=3)
				ways[i]=ways[i-1]+ways[i-2]+ways[i-3];
			
			System.out.print(" "+ways[i]);

		}


		return ways[(int)n+3-1];
	}
	public static long getWaysRecursion(long n, long[] c) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
	return getWaysRecursion(n-1,c)+getWaysRecursion(n-2,c)+getWaysRecursion(n-3,c);
	}

}
