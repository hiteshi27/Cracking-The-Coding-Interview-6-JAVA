package practiceExamples;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n"+fib(6));
		
	}
	
	public static int fib(int n){
	
		 return n <= 1 ? n : fib(n-1) + fib(n-2);
	}
}
