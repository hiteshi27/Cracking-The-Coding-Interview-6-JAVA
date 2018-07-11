package chapter1_arrays_and_strings;
/*
 * One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
 */
public class q5_OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="bals",s2="bales";
System.out.println("\n"+s1);
System.out.println("\n"+s2);
System.out.println("\n is one edit away : " + editAway(s1,s2));
	}
	
	public static Boolean editAway(String s1,String s2){
		int valid=0;
		//case 1 check string length
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)!=s2.charAt(i)){
					valid+=1;
				}
				if(valid>1){
					return false;
				}
			}
		}else if(s1.length()<s2.length()&&(s2.length()-s1.length())==1){
//			valid+=1;
			s1=s1+" ";
			for(int i=0;i<s1.length()-1;i++){
				if((s2.length()-s1.length()==0)&&s1.charAt(i)!=s2.charAt(i)&&s1.charAt(i+1)==s2.charAt(i+1)){
					valid+=1;
					
				}
				else if((s2.length()-s1.length()==0)&&s1.charAt(i)!=s2.charAt(i)&&s1.charAt(i)==s2.charAt(i+1)){
					valid+=1;
					s1=s1.substring(0, i)+" "+s1.substring(i, s2.length());
				}else if((s1.length()-s2.length()==1)&&s2.charAt(i)!=s1.charAt(i)){
					valid+=1;
				}
				if(valid>1){
					return false;
				}

			}
			
		}else if(s2.length()<s1.length()&&(s1.length()-s2.length())==1){

			s2=s2+" ";
		
			for(int i=0;i<s2.length()-1;i++){
			
				
				if((s1.length()-s2.length()==0)&&s2.charAt(i)!=s1.charAt(i)&&s2.charAt(i+1)==s1.charAt(i+1)){
					valid+=1;
					
				
					
				}
				else if((s1.length()-s2.length()==0)&&s2.charAt(i)!=s1.charAt(i)&&s2.charAt(i)==s1.charAt(i+1)){
					valid+=1;
					s2=s2.substring(0, i)+" "+s2.substring(i, s2.length());
				}else if((s1.length()-s2.length()==-1)&&s1.charAt(i)!=s2.charAt(i)){
					valid+=1;
				}
				if(valid>1){
					return false;
				}

			}
			
		}else if((s1.length()-s2.length())>1||(s1.length()-s2.length())<-1){
			return false;
		}
		return true;
	}

}
