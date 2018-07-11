package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sortLinesInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] file={"a2 dog cat","0 man man","a1 dog cat","a3 pig pig "};
		System.out.println("\n before sorting");
		for(String s:file){
			System.out.println(s);
		}
		System.out.println("\n after sorting");
		file=quickSort(file,0,file.length-1);
		for(String s:file){
			System.out.println(s);
		}
		
	}

	public static String[] quickSort(String[] file,int low,int high){
		if(high<low){
			return file;
		}


		String temp;
		int left=low,right=high;
		int i=left+1;

		while(i<=right){
//			System.out.println(file[i].split(" ",2)[0]);
//			System.out.println(file[i].split(" ",2)[1]);
//			System.out.println(file[left].split(" ",2)[0]);
//			System.out.println(file[left].split(" ",2)[1]);
			if(file[i].split(" ",2)[1].compareTo(file[left].split(" ",2)[1])==0){
//				System.out.println(file[i].split(" ",2)[1].compareTo(file[left].split(" ",2)[1]));
				if(file[i].split(" ",2)[0].compareTo(file[left].split(" ",2)[0])<0){

					temp=file[i];
					file[i]=file[left];
					file[left]=temp;
					left++;
					i++;
				}else if(file[i].split(" ",2)[0].compareTo(file[left].split(" ",2)[0])>0){
					temp=file[i];

					file[i]=file[right];
					file[right]=temp;
					right--;
				}else{
					i++;
				}


			}else if(file[i].split(" ",2)[1].compareTo(file[left].split(" ",2)[1])<0){
				temp=file[i];
				file[i]=file[left];
				file[left]=temp;
				left++;
				i++;
			}else if(file[i].split(" ",2)[1].compareTo(file[left].split(" ",2)[1])>0){
				temp=file[i];

				file[i]=file[right];
				file[right]=temp;
				right--;
			}else{
				i++;
				}

		}

		file=quickSort(file,low,left-1);
		file=quickSort(file,right+1,high);

		return file;
	}

}