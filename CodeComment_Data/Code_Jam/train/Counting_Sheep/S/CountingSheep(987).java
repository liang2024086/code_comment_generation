package methodEmbedding.Counting_Sheep.S.LYD365;

import java.util.*;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
     
      int answer=0;
      for(int i=1;i<=t;i++)
      {
    	  boolean empty=false;
    	  int input=sc.nextInt(); 
    	  if(input == 0)
    	  {
    		  System.out.println("Case #"+i+": INSOMNIA");
    		  continue;
    	  }
    	  ArrayList<Integer> arr=new ArrayList<Integer>();
    	  arr.add(0);
    	  arr.add(1);
    	  arr.add(2);
    	  arr.add(3);
    	  arr.add(4);
    	  arr.add(5);
    	  arr.add(6);
    	  arr.add(7);
    	  arr.add(8);
    	  arr.add(9);
    	  int result = 0;
    	  int counter=1;
    	  while (result <= 0)  
    	  {       
    		  result=counter*input; 
    		  int res=result;
    		 // System.out.println(result+"pa");  
    		  while(result != 0)                                 // breaking down the number into digits and deleting from arraylist 
    		  {   // System.out.println(result);  
    			 int rem= result % 10;     
    			
    			// System.out.println(rem);   
    			 Integer I=rem;
    			 arr.remove(I);
    			// System.out.println(arr);
    			 //}
    			 if(arr.size() == 0)
    			 {
    				 empty=true;
    				 answer=res;
    				 break;
    			 }
    			 result=result/10;
    			 //System.out.println("End of breaking loop "+result);
    		  }
    		  counter++;
    		 // System.out.println("Counter value "+counter);
    		  if(empty == true)
    		  {
    			  break;
    		  }
    	  }
    	  if(empty==true)
    	  {
    		  System.out.println("Case #"+i+": "+ answer );
    	  }
    	 // System.out.println("ENd of input "+i+" Now lets go to "+(i+1));
    	  
      }
      
      
      
	}

}
