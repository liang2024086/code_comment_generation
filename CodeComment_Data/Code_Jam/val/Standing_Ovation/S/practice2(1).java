package methodEmbedding.Standing_Ovation.S.LYD399;

import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
public class practice2 {
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(new File("input"));
			
			int N = sc.nextInt();
			
			int caseNum = 1;
			while (caseNum<=N){
				int maxShy = sc.nextInt();
				String people = sc.next();
				ArrayList<Integer> shypeople = new ArrayList<Integer>();
				for (Character c :people.toCharArray()){
					shypeople.add(Integer.parseInt(c.toString()));
				}
				int index = maxShy ;
				int req = maxShy;
				int count =0;
				while (index >= 0 ){
					int sum=0;
					if (shypeople.get(index)==0){
						index--;
						continue;
					}
					for (int i=index-1;i>=0;i--){
						sum+=shypeople.get(i);
					}					
					if (sum<index){
						sum = (index-sum);
						if (sum > count){
							count = sum;
						}
					}
					index--;
				}
				System.out.println("Case #"+ caseNum + ": "+count);
				
			
				caseNum++;
			}
			//System.out.println(new DecimalFormat("#.#######").format(2000f/3f));
		}catch (Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
