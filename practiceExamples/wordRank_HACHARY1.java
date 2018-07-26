package practiceExamples;
//– Rank words in a string. Problem and solution attached

/*
 * given array of strings
 * sort the array from order of lowest to highest score
 * score is determined by adding the value of each character in the string
 * B=2...Z=26 score based on position of alphabet
 * vowels 2*position A=2
 * score not impacted bt case of letter
 */

public class wordRank_HACHARY1 {//O(n^2)

	public static void main(String[] args) {
		String[] strArr={"ALWAYS","this", "so","That", "there"};
		System.out.print("\n un-sorted array :");
		printArray(strArr);//unsorted
	
		printArray(ranks(strArr));//sorted
	}
	public static String[] ranks(String[] strArr){//O(n^2)
		if(strArr.length>0){
			int score[]=findScoreArray(strArr);//O(n^2)
			System.out.print("\n scores :");printArray(score);
			return Quicksort(strArr, score,0,strArr.length-1);//O(nlogn)
		}

		return strArr;
	}

	//sort array
	public static String[] Quicksort(String[] strArr,int score[], int l,int r){//O(nlogn)
		if(r<1){
			return strArr;
		}
		if(l<r){
			int pivot = score[r];
			String tempS;
			int tempI;
			int pos=l-1;
			for(int i=l;i<r;i++){
				if(score[i]<=pivot){
					pos++;
					tempS=strArr[i];
					strArr[i]=strArr[pos];
					strArr[pos]=tempS;	
					
					tempI=score[i];
					score[i]=score[pos];
					score[pos]=tempI;	
				}
			}
			tempS=strArr[r];
			strArr[r]=strArr[pos+1];
			strArr[pos+1]=tempS;
			tempI=score[r];
			score[r]=score[pos+1];
			score[pos+1]=tempI;	
			strArr=Quicksort(strArr,score,0,pos);
			strArr=Quicksort(strArr,score,pos+1,r);

		}
		return strArr;	
	}
	//score array
	public static int[] findScoreArray(String[] strArr){//O(n^2)
		int score[]=new int[strArr.length];
		for(int i=0;i<strArr.length;i++){
			score[i]= findScore( strArr[i]);
		}
		return score;
	}
	
	//score string
	public static int findScore(String str){
		int score=0;
		str=str.toLowerCase();
		for(int i=0; i<str.toCharArray().length;i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				score+=2*(str.charAt(i)-'a'+1);
			}else{
				score+=str.charAt(i)-'a'+1;
			}
		}
		return score;
	}
	
	//print array
	public static void printArray(String arr[]){
		System.out.print("\n\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print("\n\n");
	}
	public static void printArray(int arr[]){
		System.out.print("\n\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print("\n\n");
	}
}
