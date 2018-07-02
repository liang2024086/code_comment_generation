package methodEmbedding.Counting_Sheep.S.LYD1500;

import java.util.*;
import java.io.*;

public class Main {
	
  public static void main(String[] args) throws IOException {
    
    FileInputStream f = new FileInputStream("cases/A-small.in");
    System.setIn(f);
    PrintStream p = new PrintStream(new FileOutputStream("src/A-small.out"));
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    for (int i = 1; i <= t; ++i) {
      
    	int n = in.nextInt();
    	int k = 1;	//constant
      
    	// unordered and unsorted set of all unique digits encountered
    	HashSet<Integer> digits = new HashSet<Integer>();
    	
    	if ( n == 0 )
    		p.println("Case #" + i + ": INSOMNIA");
    	
    	else{
    		
    		while ( digits.size() < 10 ){

    			// stores digits from current iteration of kN
    			HashSet<Integer> d = new HashSet<Integer>();
    			int num = k*n;
//    			System.out.println(num);
    			
    			// get digits
    			while ( num > 0 ){
    				
    				d.add(num%10);
    				num /= 10;
    				
    			}
    			
    			// add to total
    			digits.addAll(d);
    			
    			k++;
    			
    		}
    		
    		p.println("Case #" + i + ": " + (k-1)*n );
    		
    	}
      
    
    }
    
    in.close();
    f.close();
    p.close();
    
  }
}
