package methodEmbedding.Cookie_Clicker_Alpha.S.LYD87;

import java.io.*;


public class CookieClicker {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input2.txt")));
		
	    int test_no = Integer.parseInt(br.readLine());
	    
	    BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));	
	
	    for(int i = 1; i <= test_no; i++)
	    {
	    	String[] data = br.readLine().split(" ");
	    	double C = Double.parseDouble(data[0]);
	    	double F = Double.parseDouble(data[1]);
	    	double X = Double.parseDouble(data[2]);	 
	    	
	    	if ( X <= C)
	    	{
	    		double time = X/2.0;
	    		System.out.println(time);
	    		out.write("Case #");
		    	out.write(String.valueOf(i));
		    	out.write(": ");
	    		out.write(String.valueOf(time));
		    	out.write("\n");
		    	continue;
	    	}
	    	
	    	double time = C/2.0;
 	
	    	double cur_gr = 2;
   	
	    	double cross_X = time * cur_gr * (cur_gr + F) / F;
    	
	    	while (cross_X < X)
	    	{
	    		cur_gr = cur_gr + F;
	    		double newcur_gr = cur_gr + F;
	    		double newtime = time + C/cur_gr;
	    		
	    		cross_X = (newcur_gr * newtime - time * cur_gr) * cur_gr / F - time * cur_gr;
	    		time = newtime;		
	    	}
	    	
	    	double X_remain = X - C;
	    	double extra_time = X_remain / cur_gr;
	    	
	    	time = time + extra_time;
	    	
	    	System.out.println(time);
	    	out.write("Case #");
	    	out.write(String.valueOf(i));
	    	out.write(": ");
	    	out.write(String.valueOf(time));
	    	out.write("\n");
	    }
	    br.close();
	    out.close();
	    
	    
	}

}
