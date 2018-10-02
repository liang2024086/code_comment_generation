package methodEmbedding.Counting_Sheep.S.LYD1088;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class CountingSheep {

	public static void main(String[] args){
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("result.out")));
						
			int nCase = Integer.valueOf(br.readLine());
			
			for(int i=0;i<nCase;i++){
				Map digits = new HashMap();
				digits.put("0", "0");
				digits.put("1", "1");
				digits.put("2", "2");
				digits.put("3", "3");
				digits.put("4", "4");
				digits.put("5", "5");
				digits.put("6", "6");
				digits.put("7", "7");
				digits.put("8", "8");
				digits.put("9", "9");
				
				int n = Integer.valueOf(br.readLine());
				
				if(n == 0){
					out.println("Case #"+(i+1)+": INSOMNIA");
					continue;
				}
				
				int mult = 1;
				int tmp = 0;
				while(!digits.isEmpty()){
					tmp = n*mult;
					char[] arr = String.valueOf(tmp).toCharArray();
					
					for(char a : arr){
						digits.remove(String.valueOf(a));
					}
					mult++;
				}
				out.println("Case #"+(i+1)+": "+tmp);
			}
			
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
