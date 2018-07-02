package methodEmbedding.Magic_Trick.S.LYD660;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class MagicTrick {

	
	
	
	
	public static void main(String[]args) throws NumberFormatException, IOException{
		
		BufferedReader r = new BufferedReader(new FileReader("input.in"));
		PrintWriter out=new PrintWriter(new FileWriter("MagicTrick.out"));
		
		
		int tests = Integer.parseInt(r.readLine());
		for(int t = 0 ; t<tests ; t++){
			
			int []a = new int[4];
			int first = Integer.parseInt(r.readLine().trim());
			
		for(int i = 0 ; i < 4 ; i++){
			StringTokenizer tkn = new StringTokenizer(r.readLine());
			if(i+1==first){
			for(int j = 0 ; j<4 ; j++){
				
			a[j]=Integer.parseInt(tkn.nextToken());	
				
				
			}
			}
			
		}
			
		int []b = new int[4];
		int second = Integer.parseInt(r.readLine().trim());
		
	for(int i = 0 ; i < 4 ; i++){
		StringTokenizer tkn = new StringTokenizer(r.readLine());
		if(i+1==second){
		for(int j = 0 ; j<4 ; j++){
			
		b[j]=Integer.parseInt(tkn.nextToken());	
			
			
		}
		}
		
	}
		int counter = 0 ;
		int value = 0;
		for(int i = 0 ; i < 4 ;i++){
			for(int j = 0 ; j<4 ; j++){
				
				if(a[i]==b[j]){
					counter++;
					value = a[i];
				}
				
				
				
			}

		}
		String response = "";
	if(counter == 1)response = ""+value;
	else if(counter > 0)response = "Bad magician!";
	else if(counter ==0)response = "Volunteer cheated!";
	out.println("Case #"+(t+1)+": "+response);
	System.out.println("Case #"+(t+1)+": "+response);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
