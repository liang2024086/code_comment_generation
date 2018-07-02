package methodEmbedding.Counting_Sheep.S.LYD189;

import java.io.*;
import java.util.*;

public class Solution_gc_1{
	
	public static void main(String[] args){

	try{
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		try{
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		

	
		int t = Integer.parseInt(br.readLine());
		
		int target = (1<<10) - 1;
		for(int j=1;j<=t;j++){

			long n= Integer.parseInt(br.readLine());
			
			if(n==0){
				writer.println("Case #"+j+": INSOMNIA");
				System.out.println("Case #"+j+": INSOMNIA");

				continue;
			}

			int k = 1;
			int total = 0;
			while(total != target){
				
				long num = k * n;
				while(num>0){
					long d = num % 10;
					total |= (1<<d);
					num /= 10;
				}
				
				//System.out.println((k*n) +" "+ Integer.toBinaryString(total)+" "+Integer.toBinaryString(target));
				k++;
			}

			writer.println("Case #"+j+": " + ((k-1)*n) );
			System.out.println("Case #"+j+": " + ((k-1)*n));

		}
		
		writer.close();
		}
		catch(Exception e){
			System.out.println("File not found");
		}	
		}
		catch(Exception e){
			System.out.println("Problems with read");
		}
	}

}
