package chapter1_arrays_and_strings;
/*
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class q7_RotateMatrix {
	public static void main(String[] args) {
		int[][] image = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 1},
				{2, 3, 4, 5, 6},
				{7, 8, 9, 1, 2},
				{3, 4, 5, 6, 7},};

		System.out.print(rotateMatrix(image));
	}
	public static Boolean rotateMatrix(int[][] image){
		if(image.length==0||image[0].length!=image.length){
			return false;
		}
		int first=0,last=0,n=image.length,temp=0;
		for(int i=0;i<image[0].length;i++){
			first=i;
			last=n-1-i;
			for(int j=first;j<last;j++){
				int offset=j-first;

				temp=image[first][j];
				image[first][j]=image[last-offset][first];
				image[last-offset][first]=image[last][last-offset];
				image[last][last-offset]=image[j][last];
				image[j][last]=temp;



			}	

		}
		printMatrix(image);

		return true;


	}
	public static void printMatrix(int[][] image){
		for(int i=0;i<image[0].length;i++){

			for(int j=0;j<image.length;j++){

				System.out.print(" "+image[i][j]);
			}
			System.out.print("\n");
		}
	}
}
