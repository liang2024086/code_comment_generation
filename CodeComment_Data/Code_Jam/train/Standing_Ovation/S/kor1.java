package methodEmbedding.Standing_Ovation.S.LYD691;

import java.io.*;
import java.util.Scanner;

public class kor1 {
	public static void main(String[] args)throws IOException{
		int i,j,t,smax,ppl=0,ans=0;
	    
	    String s;
	    //Scanner kb=new Scanner(System.in);
	    Scanner in =new Scanner(new File("D://test.txt"));
	    PrintStream out =new PrintStream(new File("D://out.txt"));
	    t=in.nextInt();
	    
	    for(i=0;i<t;i++){
	        smax=in.nextInt();
	        
	        s=in.next();
	        //System.out.println(s);
	        for(j=0;j<s.length();j++)
	        {
	            if(s.substring(j,j+1).equals("0"))continue;
	            if(j>ppl)
	            {
	                ans+=(j-ppl);
	                ppl+=(j-ppl);

	            }
	                ppl+=Integer.parseInt(s.substring(j,j+1));
	                
	        }

	        out.println("Case #"+(i+1)+": "+ans);
	        //System.out.println("Case #"+(i+1)+": "+ans);
	        ppl=0;
	        ans=0;
	    }
	    in.close();
	    out.close();
	}
}
