package practiceExamples;

public class sumOfExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		expTerm[] exp1={};
		exp1[0].coeff=0;exp1[0].exp=0;
		exp1[1].coeff=1;exp1[1].exp=1;
		exp1[2].coeff=2;exp1[2].exp=2;
		exp1[3].coeff=3;exp1[3].exp=3;
		expTerm[] exp2=exp1;
		sum(exp1,exp2);
		
		
	}
	
	public static void sum(expTerm[] exp1,expTerm[] exp2){
		
		
	}
	class expTerm{
		int exp;
		int coeff;
	}
}
