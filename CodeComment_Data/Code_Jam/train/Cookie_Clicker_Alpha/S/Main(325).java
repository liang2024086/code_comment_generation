package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1139;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		System.setIn(new FileInputStream("c:\\B-small-attempt0.in"));
		//System.out.println("Hello, world!");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int i = 1;
		while( i <= N)
		{	
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			
			double time = 0.0;
			
			double speed = 2.0;
			double currentX = X;
			
			double k = (X*F/C - speed)/F;
			// int intk = Math.floor(k);
			
			double j=0.0;
			while (j <= k-1){
				time += (C / (speed + j*F));
				j += 1.0;
			}
			
			time += (X / (speed + j*F));
			
			System.out.println("Case #" + i + ": " + time);
			
			i++;
		}
		
	}

}

