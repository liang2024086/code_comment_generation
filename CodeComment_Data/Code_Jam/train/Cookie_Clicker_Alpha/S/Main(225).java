package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1594;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader("input.in");
        int[] integers = new int [100];
       // int i=0;
        BufferedWriter out=out= new BufferedWriter(new FileWriter("output.txt"));
        try {
            Scanner input = new Scanner(file);
            int test=input.nextInt();
            //System.out.println("test numbers: "+test);
            int round=0;
            while(test>0){
                   double c,f,x; 
            	c=input.nextDouble();
            	f=input.nextDouble();
            	x=input.nextDouble();
                double cookies=0.0,seconds=0.0;
                double sec=0.0;
                double valueSec=2.0;
                double temp=x;
                double result=0.000000;
               result=x/valueSec;
               round++;
               
               while( temp > c){
                   
                   sec=sec+c/valueSec;
                   
                   valueSec=valueSec+f;
                   result=result< sec+x/valueSec? result:sec+x/valueSec;
                   
                   temp=temp-c;
               }
               
               out.write("Case #"+round+": "+Double.toString(result));
               System.out.println("Case #"+round+": "+Double.toString(result));
         
               test=test-1;
            	if(test!=0)
            		out.write("\n");  	
            }
            out.close();
            input.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
