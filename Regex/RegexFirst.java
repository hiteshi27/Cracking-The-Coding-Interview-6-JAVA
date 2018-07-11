package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		match();
		match1();
	}


	private static String INPUT = "The dog says meow. " + "All dogs say meow.";


	public static void match() {
		Pattern p=Pattern.compile(" ");
		Matcher m = p.matcher(INPUT); 
		INPUT = m.replaceAll(".");
		System.out.println(INPUT);
	}



	public static void match1(  ) {
		String REGEX = "\\bcat\\b"; //without\\b , it matches to cattie also as a substring
		String INPUT = "cat cat cat cattie cat";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);   // get a matcher object
		int count = 0;

		while(m.find()) {
			count++;
			System.out.println("Match number "+count);
			System.out.println("start(): "+m.start());
			System.out.println("end(): "+m.end());
		}
	}

}
