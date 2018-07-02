package methodEmbedding.Standing_Ovation.S.LYD1639;

import java.util.Scanner;




public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int testCase;
	Scanner input=new Scanner(System.in);
	testCase=input.nextInt();
	
	for(int i=1;i<=testCase;i++)
	{
	int output=0;
	int maxShy=input.nextInt();
	String audience=input.next();
	int indexOfZero=audience.indexOf("0");
	if(indexOfZero<0)
	{
		output=0;	
	}
	else
	{
		int invite = 0;
		int stand;
		if((Integer.parseInt(audience.substring(0, 1))==0))	
		{  
			//System.out.println("inside first loop");
		    
		 	invite=1;
		 	stand=1;
		}
		else {stand=Integer.parseInt(audience.substring(0, 1));
		  //System.out.println("stand="+stand);
		}
	   for(int k=1;k<=maxShy;k++)
	   {  //System.out.println("inside for stand="+stand);
		   if(stand>=maxShy)
			   break;
		 if(k>stand)
		 {
			 invite=invite+1;
			 stand=stand+1+Integer.parseInt(audience.substring(k, k+1));
		 }
		 else stand=stand+Integer.parseInt(audience.substring(k, k+1));
	   
	   
		   
    

	
	
	}
	   output=invite;
	}
	System.out.println("Case #"+i+":"+" "+output);
	}
}

}
