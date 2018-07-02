package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1407;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Cookie {
	 public static void main(String[] args) throws FileNotFoundException{
		 double c, x, f, v, time, threshold;
		 v = 2.0;
		 time = 0;
		 int numCase = 0;
	     Scanner sc = new Scanner(new FileReader(args[0]));
         PrintWriter pw = new PrintWriter("cookie.out");
         numCase = sc.nextInt();
         for(int i=0; i<numCase; i++)
         {
    		 v = 2.0;
    		 time = 0;
        	 pw.print("Case #" + (i + 1) + ": ");
        	 c = sc.nextDouble();
        	 f = sc.nextDouble();
        	 x = sc.nextDouble();
        	 
        	 threshold = (x-c)*f/c;
        	 while(v<threshold)
        	 {
        		 time+=c/v;
        		 v += f;	 
        	 }
        	 time += x/v;
        	 DecimalFormat df = new DecimalFormat("#.0000000");
        	 pw.write(df.format(time)+"\n");
         }
         pw.flush();
         pw.close();
         sc.close();
			
	 }
} 
	 
