package methodEmbedding.Counting_Sheep.S.LYD1071;

// Code by PepeOfMath
//
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException {
    	
        //hard code the file location
        //open file
        //get number of test cases
        File f = new File("A-small-attempt0.in");
        Scanner s = new Scanner(f);
        String line = s.nextLine();
        int T = Integer.parseInt(line);
        
        //open output file
        File f2 = new File("smalloutput.txt");
        PrintWriter p = new PrintWriter(f2);
        
        
        for ( int j = 1; j <= T; j++) {
        	int n = s.nextInt();
        	long num = 0;
        	HashSet<Integer> hs = new HashSet<Integer>();
        	for (int i = 0; i < 10; i++) {
        		hs.add(i);
        	}
        	if (n == 0) {
        		p.println("Case #" + j + ": INSOMNIA");
        	} else {
		    	//do calculation
		    	//need a way to detect when the goal is impossible
		    	//if possible, we just do this:
		    	while(hs.size() > 0) {
		    		num += n;
		    		String nn = "" + num;
		    		for (int i = 0 ; i < nn.length(); i++) {
		    			hs.remove(nn.charAt(i)-'0');
		    		}
		    	}
						
			   	p.println("Case #" + j + ": " + num);
		   	}
        
        }
        
        p.close();
        s.close();
    }
    
}
