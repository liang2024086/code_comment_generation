package methodEmbedding.Cookie_Clicker_Alpha.S.LYD743;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter; 
import java.io.UnsupportedEncodingException;

class ProblemB{
	
	public static void main(String args[]){
		try {
		int t;
		double c, f, x;
		double time, sum;
		
		PrintWriter writer;

		writer = new PrintWriter("output.out", "UTF-8");

		Scanner in = new Scanner(new File("B-small-attempt1.in"));
		
		t = in.nextInt();
		
		for(int i=0; i<t; i++){
			c = in.nextDouble();
			f = in.nextDouble();
			x = in.nextDouble();
			time = 2.0;
			sum = 0.0;
			for(;;){
				if(x/time < c/time + x/(time+f)){
					sum+=x/time;
					break;
				}
				sum+= c/time;
				time+=f;
			}		
			writer.println("Case #"+(i+1)+": "+sum); 
		}
		writer.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
