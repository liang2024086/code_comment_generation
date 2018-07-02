package methodEmbedding.Counting_Sheep.S.LYD781;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class g {
    public static void main(String[] args){
//	String filename = "/Users/user/Documents/workspace/javachallenge/g.txt";
//	System.setIn(new FileInputStream(filename));
	// 
	Scanner in = new Scanner(System.in);		
	int t = in.nextInt();		
	String str ="";
	int last = 0;	
	for(int z = 1; z<=t; z++){
	    int n = in.nextInt();	
	    System.out.print("Case #"+z+":");
	    boolean[] nums = {false, false, false, false, false, false, false, false, false, false};
	    int all = 10;
	    int m = 2;
	    int k = n;
	    if(n == 0)
		System.out.print(" "+"INSOMNIA");
	    else{
		while(true){		    
		    str = Integer.toString(k);		    
		    for(int j = 0; j < str.length(); j++){
			int index = Character.getNumericValue(str.charAt(j));
			if(nums[index] == false){			   
			    nums[index] = true;
			    all = all - 1;
			}
		    }
		    if(all == 0){			
		    	System.out.print(" "+ k);
			break;	
		    }
		    k = n * m;
		    m = m + 1;	
		}
	    }
	    System.out.println();
	}
    }
}
