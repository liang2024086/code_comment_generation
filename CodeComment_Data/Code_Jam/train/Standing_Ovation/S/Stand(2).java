package methodEmbedding.Standing_Ovation.S.LYD1644;

/**
 * @(#)Stand.java
 *
 *
 * @author Suyash Bhalla
 * @version 1.00 2015/4/11
 */

import java.io.*;

class Stand {

    public static void main(String args[])throws IOException{
    	
    	BufferedReader br=new BufferedReader(new FileReader("A-small-attempt1.in"));
    	PrintWriter out=new PrintWriter(new FileWriter("smallOutput.out"));
    	int T=Integer.parseInt(br.readLine()),Tind=1;
    	while(T--!=0){
    		String inp[]=br.readLine().split(" ");
    		int maxS=Integer.parseInt(inp[0]);
    		int stood=0,required=0,nps=0,temp=0;
    		stood=Integer.parseInt(inp[1].charAt(0)+"");
    		for(int i=1;i<=maxS;i++){
    			nps=Integer.parseInt(inp[1].charAt(i)+"");
    			if(stood<i&&nps!=0){
    				temp=(i-stood);
    				stood+=(nps+temp);
    				required+=temp;
    			}else{
    				stood+=nps;
    			}
    		}
    		out.println("Case #"+Tind+": "+required);
    		Tind++;
    	}
    	out.close();
    }
    
    
}
