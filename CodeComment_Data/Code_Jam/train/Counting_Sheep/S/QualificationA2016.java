package methodEmbedding.Counting_Sheep.S.LYD774;

import java.io.*;
import java.util.*;

public class QualificationA2016 {
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			Set<Integer> digits = new HashSet<Integer>();
			for(int j=0;j<10;j++){
				digits.add(j);
			}
			int top=i+1;
			int k=sc.nextInt();
			String toparse = Integer.toString(k);
			int count=0;
			
			if(k!=0){
				while(!digits.isEmpty()){
					count+=1;
					toparse=Integer.toString(k*count);
					for(int j=0;j<toparse.length();j++){
						int test = Character.digit(toparse.charAt(j), 10);
						if(digits.contains((Integer)test)){
							digits.remove(test);
						}
					}
				}
				int answer=count*k;
				System.out.println("Case #"+top+": "+answer);
			}
			else{
				System.out.println("Case #"+top+": INSOMNIA");
			}
		}
	}

}
