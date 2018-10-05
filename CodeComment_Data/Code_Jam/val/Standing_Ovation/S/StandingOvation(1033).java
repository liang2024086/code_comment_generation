package methodEmbedding.Standing_Ovation.S.LYD653;


import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int test=in.nextInt();
		int[] result=new int[test];
		for(int i=0;i<test;i++){
			int max=in.nextInt();
			String value=in.next();
			int count=0,diff=0;
			
			for(int j=0;j<value.length();j++){
				if(value.charAt(j)=='0')continue;
				if(count<j){
					diff=diff+(j-count);//System.out.println(diff+"**"+j);
					count=count+diff;
					char a=value.charAt(j);
					count=count+Character.getNumericValue(a);
				}else{
					char a=value.charAt(j);
					count=count+Character.getNumericValue(a);//System.out.println(count+"--");
					
				}
					
			}
			result[i]=diff;
					
		}
		
		for(int i=0;i<test;i++){
			System.out.println("Case #" +(i+1)+ ": " +result[i]);
		}
	}

}
