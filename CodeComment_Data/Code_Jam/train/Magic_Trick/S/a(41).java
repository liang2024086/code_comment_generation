package methodEmbedding.Magic_Trick.S.LYD1949;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class A 
{	
	public static void main(String[] args) throws FileNotFoundException {
		long test = 0L;
		long ans1 = 0L;
		long ans2 = 0L;
		long i = 0L;
		long j = 0L;
		long total = 0L;
		long k = 0L;
		long l = 0L;
		long card = 0L;
		long answer = 0L;
		
		long[] cards = new long[7];
		
		//Scanner sc = new Scanner(new File("f:\\a.txt"));
		//Formatter frm = new Formatter(new File("f:\\a.out"));
		
		Scanner sc = new Scanner(System.in);
		
		test = sc.nextLong();
		
		for(i = 1; i <= test; i++) 
		{	
			answer = 0;
			ans1 = sc.nextLong();
	        total = 0;
	        for(j = 1; j <= 4; j++) 
	        {
	            for(k = 1; k <= 4; k++) {
	            	card = sc.nextLong();
	                if(j == ans1)
	                    cards[(int) k] = card;
	            }
	        }
	        ans2 = sc.nextLong();
	        
	        for(j = 1; j <= 4; j++) 
	        {
	            for(k = 1; k <= 4; k++) 
	            {
	            	card = sc.nextLong();
	                if(j == ans2) 
	                {
	                    for(l = 1; l <= 4; l++) {
	                        if(cards[(int) l] == card) 
	                        {
	                            answer = card;
	                            total++;
	                        }
	                    }
	                }
	            }
	        }

	        if(total == 1)
	        {
	        	System.out.format("Case #%d: %d\n", i,answer);
	        	//comment out below
	        	//frm.format("Case #%d: %d\n", i,answer);
	        }
	        else if(total == 0)
	        {
	        	System.out.format("Case #%d: Volunteer cheated!\n",i);
	        	//comment out below
	        	//frm.format("Case #%d: Volunteer cheated!\n",i);
	        }
	        else
	        {
	        	System.out.format("Case #%d: Bad magician!\n",i);
	        	//comment out below
	        	//frm.format("Case #%d: Bad magician!\n",i);
	        }
	    }
		//comment out below
		//frm.flush();
	}
	
}
