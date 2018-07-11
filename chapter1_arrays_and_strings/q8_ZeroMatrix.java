package chapter1_arrays_and_strings;

public class q8_ZeroMatrix {
	/*
	 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 1},
				{2, 3, 0, 5, 6},
				{7, 8, 9, 1, 2},
				{0, 4, 5, 6, 7},};
		makeZero(mat);
		}
	public static void makeZero(int[][] mat){
		boolean[] rows = new boolean[mat.length];
		boolean[] cols = new boolean[mat[0].length];
		
		for(int i=0;i<mat.length;i++){

			for(int j=0;j<mat[0].length;j++){

				if(mat[i][j]==0){
					rows[i]=cols[j]=true;
				}
			}
			
		}
		for(int i=0;i<mat.length;i++){

			for(int j=0;j<mat[0].length;j++){

				if(rows[i]||cols[j]){
					mat[i][j]=0;
							
				}
			}
			
		}
		
		printMatrix(mat);
		
	}
	public static void printMatrix(int[][] image){
		for(int i=0;i<image.length;i++){

			for(int j=0;j<image[0].length;j++){

				System.out.print(" "+image[i][j]);
			}
			System.out.print("\n");
		}
	}
}
