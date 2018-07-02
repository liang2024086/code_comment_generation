package methodEmbedding.Counting_Sheep.S.LYD930;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Sheep {
	
	public static void main(String args[])
	{
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\A-small-attempt0.in")))
		{
			FileWriter fileWriter =   new FileWriter("D:\\A-small-attempt0.out");
			BufferedWriter bw =   new BufferedWriter(fileWriter);
			int loop = Integer.parseInt(br.readLine());
			int input=0;
			String output;
			int counter;
			int digit;
			int current;
			ArrayList<Integer> checker;
			for(int i=1;i<=loop;i++){
				input=Integer.parseInt(br.readLine());
				checker=new ArrayList<Integer>();
				if(input==0){
					output="Case #"+i+": "+"INSOMNIA";
				}else{
					counter=0;
					while(checker.size()<10){
						counter++;
						current=input*counter;
						while(current>0){
							digit=current%10;
							if(!checker.contains(digit)){
								checker.add(digit);
							}
							current=current/10;
						}
					}
					output="Case #"+i+": "+(input*counter);
				}
				bw.write(output);
				bw.newLine();
			}				
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
