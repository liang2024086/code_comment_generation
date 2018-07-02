package methodEmbedding.Speaking_in_Tongues.S.LYD696;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SolutionA {
	public static void main(String[] args){
		//Open file connections
		Scanner in = null;
		BufferedWriter out = null;
		try{
			in = new Scanner(new File("A-small-attempt0.in"));
			out = new BufferedWriter(new FileWriter("result.out" , false));
		}catch(Exception e){}

		//Variables
		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		String googlela = "ynficwlbkuomxsevzpdrjgthaq ";
		
		int n;
		String output = "";
		//number of cases
		n = Integer.parseInt(in.nextLine());
		for(int a = 0; a < n; a++){
			String holder = in.nextLine();
			String result = "";
			for(int b = 0; b < holder.length(); b++){
				for(int c = 0; c < googlela.length(); c++){
					if(holder.charAt(b) == googlela.charAt(c)){
						result += alphabet.charAt(c);
						break;
					}
				}
			}
			
			output += "Case #" + (a+1) + ": " + (result);
			if(a != n-1) output += '\n';
		}

		//output and close
		try{
			out.write(output);
			in.close();
			out.close();
		}catch(Exception e){}
	}
}
