package Regex;

import java.util.regex.Pattern;

public class SplitWithRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	splitStr("129.123.234.332");
	
	
	System.out.println("\n");
	
	
		String str = "geekss@for@geekss";
		String [] arrOfStr = str.split("s",3);

		for (String a : arrOfStr)
			System.out.println(a);

		arrOfStr = str.split("s",0);

		for (String a : arrOfStr)
			System.out.println(a);
		arrOfStr = str.split("s",-3);

		for (String a : arrOfStr)
			System.out.println(a);
	}
	public static void splitStr(String str){
		String[] strArr=null;

		strArr=str.split("\\.");
		for (String a : strArr){
			System.out.println(a);
			if(a.length()<=3){
				System.out.println(a.matches("[0-2]{1}[0-2]"));
			}
		} 
		System.out.println(str.matches("/^\f+\\.\f+\\.\f+\\.\f+$/"));
		return ;

	}
}
