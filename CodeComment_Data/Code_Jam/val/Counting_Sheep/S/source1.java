package methodEmbedding.Counting_Sheep.S.LYD468;

import java.util.*;
import java.io.*;

import java.util.HashSet;

import java.util.Set;


public class Program1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(new File(args[0]));
	    int X=0,N,i;
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int ii = 1; ii <= t; ++ii) {
		
				 i=1;
				Set set = new HashSet<String>();
				N = in.nextInt();
				if(N==0){
					System.out.println("Case #"+ii+": INSOMNIA");
					continue;
				}
				while(set.size()!=10){
					X = N*i;
					String str = Integer.toString(X);
					String[] list = str.split("|");
					for(String j: list){
						set.add(j);
					}
					//set.addAll(list);
					i++;
				}
				
				System.out.println("Case #"+ii+": "+	X);
	    }
	}

}
