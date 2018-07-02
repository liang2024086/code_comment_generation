package methodEmbedding.Revenge_of_the_Pancakes.S.LYD821;

import java.util.*;
public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
	     int numCases = input.nextInt();
	     
	     for (int n = 0; n < numCases; n++){
	    	 String s = input.next();
	    	 int count = 0;
	    	 int[] ps = new int[105];
	    	 
	    	 for (int i = 0; i < s.length()+1; i++)
	    		 ps[i]=-1;
	    	 
	    	 for (int i = 0; i < s.length(); i++)
	    	 {
	    		 if(s.charAt(i)=='-')
	    			 ps[i]=0;
	    		 else
	    			 ps[i]=1;
	    	 }
	    	 
	    	 while(true)
	    	 {
	    		 int tmp = ps[0],Ctmp=0;
	    		 for (int i = 1; i < s.length(); i++)
	    		 {
	    			 if(tmp==ps[i])
	    				 Ctmp++;
	    			 else 
	    				 break;
	    		 }
	    		;
	    		 if(Ctmp==s.length()-1&&ps[0]==1)
	    			 break;
	    		 
	    		
	    		 if(tmp==1)
	    			 tmp=0;
	    		 else
	    			 tmp=1;
	    		 
	    		 for (int i = 0; i <= Ctmp; i++)
	    			 ps[i]=tmp;
	    			 count++;
	    	 } 
	    	 
	    	 System.out.printf("Case #%d: %d\n", n + 1, count);
	     }
	}

}
