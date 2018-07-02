package methodEmbedding.Counting_Sheep.S.LYD1250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Counting {
	public static void main(String args[]) throws IOException{
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		int testCases;
		//System.out.println("Enter the test cases");
		testCases=Integer.parseInt(d.readLine());
		int[] totalNumbers=new int[testCases]; 
		for(int i=0;i<testCases;i++){
			totalNumbers[i]=Integer.parseInt(d.readLine());
		}
		
		for(int i=0;i<totalNumbers.length;i++){
			
			ArrayList<Integer> arr=new ArrayList<Integer>();
			int multiple=1;
			int lastNumber=0;
			while(arr.size()!=10 && totalNumbers[i]!=0){
				int newNumber=multiple*totalNumbers[i];
				lastNumber=newNumber;
				while(newNumber>0){
					int rem=newNumber%10;
					if(!arr.contains(rem)){
						arr.add(rem);
						
						if(arr.size()==10){
							System.out.println("Case #"+(i+1)+": "+lastNumber);
							break;
						}
					}
					newNumber/=10;
				}
				multiple++;
				testCases--;
			}
			
			if(totalNumbers[i]==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
		}
		
	}
}
