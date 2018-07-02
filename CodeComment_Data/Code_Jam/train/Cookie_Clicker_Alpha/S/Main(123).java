package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1209;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		String input = "B-small-attempt0.in";
        String output = "output.txt";
        try {
            Scanner in = new Scanner(new FileReader(input));
            PrintWriter pw = new PrintWriter(output);
            int t=in.nextInt();
			for(int k=1;k<=t;k++){
				double c=in.nextDouble();
				double f=in.nextDouble();
				double x=in.nextDouble();
				Long n=Math.round((x-c)/c-2/f+0.5);
				if(n<0) n=0L;
				double time=0.0;
				for(long i=0;i<n;i++){
					time+=c/(2+i*f);
				}
				time+=x/(2+n*f);
				pw.println("Case #"+k+": "+time);
				
			}
			pw.println();
	        pw.flush();
	        pw.close();
	        in.close();
	    } catch (FileNotFoundException ex) {
	    	
	    }
	}

}
