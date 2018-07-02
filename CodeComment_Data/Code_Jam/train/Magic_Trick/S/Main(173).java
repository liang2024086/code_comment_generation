package methodEmbedding.Magic_Trick.S.LYD2100;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		String input = "A-small-attempt0.in";
        String output = "output.txt";
        try {
            Scanner in = new Scanner(new FileReader(input));
            PrintWriter pw = new PrintWriter(output);
            int t=in.nextInt();
    		for(int k=1;k<=t;k++){
    			int m=in.nextInt();
    			int[][] a=new int[4][4];
    			for(int i=0;i<4;i++)
    				for(int j=0;j<4;j++)
    					a[i][j]=in.nextInt();
    			int n=in.nextInt();
    			int[][] b=new int[4][4];
    			for(int i=0;i<4;i++)
    				for(int j=0;j<4;j++)
    					b[i][j]=in.nextInt();
    			int count=0;
    			int x=0;
    			for(int i=0;i<4;i++)
    				for(int j=0;j<4;j++)
    					if(a[m-1][i]==b[n-1][j]){
    						x=a[m-1][i];
    						count++;
    					}
    			pw.print("Case #"+k+": ");
    			if(count==0)
    				pw.println("Volunteer cheated!");
    			if(count==1)
    				pw.println(x);
    			if(count>1)
    				pw.println("Bad magician!");
    			
    		}
            pw.println();
            pw.flush();
            pw.close();
            in.close();
        } catch (FileNotFoundException ex) {
        	
        }
		
	}

}
