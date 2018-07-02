package methodEmbedding.Magic_Trick.S.LYD1605;


import java.util.HashSet;
import java.util.Scanner;

public class magic {

	public static void main(String args[] ) throws Exception {
	       

        Scanner sc = new Scanner(System.in);
	        int test = sc.nextInt();
	        
	        int r1, i, sk, val = 0, c, t=1;
	   
	    while(t<=test)
	    {
	        HashSet<Integer> map = new HashSet<Integer>();
	    	c=0;
	    		        
	        r1=sc.nextInt();
	        sk=4-r1;
	        sc.nextLine();
	      	        
	        while(r1>1)
	        	{sc.nextLine();r1--;}
	       
	        for(i=0;i<4;i++)
	        	map.add(sc.nextInt());
	        
	        sc.nextLine();
	        
	        while(sk>0)
        	{sc.nextLine();sk--;}
	        
	        r1=sc.nextInt();
	        sk=4-r1;
	        sc.nextLine();
	        
	             
	        while(r1>1)
        	{sc.nextLine();r1--;}
	       
	        for(i=0;i<4;i++)
	       	if (map.contains(r1=sc.nextInt()))
	        		{c++;val=r1;}
             
	        sc.nextLine();
	        
	        while(sk>0)
        	{sc.nextLine();sk--;}
	        
	       
	       if(c==1)
	    	   System.out.println("Case #"+t+": "+val);
	       else if(c>1)
	    	   System.out.println("Case #"+t+": "+"Bad magician!");
	       else
	    	   System.out.println("Case #"+t+": "+"Volunteer cheated!");
	        
	        map.clear();
	        	
	
	        t++;
	    }
	}
}
