package methodEmbedding.Standing_Ovation.S.LYD2208;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;


public class CopyOfmagic {

	public static void main(String[] args) throws IOException
	{
		Reader reader = new FileReader("A-small-attempt0.in");
        BufferedReader bufReader = new BufferedReader(reader);
        String x;
        File file = new File("ap1.out");
        FileWriter writer = new FileWriter(file);
    	x=bufReader.readLine();
    	String[] s = null;
    	int tst_cases=Integer.parseInt(x);
    	int i=1;
    	if(tst_cases>=1 && tst_cases<=100)
    	{
    	while(i<=tst_cases)
    	{
    	  x=bufReader.readLine();
    	  s=x.split(" ");
    	  
    	  int j=Integer.parseInt(s[0]);
    	  int prson_needed=0;
    	  int prson_stnding=0;
    	 if(j>=0 && j<=6)
    	 {
    	  for( int z=0;z<=j;z++)
    	  {
    		  	if(prson_stnding<z && Integer.parseInt((String.valueOf(s[1].charAt(z))))!=0)
    		  	{
    		  		  		prson_needed=prson_needed+(z-prson_stnding);
    		  		prson_stnding=prson_stnding +(z-prson_stnding);
    		  	}
    		  	prson_stnding=prson_stnding +Integer.parseInt((String.valueOf(s[1].charAt(z))));
    		
    	  }
    	  writer.write("Case #"+i + ": "+ prson_needed + "\n");
    	 }
    	  
    	  	i++;
    	  }
    	  
    	}
    	writer.close();
    	}
    }


