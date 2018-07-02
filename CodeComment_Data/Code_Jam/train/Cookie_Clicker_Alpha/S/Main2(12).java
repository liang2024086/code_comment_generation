package methodEmbedding.Cookie_Clicker_Alpha.S.LYD762;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
     public static void main(String[] args) throws IOException {
    	 Scanner in = new Scanner(new File("B-small-attempt0.in"));
    	 PrintStream out=new PrintStream("B-small-attempt0.out");
         
    	 while(in.hasNext()) {
        	 int n=in.nextInt();
        	 for (int k=1;k<=n;k++)
        	 {
        		 double c=in.nextDouble();
        		 double f=in.nextDouble();
        		 double x=in.nextDouble();
            	 
        		 double best=x/2.0;
        		 double make=0.0;
        		 double speed=2.0;
        		 
        		 while (true)
            	 {
        			// out.println(best);
        			 make+=c/speed;
        			 speed=speed+f;
        			 if (best<make+x/speed)
        			 {
        				 break;
        			 }
        			 else
        			 {
        				 best=make+x/speed;
        			 }
            	 }
        		 out.println("Case #"+k+": "+best);
            	 
        	 }
         }   
	}
}
