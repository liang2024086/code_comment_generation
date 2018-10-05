package methodEmbedding.Cookie_Clicker_Alpha.S.LYD822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class cookie {

	public static void main(String[] args) throws IOException{
	    double c,f,x,t1,t2=0;
		int tcases,k=1;
		StringTokenizer temp;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
        tcases = Integer.parseInt(br.readLine());
        for(int i=0;i<tcases;i++)
        {
        	t1=0;t2=0;k=1;
        	temp = new StringTokenizer(br.readLine());
        	c= Double.parseDouble(temp.nextToken());
        	f = Double.parseDouble(temp.nextToken());
        	x = Double.parseDouble(temp.nextToken());
        	t1 = x /2;
        	t2 = c/2 + x/(2+f) ;
        	while(t2<t1)
        	{
        		t1 = t2;
        		t2=0;
        		for(int j=0;j<=k;j++)
            	{
            		t2 += c/(2+f*j);	
            	}
        		t2= t2 + x/(2+f*(k+1));
        		k++;
        	}
        	pw.println("Case #" + (i + 1) + ": "+ t1);
        	
        	
        	
        }
        pw.flush();

	}

}
