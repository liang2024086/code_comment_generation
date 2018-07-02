package methodEmbedding.Cookie_Clicker_Alpha.S.LYD465;

import java.util.*;
import java.io.*;

public class Solution{
   
   public static void main(String[] arg) throws Exception{
        Scanner sc=new Scanner(new File("smallinput.txt"));
        int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		   double cost=sc.nextDouble(),extra=sc.nextDouble(),goal=sc.nextDouble();
		   double speed=2,time=0;
		   if(goal<=cost){
		      double temp=goal/2;
			  System.out.format("Case #%d: %.7f%n",(i+1),temp);
		      continue;
		   }
		   time=cost/2;
		   while(true){
		       if(speed*cost/extra+cost>=goal){
			     time+=(goal-cost)/speed;
			     System.out.format("Case #%d: %.7f%n",(i+1),time);
				 break;
			   }else{
			     speed+=extra;
			     time+=cost/speed;
			   }   
		   }
		   
		}
		
   }

}
