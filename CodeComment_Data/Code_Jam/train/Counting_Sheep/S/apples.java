package methodEmbedding.Counting_Sheep.S.LYD1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class apples {
	public static void main(String[] args){
		try{
			FileReader reader = new FileReader("A-small-attempt0.in");
			BufferedReader buffReader = new BufferedReader(reader);
			
			FileWriter writer = new FileWriter("output.txt");
			BufferedWriter buffWriter = new BufferedWriter(writer);
			
			String line=buffReader.readLine();
			int caseNum = 1;
			
			while ((line=buffReader.readLine())!=null){
				
				int n = Integer.parseInt(line.substring(0, line.length()));
				
				int[] digits = new int[10];
				for(int i: digits){
					digits[i]=0;
				}
				
				boolean asleep=false;
				
				String solution="";
				

				int counter=1;
				
				if (n>0){
				while(!asleep){
					
					
					
					for(int i=0;i<Integer.toString(counter*n).length();i++){
						//System.out.print(Integer.parseInt(Integer.toString(counter*n).substring(i, i+1)));
						digits[Integer.parseInt(Integer.toString(counter*n).substring(i, i+1))]=1;
					}
					
					asleep=true;
					for(int i: digits){
						if (i==0){
							asleep=false;
						}
					}
					
					counter++;
					
				}
				solution = Integer.toString((counter-1)*n);
				
				}
				else{ 
					solution = "INSOMNIA";
				}
				
				//System.out.println(Integer.toString(caseNum) + " " + solution);
				buffWriter.write("Case #" + Integer.toString(caseNum) + ": " + solution);
				buffWriter.newLine();
				
				caseNum++;
				
				
			}
			
			buffWriter.close();
			buffReader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
