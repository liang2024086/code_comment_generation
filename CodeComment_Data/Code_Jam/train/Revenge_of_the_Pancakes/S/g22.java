package methodEmbedding.Revenge_of_the_Pancakes.S.LYD29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class g22 {
    public static void main(String[] args) throws FileNotFoundException{
//	String filename = "/Users/user/Documents/workspace/javachallenge/g2.txt";
//	System.setIn(new FileInputStream(filename));
	// 
	Scanner in = new Scanner(System.in);		
	int t = in.nextInt();
	String line = in.nextLine();	
	int last = 0;	
	for(int z = 1; z<=t; z++){
	    line = in.nextLine();	
	    System.out.print("Case #"+z+":");
	    char c = line.charAt(0);
	    int total = 0;
	    int k = 0;
	    if (c == '-')
		total = 1;
	    char newc = c;
	    for (int i = 1; i < line.length(); i++) {
		  newc = line.charAt(i);
		  if (newc == c)
		      continue;
		  if (c == '-')
		      total = total;
		  else 
		      total = total + 2;
		  c = newc;		  
	    }
	    
	    System.out.println(" " + total);
	}
    }
}
