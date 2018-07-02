package methodEmbedding.Standing_Ovation.S.LYD294;

//
//  CodeJam.java
//  APCS
//
//  Created by Ishaan Gandhi on 2015-04-10.
//  Copyright 2015 Ishaan Gandhi. All rights reserved.
//

import java.util.*;
import java.io.*;

public class CodeJam
{	
	
	public static void main(String[] args) throws IOException
	{
		Scanner infile = new Scanner(new File("A-small-attempt1.in"));
		int lines = Integer.parseInt(infile.nextLine());
		PrintStream outfile = new PrintStream(new FileOutputStream("output.txt"));
		for(int i = 0; i < lines; i++){
			int tally = 0;
			int appl = 0;
			String f = infile.nextLine();
			f = f.substring(2);
			String[] parts =  f.split("");
			for(int p = 0; p < parts.length; p++) {
				String s = parts[p];
				if(appl < p)
				{
					int add = p -appl;
					tally+=add;
					appl+=add;
				}
				appl+=Integer.parseInt(s);
			}          
			int z = i+1;
			outfile.println("Case #"+z+": " + tally);
		}
		infile.close();
	}
		
}
