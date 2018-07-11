package practiceExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SolveCubicEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a,b,c,d and inregers between 1 to 1000
		//print a^3+b^3=c^3+d^3
		HashMap<Integer,List<List<Integer>>> map=new HashMap<Integer,List<List<Integer>>>();
		List<Integer> pair=new ArrayList<Integer>();
		List<List<Integer>> mapList =new ArrayList<List<Integer>>();
		int result;
		int n=10;
		for(int a=1;a<=n;a++){
			for(int b=1;b<=n;b++){
				result=(int) (Math.pow(a, 3)+Math.pow(b, 3));
			
				pair=null;
				pair=new ArrayList<Integer>();
				mapList=null;
				mapList =new ArrayList<List<Integer>>();
				try{
				if(!map.get(result).isEmpty()){
					pair.add(a);
					pair.add(b);
					mapList=map.get(result);
					mapList.add(pair);
					map.put(result, mapList);
					
				}else{
				
				pair.add(a);
				pair.add(b);
				mapList.add(pair);
				map.put(result, mapList);
				}
				}catch(Exception e){
					pair.add(a);
					pair.add(b);
					mapList.add(pair);
					map.put(result, mapList);
				}
			
			}	
		
			
		}
		System.out.println( map);
//		System.out.println(map);
				
		
		
	}

}
//answer---------------------
//{128=[[4, 4]], 1024=[[8, 8]], 513=[[1, 8], [8, 1]], 2=[[1, 1]], 1027=[[3, 10], [10, 3]], 133=[[2, 5], [5, 2]], 520=[[2, 8], [8, 2]], 9=[[1, 2], [2, 1]], 16=[[2, 2]], 407=[[4, 7], [7, 4]], 152=[[3, 5], [5, 3]], 280=[[4, 6], [6, 4]], 793=[[4, 9], [9, 4]], 539=[[3, 8], [8, 3]], 28=[[1, 3], [3, 1]], 35=[[2, 3], [3, 2]], 1064=[[4, 10], [10, 4]], 686=[[7, 7]], 559=[[6, 7], [7, 6]], 432=[[6, 6]], 1072=[[7, 9], [9, 7]], 945=[[6, 9], [9, 6]], 1458=[[9, 9]], 54=[[3, 3]], 189=[[4, 5], [5, 4]], 1343=[[7, 10], [10, 7]], 576=[[4, 8], [8, 4]], 1216=[[6, 10], [10, 6]], 65=[[1, 4], [4, 1]], 1729=[[9, 10], [10, 9]], 72=[[2, 4], [4, 2]], 2000=[[10, 10]], 468=[[5, 7], [7, 5]], 341=[[5, 6], [6, 5]], 854=[[5, 9], [9, 5]], 855=[[7, 8], [8, 7]], 344=[[1, 7], [7, 1]], 728=[[6, 8], [8, 6]], 217=[[1, 6], [6, 1]], 1241=[[8, 9], [9, 8]], 730=[[1, 9], [9, 1]], 91=[[3, 4], [4, 3]], 351=[[2, 7], [7, 2]], 224=[[2, 6], [6, 2]], 737=[[2, 9], [9, 2]], 1125=[[5, 10], [10, 5]], 1512=[[8, 10], [10, 8]], 1001=[[1, 10], [10, 1]], 1008=[[2, 10], [10, 2]], 370=[[3, 7], [7, 3]], 243=[[3, 6], [6, 3]], 756=[[3, 9], [9, 3]], 250=[[5, 5]], 637=[[5, 8], [8, 5]], 126=[[1, 5], [5, 1]]}
