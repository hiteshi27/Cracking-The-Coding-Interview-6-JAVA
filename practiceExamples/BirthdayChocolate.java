package practiceExamples;

import java.util.Scanner;

/*
 * Birthday Chocolate
Lily has a chocolate bar with numbered squares. She wants to share it with Ron for his birthday. She
decides to share a contiguous segment of the bar selected such that the sum of the integers on the
squares is equal to a given value. The length of the segment will match Ron's birth month. The sum of the
segments will match his birth day. You must determine how many ways she can divide the chocolate.
Consider the chocolate bar as an array of squares, . She wants to find segments
summing to Ron's birth day, with a length equalling his birth month, . In this case, there are
two segments meeting her criteria.
Input Format
The first line contains an integer , the number of squares in the chocolate bar.
The second line contains space-separated integers , the numbers on the chocolate squares where
.
The third line contains two space-separated integers, and , Ron's birth day and his birth month.
Constraints

Output Format
Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with
Ron.


Sample Input 0
5
1 2 1 3 2
3 2
Sample Output 0
2


Sample Input 1
19
2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1
18 7
Sample Output 1
3

 */
public class BirthdayChocolate {

	public static void main(String[] args) {
		int length, squares[],day,month;
		//read input-------------------------------------------------------
		Scanner sc = new Scanner(System.in);

		length=sc.nextInt();

		//check constraints---------------------------------------------------
		if(length<1||length>100){
			System.out.print("\n1<= segment length <=100\nExit");
			return;
		}

		squares=new int[length];
		for (int i=0;i<length;i++){//arr1
			squares[i]=sc.nextInt();

			//check constraints---------------------------------------------------
			if(squares[i]>5){
				System.out.print("\nsegment value should be less than 5\nExit");
				return;
			}

		}

		day=sc.nextInt();
		month=sc.nextInt();

		//check constraints---------------------------------------------------

		if(day<1||day>31){
			System.out.print("\n1<= birth day <=31\nExit");
			return;
		}
		if(month<1||month>12){
			System.out.print("\n1<= month <=12\nExit"); 
			return;
		}


		//print input-------------------------------------------------------

		System.out.print("\nLength of chocolate bar: "+length);
		System.out.print("\nValue of squares in the chocolate bar: ");
		for (int i=0;i<length;i++){//arr1
			System.out.print(squares[i]+ " ");
		}
		System.out.print("\nRon's birthday and month: "+day+" "+month);

		//print result-------------------------------------------------------

		//O(n)
		findNumOfSegments1(length,squares,day,month);
		
		//O(n^2)
		findNumOfSegments2(length,squares,day,month);


	}
	//O(n) //nested for loops-----------------------------------------------
	public static void findNumOfSegments1(int length,int squares[],int day,int month){

		int count=0;
		int sum=0;
		for(int i=0;i<length;i++){
			
			sum+=squares[i];
			if(i>=month){
				sum-=squares[i-month];				
			}			
			if(i>=month-1&&sum==day){
				count++;
			}

		}
		System.out.print("\nnumber of segments are: "+count);
	}


	//O(n^2) //nested for loops-----------------------------------------------
	public static void findNumOfSegments2(int length,int squares[],int day,int month){//O(n^2) //nested for loops
		int tempLen=0;
		int count=0;
		int sum=0;
		for(int i=0;i<=length-month;i++){
			sum=0;
			for(int j=i;j<i+month;j++){
				if(sum>day){
					break;
				}
				sum+=squares[j];
			}
			if(sum==day){
				count++;
			}
		}
		System.out.print("\nnumber of segments are: "+count);
	}

}
