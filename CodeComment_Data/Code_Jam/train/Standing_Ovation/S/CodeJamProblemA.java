package methodEmbedding.Standing_Ovation.S.LYD1701;

/* Programming competition file template
Made by Horatiu Lazu */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.geom.*;
import java.math.*;


class Main{
	public static void main (String [] args){
		new Main();
	}

	public Main(){
		try{
			BufferedReader in;
			//in = new BufferedReader (new InputStreamReader (System.in)); //Used for CCC
			in = new BufferedReader(new FileReader("A-small-attempt0.in")); //Used for JDCC & others
			
			PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
			int testCases = Integer.parseInt(in.readLine());
			for(int qq = 0; qq < testCases; qq++){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int maxShyness = Integer.parseInt(st.nextToken());
				String shyness = st.nextToken(); 
				int [] shynesses = new int[shyness.length()];
				for(int i = 0; i < shyness.length(); i++){
					shynesses[i] += shyness.charAt(i) - '0';
				}
				int sum = 0;
				int required = 0;
				for(int i = 0; i < shyness.length(); i++){
					if (sum < i){
						required += i - sum;
						sum += i - sum;
					}
					sum += shynesses[i];
				}
				out.println("Case #" + (qq+1) + ": " + required);
			}
			
			out.close();
			
		}
		catch(IOException e){
			System.out.println("IO: General");
		}
	}
}
